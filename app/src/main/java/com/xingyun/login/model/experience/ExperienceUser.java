package com.xingyun.login.model.experience;

import android.databinding.BaseObservable;

import java.io.Serializable;
/**
 * 体验用户
 * 
 * @author ShimonXin
 * 
 */
public class ExperienceUser extends BaseObservable implements Serializable{
	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -4322109181514837030L;
	String userid; // 用户ID
	String logourl; // 头像

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getLogourl() {
		return logourl;
	}

	public void setLogourl(String logourl) {
		this.logourl = logourl;
	}
}
