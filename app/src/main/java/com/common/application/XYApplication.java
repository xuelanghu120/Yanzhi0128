package com.common.application;

import android.support.multidex.MultiDexApplication;

/**
 * Created by 黄笠 on 2016/1/22.
 */
public class XYApplication extends MultiDexApplication {

    public static final String TAG = XYApplication.class.getSimpleName();

    private static XYApplication mApplication;

    public static XYApplication getInstance() {
        return mApplication;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        mApplication = this;
    }
}
