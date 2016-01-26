package com.common.base.activity;

import android.app.Activity;
import android.os.Bundle;
import android.os.PersistableBundle;

import com.common.application.XYApplication;

/**
 * Created by 黄笠 on 2016/1/22.
 */
public class BaseActivity extends Activity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        XYApplication.getInstance().addActivity(this);
        super.onCreate(savedInstanceState);
    }

    @Override
    protected void onDestroy() {
        XYApplication.getInstance().removeActivity(this);
        super.onDestroy();
    }
public class BaseActivity extends Activity{

    @Override
    public void onCreate(Bundle savedInstanceState, PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}
