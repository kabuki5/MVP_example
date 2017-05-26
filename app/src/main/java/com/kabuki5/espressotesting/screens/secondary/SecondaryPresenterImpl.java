package com.kabuki5.espressotesting.screens.secondary;

import com.kabuki5.espressotesting.data.User;

/**
 * Created by Kabuki on 26/05/2017.
 * Optimus Mobile Engineering
 */

class SecondaryPresenterImpl implements MVP.SecondaryPresenter {

    private MVP.View mView;
    private MVP.GetUserDataInteractor mInteractor;


    @Override
    public void onCreateView(MVP.View view) {
        mView = view;
        mInteractor = new GetUserDataInteractorImpl();
        mInteractor.bindPresenter(this);
    }

    @Override
    public void onDestroyView() {
        mView = null;
    }

    @Override
    public void getUserData(String id) {
        mInteractor.getUserData(id);
    }

    @Override
    public void onUserRetrieved(User user) {
        if(mView!=null)
            mView.printUserData(user);
    }

}
