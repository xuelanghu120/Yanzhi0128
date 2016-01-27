package com.xingyun.main;

import android.view.KeyEvent;
import android.view.Window;

import com.common.base.activity.BaseFragmentActivity;
import com.common.utils.Logger;

public class MainActivity extends BaseFragmentActivity {

    public static final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected int getLayoutId() {
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        return R.layout.activity_main;
    }

    @Override
    protected void init() {
        Logger.d(TAG,"init");
    }

    @Override
    public boolean dispatchKeyEvent(KeyEvent event) {
        if (event.getKeyCode() == KeyEvent.KEYCODE_BACK && event.getAction() == KeyEvent.ACTION_DOWN) {
            //app隐藏到后台
            boolean flag = moveTaskToBack(false);
            if (!flag) {
                finish();
                Logger.d(TAG, "[dispatchKeyEvent]" + " key back..." + "...");
            }
            return true;
        }
        return super.dispatchKeyEvent(event);
    }
}
