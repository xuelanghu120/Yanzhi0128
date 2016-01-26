package com.common.base.activity;

import android.content.Context;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.KeyEvent;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;

import com.common.application.XYApplication;
import com.common.utils.LocalStringUtils;
import com.common.utils.Logger;

/**
 * Created by 黄笠 on 2016/1/23.
 */
public abstract class BaseFragmentActivity extends FragmentActivity {

    private static final String TAG = "BaseFragmentActivity";

    protected Context context;

    protected InputMethodManager mInputMethodManager;

    protected abstract int getLayoutId();

    protected abstract void init();

    protected void initTitle(){}

    protected void initState(Bundle savedInstanceState){}

    @Override
    public void onCreate(Bundle savedInstanceState, PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        context = this;
        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_HIDDEN | WindowManager.LayoutParams.SOFT_INPUT_ADJUST_RESIZE);
        setContentView(getLayoutId());
        initTitle();
        init();
        initState(savedInstanceState);
        XYApplication.getInstance().addActivity(this);
        mInputMethodManager = (InputMethodManager) getSystemService(INPUT_METHOD_SERVICE);
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

    protected void removeFragment(Fragment fragment) {
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        // transaction.setCustomAnimations(R.anim.slide_left_in,
        // R.anim.slide_right_out);
        transaction.remove(fragment);
        // transaction.commit();
        transaction.commitAllowingStateLoss();
    }

    protected void addFragment(int layoutId, Fragment fragment, boolean addToBackStack,
                               String fragmentTag) {
        if (!LocalStringUtils.isEmpty(fragmentTag)) {
            if (isExistFragment(fragmentTag)) {
                return;
            }
        }
        closeSoftInput();
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        // transaction.setCustomAnimations(R.anim.slide_right_in,
        // R.anim.slide_left_out, R.anim.slide_left_in, R.anim.slide_right_out);
        transaction.add(layoutId, fragment);
        if (addToBackStack) {
            transaction.addToBackStack(fragmentTag);
        }
        transaction.commit();
    }

    protected void addFragmentStateLoss(int layoutId, Fragment fragment, boolean addToBackStack,
                                        String fragmentTag) {
        if (!LocalStringUtils.isEmpty(fragmentTag)) {
            if (isExistFragment(fragmentTag)) {
                return;
            }
        }
        closeSoftInput();
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        // transaction.setCustomAnimations(R.anim.slide_right_in,
        // R.anim.slide_left_out, R.anim.slide_left_in, R.anim.slide_right_out);
        transaction.add(layoutId, fragment);
        if (addToBackStack) {
            transaction.addToBackStack(fragmentTag);
        }
        transaction.commitAllowingStateLoss();
    }

    protected void addFragment(int layoutId, Fragment fragment, boolean addToBackStack) {
        addFragment(layoutId, fragment, addToBackStack, null);
    }

    protected void addFragment(int layoutId, Fragment fragment) {
        addFragment(layoutId, fragment, false);
    }

    protected void replaceFragment(int layoutId, Fragment fragment) {
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(layoutId, fragment);
        transaction.commit();
    }

    protected void replaceFragment(int layoutId, Fragment curFragment, Fragment fragment) {
        try {
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            if (curFragment != null) {
                transaction.detach(curFragment).replace(layoutId, fragment).attach(fragment);
                transaction.commit();
            } else {
                transaction.replace(layoutId, fragment);
                transaction.commit();
            }
        } catch (Exception e) {
            Logger.e(TAG, "replaceFragment", e);
        }
    }

    public Fragment findFaragment(int layoutId) {
        FragmentManager fm = getSupportFragmentManager();
        return fm.findFragmentById(layoutId);
    }

    public Fragment findbyTag(String tag) {
        FragmentManager fm = getSupportFragmentManager();
        return fm.findFragmentByTag(tag);
    }

    protected void hideFragment(Fragment fragment) {
        try {
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            transaction.hide(fragment);
            transaction.commitAllowingStateLoss();
        } catch (Exception e) {
            Logger.e(TAG, "hideFragment", e);
        }
    }

    protected void showFragment(Fragment fragment) {
        try {
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            transaction.show(fragment);
            transaction.commitAllowingStateLoss();
        } catch (Exception e) {
            Logger.e(TAG, "showFragment", e);
        }
    }

    protected void closeSoftInput() {
        if (mInputMethodManager != null && mInputMethodManager.isActive()
                && getCurrentFocus() != null) {
            mInputMethodManager.hideSoftInputFromWindow(getCurrentFocus().getWindowToken(), 0);
            // mInputMethodManager.toggleSoftInput(0,
            // InputMethodManager.HIDE_NOT_ALWAYS);
        }
    }

    public int getStackCount() {
        return getSupportFragmentManager().getBackStackEntryCount();
    }

    public void clearBackStack() {
        getSupportFragmentManager().popBackStack(null, FragmentManager.POP_BACK_STACK_INCLUSIVE);
    }

    public boolean isExistFragment(String tag) {
        boolean exist = false;
        int count = getStackCount();
        for (int i = 0; i < count; i++) {
            String findTag = getSupportFragmentManager().getBackStackEntryAt(i).getName();
            if (tag.equals(findTag)) {
                exist = true;
                break;
            }
        }
        return exist;
    }

    @Override
    public boolean onKeyDown(int keyCode, android.view.KeyEvent event) {
        if(keyCode == KeyEvent.KEYCODE_BACK){
            finish();
            return true;
        }
        return super.onKeyDown(keyCode, event);
    };
}
