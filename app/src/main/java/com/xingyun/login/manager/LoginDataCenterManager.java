package com.xingyun.login.manager;

import android.databinding.Observable;
import android.util.Log;

import com.xingyun.login.model.entity.ResultData;
import com.xingyun.login.model.entity.User;
import com.xingyun.login.reqparam.ReqLoginParam;
import com.xingyun.login.reqparam.ReqRegistConfirmParam;
import com.xingyun.login.reqparam.ReqRegistMobileExistParam;
import com.xingyun.login.reqparam.ReqRegistVerification;
import com.xingyun.login.rsp.RspLogin;
import com.xingyun.login.rsp.RspRegist;

import main.mmwork.com.mmworklib.http.callback.NetworkCallback;
import rx.functions.Action1;

/**
 * Created by anzhuo on 2016/1/25.
 */
public class LoginDataCenterManager {
    private volatile static LoginDataCenterManager instance;
    public User user;
    public ResultData<Integer> result;
    public static LoginDataCenterManager getInstance(){
        if (instance==null){
            synchronized (LoginDataCenterManager.class){
                if (instance ==null){
                    instance = new LoginDataCenterManager();
                }
            }
        }
        return instance;
    }

    /**
     * 登陆
     * @param param
     * @param callback
     * @return
     */
    public Observable login(ReqLoginParam param, final NetworkCallback callback){
        LoginNetManager.reqLogin(param, false, callback).subscribe(new Action1<RspLogin>() {
            @Override
            public void call(RspLogin o) {
                    if (o.isSuccess){
                    user = o.user;
                }
            }
        });
        return user;
    }

    /**
     *  手机号是否存在
     * @param param
     * @param callback
     * @return
     */
    public Observable registMobileExist(ReqRegistMobileExistParam param,final NetworkCallback callback){
        LoginNetManager.reqRegistMobileExistParamObservable(param,callback).subscribe(new Action1<RspRegist>() {
            @Override
            public void call(RspRegist o) {
                if(o.isSuccess){
                    result = o.result;
                }
            }
        });
        return result;
    }

    /**
     * 发送验证码
     * @param param
     * @param callback
     * @return
     */
    public Observable registVerication(ReqRegistVerification param,final NetworkCallback callback){
        LoginNetManager.reqRegistVerificationParamObservable(param,callback).subscribe(new Action1<RspRegist>() {
            @Override
            public void call(RspRegist o) {
                if(o.isSuccess){
                    result = o.result;
                }
            }
        });
        return result;
    }

    /**
     * 确认验证码手机号
     * @param param
     * @param callback
     * @return
     */
    public Observable registConfirm(ReqRegistConfirmParam param,final NetworkCallback callback){
        LoginNetManager.reqRegistConfirm(param,callback).subscribe(new Action1<RspLogin>() {
            @Override
            public void call(RspLogin o) {
                if(o.isSuccess){
                    user = o.user;
                }
            }
        });
        return user;
    }

}
