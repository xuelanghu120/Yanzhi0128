package com.common.base.activity;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.WindowManager;

import com.common.application.XYApplication;

/**
 * Created by 黄笠 on 2016/1/22.
 */
public abstract class BaseActivity extends Activity{

    public static final String TAG = "BaseActivity";

    protected Context context;

    protected abstract int getLayoutId();

    protected abstract void init();

    protected void initTitle(){}

    protected void initState(Bundle savedInstanceState){}

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        context = this;
        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_HIDDEN | WindowManager.LayoutParams.SOFT_INPUT_ADJUST_RESIZE);
        setContentView(getLayoutId());
        initTitle();
        init();
        initState(savedInstanceState);
        XYApplication.getInstance().addActivity(this);
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
        XYApplication.getInstance().removeActivity(this);
    }


}
