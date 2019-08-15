package com.example.designmode.test.all._02_factory._03.view;

public abstract class AbsMapView {
    
    /**
     * Result for IActivityManager.startActivity: an error where the
     * start had to be canceled.
     *
     * @hide
     */
    public abstract void onStart();

    public abstract void onResume();

    public abstract void onDestory();
}