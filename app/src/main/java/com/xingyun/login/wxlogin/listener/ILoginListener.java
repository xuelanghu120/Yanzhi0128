package com.xingyun.login.wxlogin.listener;


import com.xingyun.login.mobile.RspLogin;

public interface ILoginListener {
	
	public void onLoginSucc(RspLogin rsp);

	public void onLoginOut();
	
	public void onLoginError(int errorCode);
	
}
