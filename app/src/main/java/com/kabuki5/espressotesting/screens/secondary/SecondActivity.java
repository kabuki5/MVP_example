package com.kabuki5.espressotesting.screens.secondary;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.kabuki5.espressotesting.data.User;

/**
 * Created by Kabuki on 26/05/2017.
 * Optimus Mobile Engineering
 */

public class SecondActivity extends AppCompatActivity implements MVP.View{

    private MVP.SecondaryPresenter mPresenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mPresenter = new SecondaryPresenterImpl();
        mPresenter.onCreateView(this);
        mPresenter.getUserData("");
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        mPresenter.onDestroyView();
    }

    @Override
    public void printUserData(User user) {

    }

    @Override
    public void setProgressbarEnabled(boolean show) {

    }
}
