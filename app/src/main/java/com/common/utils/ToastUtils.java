package com.common.utils;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.widget.Toast;

/**
 * Created by 黄笠 on 2015/10/26.
 */
public class ToastUtils {
    private static Toast toast = null;

    private static Handler mHandler = null;

    public static int mDuration = Toast.LENGTH_LONG;

    public static String mMsg = null;

    private static void initToast(final Context context) {
        if (toast == null) {
            mHandler = new Handler(Looper.getMainLooper());
            mHandler.post(new Runnable() {
                @Override
                public void run() {
                    toast = Toast.makeText(context, "", Toast.LENGTH_SHORT);
                }
            });
        }
    }

    private static void show(final int duration, final String msg) {
        if (TextUtils.isEmpty(msg)) {
            return;
        }
        mDuration = duration;
        mMsg = msg;
        mHandler.removeCallbacks(showRunnable);
        mHandler.postDelayed(showRunnable, 100);
    }

    public static Runnable showRunnable = new Runnable() {

        @Override
        public void run() {
            if (toast != null) {
                toast.setDuration(mDuration);
                toast.setText(mMsg);
                toast.show();
            }
        }
    };

    public static void showShortToast(Context context, int resID) {
        if (context == null) {
            return;
        }
        initToast(context);
        show(Toast.LENGTH_SHORT, context.getString(resID));
    }

    public static void showShortToast(Context context, String msg) {
        if (context == null) {
            return;
        }
        initToast(context);
        show(Toast.LENGTH_SHORT, msg);
    }

    public static void showLongToast(Context context, int resID) {
        if (context == null) {
            return;
        }
        initToast(context);
        show(Toast.LENGTH_LONG, context.getString(resID));
    }

    public static void showLongToast(Context context, String msg) {
        if (context == null) {
            return;
        }
        initToast(context);
        show(Toast.LENGTH_LONG, msg);
    }

//    /**
//     * 自定义红色的吐司
//     * @param content
//     * @param msg
//     */
//    public static void showMyToast(Activity content,String msg){
//        LayoutInflater inflater = content.getLayoutInflater();
//        View layout = inflater.inflate(R.layout.toast_layout, null);
//        TextView toastContent = (TextView) layout.findViewById(R.id.toast_content);
//        toastContent.setText(msg);
//        Toast toast = new Toast(content.getApplicationContext());
//        toast.setGravity(Gravity.BOTTOM , 0, 0);
//        toast.setDuration(Toast.LENGTH_SHORT);
//        toast.setView(layout);
//        toast.show();
//    }
//
//    /**
//     * 自定义的红色吐司
//     * @param context
//     * @param resID
//     */
//    public static void showMyToast(Activity context,int resID){
//        LayoutInflater inflater = context.getLayoutInflater();
//        View layout = inflater.inflate(R.layout.toast_layout, null);
//        TextView toastContent = (TextView) layout.findViewById(R.id.toast_content);
//        toastContent.setText(context.getString(resID));
//        Toast toast = new Toast(context.getApplicationContext());
//        toast.setGravity(Gravity.BOTTOM , 0, 0);
//        toast.setDuration(Toast.LENGTH_SHORT);
//        toast.setView(layout);
//        toast.show();
//    }
}
