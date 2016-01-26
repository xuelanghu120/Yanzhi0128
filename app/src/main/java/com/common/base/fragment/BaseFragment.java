package com.common.base.fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;

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

    protected void initTitle() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        context = getActivity();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        parentView = initView(inflater);
        return parentView;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        initData(savedInstanceState);
        super.onActivityCreated(savedInstanceState);
    }

    protected abstract void initData(Bundle savedInstanceState);
    protected abstract View initView(LayoutInflater inflater);

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




