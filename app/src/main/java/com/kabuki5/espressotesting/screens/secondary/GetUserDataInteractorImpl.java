package com.kabuki5.espressotesting.screens.secondary;

import com.kabuki5.espressotesting.data.User;

/**
 * Created by Kabuki on 26/05/2017.
 * Optimus Mobile Engineering
 */

class GetUserDataInteractorImpl implements MVP.GetUserDataInteractor {

    private MVP.SecondaryPresenter mPresenter;

    @Override
    public void bindPresenter(MVP.SecondaryPresenter presenter) {
        mPresenter= presenter;
    }



    @Override
    public void getUserData(String id) {
        User user = new User();//RETROFIT CALL
        mPresenter.onUserRetrieved(user);
    }


}
