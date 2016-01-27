package com.common.base.fragment;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;

import com.common.utils.Logger;

import java.lang.reflect.Field;


/**
 * Created by 黄笠 on 2016/1/22.
 */
public abstract class BaseFragment extends Fragment {

    public static final String TAG = "BaseFragment";

    public Context context;
    public View parentView;
    protected InputMethodManager mInputMethodManager;
    public static FragmentManager fragmentManager;

    public abstract int getLayoutId();

    public abstract void init(Bundle savedInstanceState);

    public abstract void createView(LayoutInflater inflater, ViewGroup container, View parentView, Bundle savedInstanceState);

    protected void initTitle() {}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        try {
            Logger.d(TAG, "onCreateView");

            // 设置可以弹出菜单
            setHasOptionsMenu(true);

            if (parentView == null) {
                parentView = inflater.inflate(getLayoutId(), container, false);
                createView(inflater, container, parentView, savedInstanceState);
            }

            ViewGroup rootView = (ViewGroup) parentView.getParent();
            if (rootView != null) {
                rootView.removeView(parentView);
            }

            mInputMethodManager = (InputMethodManager) getActivity().getSystemService(
                    Context.INPUT_METHOD_SERVICE);
        } catch (Exception e) {
            Logger.e(TAG, "onCreateView", e);
        }
        return parentView;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        fragmentManager = getFragmentManager();
        context = getActivity();
        initTitle();
        init(savedInstanceState);
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public void onStart() {
        super.onStart();
    }

    @Override
    public void onResume() {
        super.onResume();
    }

    @Override
    public void onPause() {
        super.onPause();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }

    @Override
    public void onDetach() {
        super.onDetach();
        try {
            Field childFragmentManager = Fragment.class.getDeclaredField("mChildFragmentManager");
            childFragmentManager.setAccessible(true);
            childFragmentManager.set(this, null);

        } catch (NoSuchFieldException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }

    }
}




