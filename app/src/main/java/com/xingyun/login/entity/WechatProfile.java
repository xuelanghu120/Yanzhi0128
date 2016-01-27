package com.xingyun.login.entity;

import android.databinding.BaseObservable;

import java.io.Serializable;

public class WechatProfile extends BaseObservable implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -738379586116009609L;
	/**
	 * 微信ID
	 */
	private String uid;
	/**
	 * 微信昵称
	 */
	private String nickname;
	
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	
}
