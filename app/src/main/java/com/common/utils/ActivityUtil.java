package com.common.utils;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.app.Fragment;

import java.io.Serializable;

/**
 * Activity跳转类
 *
 * Created by 黄笠 on 2016/1/27.
 */
public class ActivityUtil {

    public static final String TAG = "ActivityUtil";

    public static void toActivity(Context context, Class<?> cls) {
        Intent intent = new Intent();
        intent.setClass(context, cls);
        ((Activity) context).startActivity(intent);
    }

    public static void toActivity(Context context, Class<?> cls, String key,
                                  Bundle bundle) {
        Intent intent = new Intent();
        intent.setClass(context, cls);
        intent.putExtra(key, bundle);
        ((Activity) context).startActivity(intent);
    }

    public static void toActivity(Context context, Class<?> cls, Bundle bundle) {
        Intent intent = new Intent();
        intent.setClass(context, cls);
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        ((Activity) context).startActivity(intent);
    }

    public static void toActivity(Context context, Class<?> cls, String key,
                                  Parcelable parcelable) {
        Intent intent = new Intent();
        intent.setClass(context, cls);
        intent.putExtra(key, parcelable);
        ((Activity) context).startActivity(intent);
    }

    public static void toActivity(Context context, Class<?> cls, String key,
                                  Serializable serializable) {
        Intent intent = new Intent();
        intent.setClass(context, cls);
        intent.putExtra(key, serializable);
        ((Activity) context).startActivity(intent);
    }

    public static void toActivity(Context context, Class<?> cls, String key,
                                  int value) {
        Intent intent = new Intent();
        intent.setClass(context, cls);
        intent.putExtra(key, value);
        ((Activity) context).startActivity(intent);
    }

    public static void toActivityForResult(Context context, Class<?> cls,
                                           String key, int value, int requestCode) {
        Intent intent = new Intent();
        intent.setClass(context, cls);
        intent.putExtra(key, value);
        ((Activity) context).startActivityForResult(intent, requestCode);
    }

    public static void toActivityForResult(Context context, Class<?> cls,
                                           String key, Bundle bundle, int requestCode) {
        Intent intent = new Intent();
        intent.setClass(context, cls);
        intent.putExtra(key, bundle);
        ((Activity) context).startActivityForResult(intent, requestCode);
    }

    public static void toActivityForResult(Context context, Fragment f,
                                           Class<?> cls, String key, int value, int requestCode) {
        Intent intent = new Intent();
        intent.setClass(context, cls);
        intent.putExtra(key, value);
        f.startActivityForResult(intent, requestCode);
    }

    public static void toActivity(Context context, Class<?> cls, String key,
                                  String value) {
        Intent intent = new Intent();
        intent.setClass(context, cls);
        intent.putExtra(key, value);
        ((Activity) context).startActivity(intent);
    }

    public static void toActivityForResult(Context context, Class<?> cls,
                                           int requestCode) {
        Intent intent = new Intent();
        intent.setClass(context, cls);
        ((Activity) context).startActivityForResult(intent, requestCode);
    }

    public static void toActivityForResult(Context context, Fragment f,
                                           Class<?> cls, int requestCode) {
        Intent intent = new Intent();
        intent.setClass(context, cls);
        f.startActivityForResult(intent, requestCode);
    }

    public static void toActivityForResult(Context context, Class<?> cls,
                                           Bundle bundle, int requestCode) {
        Intent intent = new Intent();
        intent.setClass(context, cls);
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        ((Activity) context).startActivityForResult(intent, requestCode);
    }

    public static void toActivity(Context context, Intent intent) {
        ((Activity) context).startActivity(intent);
    }
}
