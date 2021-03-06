package com.xingyun.login.manager;

import com.common.common.Global;
import com.xingyun.login.reqparam.ReqRegistConfirmParam;
import com.xingyun.login.reqparam.ReqLoginParam;
import com.xingyun.login.reqparam.ReqRegistMobileExistParam;
import com.xingyun.login.reqparam.ReqRegistVerification;
import com.xingyun.login.rsp.RspLogin;
import com.xingyun.login.rsp.RspRegistMobileExist;
import com.xingyun.login.rsp.RspRegistVerification;

import main.mmwork.com.mmworklib.http.HttpWork;
import main.mmwork.com.mmworklib.http.callback.NetworkCallback;
import rx.Observable;

/**
 * Created by anzhuo on 2016/1/25.
 */
public class LoginNetManager {
    /**
     * 登陆
     * @param param
     * @param needCache
     * @param callback
     * @return
     */
    public static Observable<RspLogin> reqLogin(ReqLoginParam param ,boolean needCache, NetworkCallback<RspLogin> callback){
        return HttpWork.getInstace(Global.getContext()).post(param,RspLogin.class,callback,needCache);
    }

    /**
     * 注册-手机号是否存在
     * @param callback
     * @return
     */
    public static Observable<RspRegistMobileExist> reqRegistMobileExistParamObservable(String mobile, NetworkCallback<RspRegistMobileExist> callback){
        ReqRegistMobileExistParam param = new ReqRegistMobileExistParam();
        param.mobile = mobile;
        return HttpWork.getInstace(Global.getContext()).post(param,RspRegistMobileExist.class,callback,false);
    }

    /**
     * 注册-发送验证码
     * @param callback
     * @return
     */
    public static Observable<RspRegistVerification> reqRegistVerificationParamObservable(String mobile, String password, NetworkCallback<RspRegistVerification> callback){
        ReqRegistVerification param = new ReqRegistVerification();
        param.mobile = mobile;
        param.password = password;
        return HttpWork.getInstace(Global.getContext()).post(param,RspRegistVerification.class,callback,false);
    }

    /**
     * 注册- 确认验证码手机号
     * @param callback
     * @return
     */
    public static Observable<RspLogin> reqRegistConfirm(String mobile,String code,NetworkCallback<RspLogin> callback){
        ReqRegistConfirmParam param = new ReqRegistConfirmParam();
        param.mobile = mobile;
        param.code = code;
        return HttpWork.getInstace(Global.getContext()).post(param,RspLogin.class,callback,false);
    }
}
