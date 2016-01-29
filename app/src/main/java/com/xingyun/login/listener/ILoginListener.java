package com.xingyun.login.listener;


import com.xingyun.login.rsp.RspLogin;

public interface ILoginListener {
	
	public void onLoginSucc(RspLogin rsp);

	public void onLoginOut();
	
	public void onLoginError(int errorCode);
	
}
