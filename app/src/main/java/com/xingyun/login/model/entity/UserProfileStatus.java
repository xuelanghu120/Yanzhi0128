package com.xingyun.login.model.entity;

import android.databinding.BaseObservable;

import java.io.Serializable;
import java.util.Date;

public class UserProfileStatus extends BaseObservable implements Serializable {

	/**
	 * user_profile_status.id 主键
	 * 
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	private Integer id;
	/**
	 * user_profile_status.userid 用户id
	 * 
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	private String userid;
	/**
	 * user_profile_status.type 用户资料状态（如：qq, mail, phone,msn,weibo）
	 * 
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	private String type;
	/**
	 * user_profile_status.systime 系统时间
	 * 
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	private Date systime;

	/**
	 * user_profile_status.id 主键
	 * 
	 * @return the value of user_profile_status.id
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * user_profile_status.id 主键
	 * 
	 * @param id
	 *            the value for user_profile_status.id
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * user_profile_status.userid 用户id
	 * 
	 * @return the value of user_profile_status.userid
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	public String getUserid() {
		return userid;
	}

	/**
	 * user_profile_status.userid 用户id
	 * 
	 * @param userid
	 *            the value for user_profile_status.userid
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	public void setUserid(String userid) {
		this.userid = userid;
	}

	/**
	 * user_profile_status.type 用户资料状态（如：qq, mail, phone,msn,weibo）
	 * 
	 * @return the value of user_profile_status.type
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	public String getType() {
		return type;
	}

	/**
	 * user_profile_status.type 用户资料状态（如：qq, mail, phone,msn,weibo）
	 * 
	 * @param type
	 *            the value for user_profile_status.type
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * user_profile_status.systime 系统时间
	 * 
	 * @return the value of user_profile_status.systime
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */

	public Date getSystime() {
		return systime;
	}

	/**
	 * user_profile_status.systime 系统时间
	 * 
	 * @param systime
	 *            the value for user_profile_status.systime
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	public void setSystime(Date systime) {
		this.systime = systime;
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 320685551485258300L;
}