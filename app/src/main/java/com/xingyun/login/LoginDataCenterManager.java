package com.xingyun.login;

//import com.xingyun.login.Entity.model.entity.User;

import java.util.Observable;

import main.mmwork.com.mmworklib.http.callback.NetworkCallback;
import rx.functions.Action1;

/**
 * Created by anzhuo on 2016/1/25.
 */
public class LoginDataCenterManager {
    private volatile static LoginDataCenterManager instance;
    public String user;
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

    public String login(ReqLoginParam param, final NetworkCallback callback){
        LoginNerManager.reqLogin(param, false, callback).subscribe(new Action1<RspLogin>() {
            @Override
            public void call(RspLogin o) {
                if (o.isSuccess){
                    user = o.user;
                }
            }
        });
        return user;
    }
}
