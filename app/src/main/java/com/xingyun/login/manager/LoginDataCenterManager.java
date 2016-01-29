package com.xingyun.login.manager;

import android.databinding.Observable;
import com.xingyun.login.reqparam.ReqLoginParam;
import com.xingyun.login.rsp.RspLogin;
import com.xingyun.login.model.entity.User;
import com.xingyun.login.rsp.RspRegistMobileExist;
import com.xingyun.login.rsp.RspRegistVerification;

import main.mmwork.com.mmworklib.http.callback.NetworkCallback;
import rx.functions.Action1;

/**
 * Created by anzhuo on 2016/1/25.
 */
public class LoginDataCenterManager {
    private volatile static LoginDataCenterManager instance;
    public User user;
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


    public User login(ReqLoginParam param, final NetworkCallback callback){
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
     * @param callback
     * @return
     */
    public Observable registMobileExist(String mobile,final NetworkCallback callback){
        LoginNetManager.reqRegistMobileExistParamObservable(mobile,callback).subscribe(new Action1<RspRegistMobileExist>() {
            @Override
            public void call(RspRegistMobileExist o) {
                if(o.isSuccess){
//                   int i =  o.result.result;
                }
            }
        });
        return null;
    }

    /**
     * 发送验证码
     * @param callback
     * @return
     */
    public void registVerication(String mobile,String password,final NetworkCallback callback){
        LoginNetManager.reqRegistVerificationParamObservable(mobile,password,callback).subscribe(new Action1<RspRegistVerification>() {
            @Override
            public void call(RspRegistVerification o) {
                if(o.isSuccess){
                }
            }
        });
    }

    /**
     * 确认验证码手机号
     * @param callback
     * @return
     */
    public Observable registConfirm(String mobile,String code,final NetworkCallback callback){
        LoginNetManager.reqRegistConfirm(mobile,code,callback).subscribe(new Action1<RspLogin>() {
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
