package com.xingyun.login;

import com.common.common.Global;
import main.mmwork.com.mmworklib.http.HttpWork;
import main.mmwork.com.mmworklib.http.callback.NetworkCallback;
import rx.Observable;

/**
 * Created by anzhuo on 2016/1/25.
 */
public class LoginNerManager {
    public static Observable<RspLogin> reqLogin(ReqLoginParam param ,boolean needCache, NetworkCallback<RspLogin> callback){
        return HttpWork.getInstace(Global.getContext()).post(param,RspLogin.class,callback,needCache);
    }
}
