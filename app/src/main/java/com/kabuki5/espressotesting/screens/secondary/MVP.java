package com.kabuki5.espressotesting.screens.secondary;

import com.kabuki5.espressotesting.commons.BaseInteractor;
import com.kabuki5.espressotesting.commons.BasePresenter;
import com.kabuki5.espressotesting.data.User;

/**
 * Created by Kabuki on 26/05/2017.
 * Optimus Mobile Engineering
 */

interface MVP {

    interface View {
        void printUserData(User user);

        void setProgressbarEnabled(boolean show);
    }

    interface SecondaryPresenter extends BasePresenter<View> {
        void getUserData(String id);

        void onUserRetrieved(User user);
    }

    interface GetUserDataInteractor extends BaseInteractor<SecondaryPresenter> {
        void getUserData(String id);
    }



}
