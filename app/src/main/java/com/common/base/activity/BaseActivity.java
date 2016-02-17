package com.common.base.activity;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.WindowManager;

import com.common.application.XYApplication;
import com.common.common.Global;
import com.umeng.analytics.MobclickAgent;

/**
 * Created by 黄笠 on 2016/1/22.
 */
public abstract class BaseActivity extends Activity {
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
        Global.isPageFont =true;
        MobclickAgent.onResume(this);//友盟统计
        MobclickAgent.onPageStart("SplashScreen"); //统计页面(仅有Activity的应用中SDK自动调用，不需要单独写。"SplashScreen"为页面名称，可自定义)

//        MobclickAgent.onEvent(Context context, String eventId);
//        context 指当前的Activity
//        eventId 为当前统计的事件ID。
        super.onResume();
    }

    @Override
    protected void onPause() {
        Global.isPageFont =false;
        MobclickAgent.onPause(this);//友盟统计
        MobclickAgent.onPageEnd("SplashScreen"); // （仅有Activity的应用中SDK自动调用，不需要单独写）保证 onPageEnd 在onPause 之前调用,因为 onPause 中会保存信息。"SplashScreen"为页面名称，可自定义
        super.onPause();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        XYApplication.getInstance().removeActivity(this);
    }
}
