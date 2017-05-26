package com.kabuki5.espressotesting.commons;

/**
 * Created by Kabuki on 26/05/2017.
 * Optimus Mobile Engineering
 */

public interface BasePresenter<T> {

    void onCreateView(T view);

    void onDestroyView();

}
