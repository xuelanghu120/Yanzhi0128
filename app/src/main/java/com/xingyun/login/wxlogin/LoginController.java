package com.xingyun.login.wxlogin;

import android.content.Context;

import com.common.common.XYConstant;
import com.common.utils.Logger;
import com.common.utils.SpUtil;
import com.tencent.mm.sdk.modelmsg.SendAuth;
import com.tencent.mm.sdk.openapi.IWXAPI;
import com.tencent.mm.sdk.openapi.WXAPIFactory;
import com.xingyun.login.mobile.ReqLoginParam;
import com.xingyun.login.mobile.RspLogin;
import com.xingyun.login.model.entity.User;
import com.xingyun.login.wxlogin.cache.UserCache;
import com.xingyun.login.wxlogin.entity.PWeChatEntity;
import com.xingyun.login.wxlogin.listener.ILoginListener;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import main.mmwork.com.mmworklib.http.callback.NetworkCallback;

/***
 * 登陆控制器
 *
 * @date 2015/10/23
 */
public class LoginController implements NetworkCallback<RspLogin> {
    private final String TAG = "LoginController";
    private static volatile LoginController instance;
    private IWXAPI api = null;
    private List<Integer> mReqList;
    private Set<ILoginListener> mSet;

    public static final int ERRORCODE_AUTH_DENIED = 10;    		//授权禁止
    public static final int ERRORCODE_ERR_SENT_FAILED = 11;    //发送失败
    public static final int ERRORCODE_ERR_UNSUPPORT = 12;    	//不支持授权登陆
    public static final int ERRORCODE_USER_CANCLE = 13;        //用户取消
    public static final int ERRORCODE_JSON_NULL = 14;    		//json为null
    public static final int ERRORCODE_JSON_PARSE_ERROR = 15;    //json解析错误

    private RspLogin mRsp;

    private LoginController() {
        mReqList = new ArrayList<Integer>();
        mSet = new HashSet<ILoginListener>();
    }

    public synchronized static final LoginController getInstance() {
        if (instance == null) {
            synchronized (LoginController.class) {
                if (instance == null) {
                    instance = new LoginController();
                }
            }
        }
        return instance;
    }

    /**
     * 根据微信授权得到的对象登陆自己的接口
     * @param entity
     * @return
     */
    public void onLogin(PWeChatEntity entity) {
        ReqLoginParam param = new ReqLoginParam();
        param.type = "weChat";
        param.userid = entity.openid;
        param.token =entity.access_token;
        param.refreshToken = entity.refresh_token;
        param.expires = entity.expires_in+"";
        com.xingyun.login.manager.LoginDataCenterManager.getInstance().login(param, this);
    }

    public synchronized static void initializeInstance() {
        instance = null;
    }
    //授权成功以后的回调使用
    public void registListener(ILoginListener mListener) {
        mSet.add(mListener);
    }
    //授权成功以后的回调使用
    public void unRegistListener(ILoginListener mListener) {
        mSet.remove(mListener);
    }

    /***
     * 微信登陆
     * 发起授权登陆的第一步,发送参数
     * scope应用授权作用域，如获取用户个人信息则填写snsapi_userinfo
     * state授权成功后原样带回
     * 返回值 int暂时没有用到
     */
    public int onWeChatLogin(Context context) {
        //注册应用
        if (api == null) {
            api = WXAPIFactory.createWXAPI(context, XYConstant.WX_APP_ID,true);
            api.registerApp(XYConstant.WX_APP_ID);
        }
        //发送请求
        SendAuth.Req req = new SendAuth.Req();
        req.scope = "snsapi_userinfo";
        req.state = "none";
        mReqList.add(1);
        api.sendReq(req);
        //发送成功后再wxEntityactivity中回调结果
        return -1;
    }
    public boolean isMyReqEmpty() {
        return mReqList.size() == 0;
    }

    public void onLoginResult(boolean succ, int errorCode, RspLogin rsp) {
        if (succ) {
            initCache(rsp.user);
            initSp(rsp.user);
            this.mRsp = rsp;
        }
        for (ILoginListener listener : mSet) {
            listener.onLoginError(errorCode);
        }
    }

    //登陆成功后保存到本地文件中
    private void initSp(User user) {
        SpUtil.saveLogin(user);
    }

    //登陆成功后设置内存
    private void initCache(User user) {
        UserCache.user =user;
        UserCache.token =user.token;
    }

    //退出登录
    public void onLoginOut() {
        initializeInstance();
        clearMyReq();
        UserCache.clean();
        SpUtil.clearLoginInfo();
        Logger.d(TAG, "[onLoginOut]" + "weixin登陆退出");
    }

    //清楚微信登陆请求
    public void clearMyReq() {
        mReqList.clear();
    }


    @Override
    public void onSucessed(RspLogin rsp) {
        User user = rsp.user;
        if (null==user){

        }else {
            onLoginResult(true, 0, rsp);
            Logger.d(TAG, "[dotask]" + rsp.user.toString() + "微信登陆成功");
        }

    }

    @Override
    public void onFilled(int code, String msg) {

    }
}
