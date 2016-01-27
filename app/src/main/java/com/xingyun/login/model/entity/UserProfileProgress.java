package com.xingyun.login.model.entity;

import android.databinding.BaseObservable;

import java.io.Serializable;
import java.util.Date;

public class UserProfileProgress extends BaseObservable implements Serializable {
	/**
	 * user_profile_progress.id 主键
	 * 
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	private Integer id;
	/**
	 * user_profile_progress.userid 用户id
	 * 
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	private String userid;
	/**
	 * user_profile_progress.isfinish_nickname 昵称域名是否设置 0：未设置 1：已设置
	 * 
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	private Integer isfinishNickname;
	/**
	 * user_profile_progress.isfinish_logourl 上传头像是否设置 0：未设置 1：已设置
	 * 
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	private Integer isfinishLogourl;
	/**
	 * user_profile_progress.isfinish_contact 联系方式是否设置 0：未设置 1：已设置
	 * 
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	private Integer isfinishContact;
	/**
	 * user_profile_progress.isfinish_profile 档案是否设置 0：未设置 1：已设置
	 * 
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	private Integer isfinishProfile;
	/**
	 * user_profile_progress.isfinish_skill 职业技能是否设置 0：未设置 1：已设置
	 * 
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	private Integer isfinishSkill;
	/**
	 * user_profile_progress.applystatus 申请状态 0：未升级 1：申请中 2：申请失败
	 * 
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	private Integer applystatus;
	/**
	 * user_profile_progress.systime 系统时间
	 * 
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	private Date systime;
	/**
	 * user_profile_progress.isfinish_email Email是否设置 0：未设置 1：已设置
	 * 
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	private Integer isfinishEmail;
	/**
	 * user_profile_progress.isfinish_mobile 手机是否设置 0：未设置 1：已设置
	 * 
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	private Integer isfinishMobile;
	/**
	 * user_profile_progress.isfinish_trade 行业是否设置 0：未设置 1：已设置
	 * 
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	private Integer isfinishTrade;

	/**
	 * user_profile_progress.id 主键
	 * 
	 * @return the value of user_profile_progress.id
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * user_profile_progress.id 主键
	 * 
	 * @param id
	 *            the value for user_profile_progress.id
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * user_profile_progress.userid 用户id
	 * 
	 * @return the value of user_profile_progress.userid
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	public String getUserid() {
		return userid;
	}

	/**
	 * user_profile_progress.userid 用户id
	 * 
	 * @param userid
	 *            the value for user_profile_progress.userid
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	public void setUserid(String userid) {
		this.userid = userid;
	}

	/**
	 * user_profile_progress.isfinish_nickname 昵称域名是否设置 0：未设置 1：已设置
	 * 
	 * @return the value of user_profile_progress.isfinish_nickname
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	public Integer getIsfinishNickname() {
		return isfinishNickname;
	}

	/**
	 * user_profile_progress.isfinish_nickname 昵称域名是否设置 0：未设置 1：已设置
	 * 
	 * @param isfinishNickname
	 *            the value for user_profile_progress.isfinish_nickname
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	public void setIsfinishNickname(Integer isfinishNickname) {
		this.isfinishNickname = isfinishNickname;
	}

	/**
	 * user_profile_progress.isfinish_logourl 上传头像是否设置 0：未设置 1：已设置
	 * 
	 * @return the value of user_profile_progress.isfinish_logourl
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	public Integer getIsfinishLogourl() {
		return isfinishLogourl;
	}

	/**
	 * user_profile_progress.isfinish_logourl 上传头像是否设置 0：未设置 1：已设置
	 * 
	 * @param isfinishLogourl
	 *            the value for user_profile_progress.isfinish_logourl
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	public void setIsfinishLogourl(Integer isfinishLogourl) {
		this.isfinishLogourl = isfinishLogourl;
	}

	/**
	 * user_profile_progress.isfinish_contact 联系方式是否设置 0：未设置 1：已设置
	 * 
	 * @return the value of user_profile_progress.isfinish_contact
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	public Integer getIsfinishContact() {
		return isfinishContact;
	}

	/**
	 * user_profile_progress.isfinish_contact 联系方式是否设置 0：未设置 1：已设置
	 * 
	 * @param isfinishContact
	 *            the value for user_profile_progress.isfinish_contact
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	public void setIsfinishContact(Integer isfinishContact) {
		this.isfinishContact = isfinishContact;
	}

	/**
	 * user_profile_progress.isfinish_profile 档案是否设置 0：未设置 1：已设置
	 * 
	 * @return the value of user_profile_progress.isfinish_profile
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	public Integer getIsfinishProfile() {
		return isfinishProfile;
	}

	/**
	 * user_profile_progress.isfinish_profile 档案是否设置 0：未设置 1：已设置
	 * 
	 * @param isfinishProfile
	 *            the value for user_profile_progress.isfinish_profile
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	public void setIsfinishProfile(Integer isfinishProfile) {
		this.isfinishProfile = isfinishProfile;
	}

	/**
	 * user_profile_progress.isfinish_skill 职业技能是否设置 0：未设置 1：已设置
	 * 
	 * @return the value of user_profile_progress.isfinish_skill
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	public Integer getIsfinishSkill() {
		return isfinishSkill;
	}

	/**
	 * user_profile_progress.isfinish_skill 职业技能是否设置 0：未设置 1：已设置
	 * 
	 * @param isfinishSkill
	 *            the value for user_profile_progress.isfinish_skill
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	public void setIsfinishSkill(Integer isfinishSkill) {
		this.isfinishSkill = isfinishSkill;
	}

	/**
	 * user_profile_progress.applystatus 申请状态 0：未升级 1：申请中 2：申请失败
	 * 
	 * @return the value of user_profile_progress.applystatus
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	public Integer getApplystatus() {
		return applystatus;
	}

	/**
	 * user_profile_progress.applystatus 申请状态 0：未升级 1：申请中 2：申请失败
	 * 
	 * @param applystatus
	 *            the value for user_profile_progress.applystatus
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	public void setApplystatus(Integer applystatus) {
		this.applystatus = applystatus;
	}

	/**
	 * user_profile_progress.systime 系统时间
	 * 
	 * @return the value of user_profile_progress.systime
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */

	public Date getSystime() {
		return systime;
	}

	/**
	 * user_profile_progress.systime 系统时间
	 * 
	 * @param systime
	 *            the value for user_profile_progress.systime
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	public void setSystime(Date systime) {
		this.systime = systime;
	}

	/**
	 * user_profile_progress.isfinish_email Email是否设置 0：未设置 1：已设置
	 * 
	 * @return the value of user_profile_progress.isfinish_email
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	public Integer getIsfinishEmail() {
		return isfinishEmail;
	}

	/**
	 * user_profile_progress.isfinish_email Email是否设置 0：未设置 1：已设置
	 * 
	 * @param isfinishEmail
	 *            the value for user_profile_progress.isfinish_email
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	public void setIsfinishEmail(Integer isfinishEmail) {
		this.isfinishEmail = isfinishEmail;
	}

	/**
	 * user_profile_progress.isfinish_mobile 手机是否设置 0：未设置 1：已设置
	 * 
	 * @return the value of user_profile_progress.isfinish_mobile
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	public Integer getIsfinishMobile() {
		return isfinishMobile;
	}

	/**
	 * user_profile_progress.isfinish_mobile 手机是否设置 0：未设置 1：已设置
	 * 
	 * @param isfinishMobile
	 *            the value for user_profile_progress.isfinish_mobile
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	public void setIsfinishMobile(Integer isfinishMobile) {
		this.isfinishMobile = isfinishMobile;
	}

	/**
	 * user_profile_progress.isfinish_trade 行业是否设置 0：未设置 1：已设置
	 * 
	 * @return the value of user_profile_progress.isfinish_trade
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	public Integer getIsfinishTrade() {
		return isfinishTrade;
	}

	/**
	 * user_profile_progress.isfinish_trade 行业是否设置 0：未设置 1：已设置
	 * 
	 * @param isfinishTrade
	 *            the value for user_profile_progress.isfinish_trade
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	public void setIsfinishTrade(Integer isfinishTrade) {
		this.isfinishTrade = isfinishTrade;
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 805196721215083694L;

	/**
	 * 需要更新资料
	 * 
	 * @return
	 */
	public boolean needFillProfile() {
		if (Integer.valueOf(0).equals(isfinishNickname)
				|| Integer.valueOf(0).equals(isfinishLogourl)
				|| Integer.valueOf(0).equals(isfinishContact)
				|| Integer.valueOf(0).equals(isfinishProfile)
				|| Integer.valueOf(0).equals(isfinishSkill)) {
			return true;
		}
		return false;
	}

	public boolean mobileNeedFillProfile() {
		if (Integer.valueOf(0).equals(isfinishNickname)
				|| Integer.valueOf(0).equals(isfinishEmail)) {
			return true;
		}
		return false;
	}
}