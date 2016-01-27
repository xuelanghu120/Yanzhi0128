package com.xingyun.login.entity;

import android.databinding.BaseObservable;

import java.io.Serializable;
import java.util.Date;

public class WeiboProfile extends BaseObservable implements Serializable {

	/**
	 * weibo_profile.id 主键
	 * 
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	private Integer id;
	/**
	 * weibo_profile.userid 用户id
	 * 
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	private String userid;
	/**
	 * weibo_profile.sinauserid 微博用户id
	 * 
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	private String sinauserid;
	/**
	 * weibo_profile.accesstoken accesstoken
	 * 
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	private String accesstoken;
	/**
	 * weibo_profile.expires 失效时间
	 * 
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	private String expires;
	/**
	 * weibo_profile.screen_name 用户昵称
	 * 
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	private String screenName;
	/**
	 * weibo_profile.verified 是否认证 0:未认证 1:已认证
	 * 
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	private Integer verified;
	/**
	 * weibo_profile.verified_reason 认证内容
	 * 
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	private String verifiedReason;
	/**
	 * weibo_profile.fscount 粉丝数
	 * 
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	private Integer fscount;
	/**
	 * weibo_profile.gzcount 关注数
	 * 
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	private Integer gzcount;
	/**
	 * weibo_profile.doublecount 相互关注数
	 * 
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	private Integer doublecount;
	/**
	 * weibo_profile.systime 系统时间
	 * 
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	private Date systime;
	/**
	 * weibo_profile.isloadfirst 是否导过新浪微博关注列表和粉丝列表
	 * 
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	private Integer isloadfirst;

	/**
	 * weibo_profile.id 主键
	 * 
	 * @return the value of weibo_profile.id
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * weibo_profile.id 主键
	 * 
	 * @param id
	 *            the value for weibo_profile.id
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * weibo_profile.userid 用户id
	 * 
	 * @return the value of weibo_profile.userid
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	public String getUserid() {
		return userid;
	}

	/**
	 * weibo_profile.userid 用户id
	 * 
	 * @param userid
	 *            the value for weibo_profile.userid
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	public void setUserid(String userid) {
		this.userid = userid;
	}

	/**
	 * weibo_profile.sinauserid 微博用户id
	 * 
	 * @return the value of weibo_profile.sinauserid
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	public String getSinauserid() {
		return sinauserid;
	}

	/**
	 * weibo_profile.sinauserid 微博用户id
	 * 
	 * @param sinauserid
	 *            the value for weibo_profile.sinauserid
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	public void setSinauserid(String sinauserid) {
		this.sinauserid = sinauserid;
	}

	/**
	 * weibo_profile.accesstoken accesstoken
	 * 
	 * @return the value of weibo_profile.accesstoken
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	public String getAccesstoken() {
		return accesstoken;
	}

	/**
	 * weibo_profile.accesstoken accesstoken
	 * 
	 * @param accesstoken
	 *            the value for weibo_profile.accesstoken
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	public void setAccesstoken(String accesstoken) {
		this.accesstoken = accesstoken;
	}

	/**
	 * weibo_profile.expires 失效时间
	 * 
	 * @return the value of weibo_profile.expires
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	public String getExpires() {
		return expires;
	}

	/**
	 * weibo_profile.expires 失效时间
	 * 
	 * @param expires
	 *            the value for weibo_profile.expires
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	public void setExpires(String expires) {
		this.expires = expires;
	}

	/**
	 * weibo_profile.screen_name 用户昵称
	 * 
	 * @return the value of weibo_profile.screen_name
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	public String getScreenName() {
		return screenName;
	}

	/**
	 * weibo_profile.screen_name 用户昵称
	 * 
	 * @param screenName
	 *            the value for weibo_profile.screen_name
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	public void setScreenName(String screenName) {
		this.screenName = screenName;
	}

	/**
	 * weibo_profile.verified 是否认证 0:未认证 1:已认证
	 * 
	 * @return the value of weibo_profile.verified
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	public Integer getVerified() {
		return verified;
	}

	/**
	 * weibo_profile.verified 是否认证 0:未认证 1:已认证
	 * 
	 * @param verified
	 *            the value for weibo_profile.verified
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	public void setVerified(Integer verified) {
		this.verified = verified;
	}

	/**
	 * weibo_profile.verified_reason 认证内容
	 * 
	 * @return the value of weibo_profile.verified_reason
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	public String getVerifiedReason() {
		return verifiedReason;
	}

	/**
	 * weibo_profile.verified_reason 认证内容
	 * 
	 * @param verifiedReason
	 *            the value for weibo_profile.verified_reason
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	public void setVerifiedReason(String verifiedReason) {
		this.verifiedReason = verifiedReason;
	}

	/**
	 * weibo_profile.fscount 粉丝数
	 * 
	 * @return the value of weibo_profile.fscount
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	public Integer getFscount() {
		return fscount;
	}

	/**
	 * weibo_profile.fscount 粉丝数
	 * 
	 * @param fscount
	 *            the value for weibo_profile.fscount
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	public void setFscount(Integer fscount) {
		this.fscount = fscount;
	}

	/**
	 * weibo_profile.gzcount 关注数
	 * 
	 * @return the value of weibo_profile.gzcount
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	public Integer getGzcount() {
		return gzcount;
	}

	/**
	 * weibo_profile.gzcount 关注数
	 * 
	 * @param gzcount
	 *            the value for weibo_profile.gzcount
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	public void setGzcount(Integer gzcount) {
		this.gzcount = gzcount;
	}

	/**
	 * weibo_profile.doublecount 相互关注数
	 * 
	 * @return the value of weibo_profile.doublecount
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	public Integer getDoublecount() {
		return doublecount;
	}

	/**
	 * weibo_profile.doublecount 相互关注数
	 * 
	 * @param doublecount
	 *            the value for weibo_profile.doublecount
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	public void setDoublecount(Integer doublecount) {
		this.doublecount = doublecount;
	}

	/**
	 * weibo_profile.systime 系统时间
	 * 
	 * @return the value of weibo_profile.systime
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */

	public Date getSystime() {
		return systime;
	}

	/**
	 * weibo_profile.systime 系统时间
	 * 
	 * @param systime
	 *            the value for weibo_profile.systime
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	public void setSystime(Date systime) {
		this.systime = systime;
	}

	/**
	 * weibo_profile.isloadfirst 是否导过新浪微博关注列表和粉丝列表
	 * 
	 * @return the value of weibo_profile.isloadfirst
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	public Integer getIsloadfirst() {
		return isloadfirst;
	}

	/**
	 * weibo_profile.isloadfirst 是否导过新浪微博关注列表和粉丝列表
	 * 
	 * @param isloadfirst
	 *            the value for weibo_profile.isloadfirst
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	public void setIsloadfirst(Integer isloadfirst) {
		this.isloadfirst = isloadfirst;
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 6036856442040556394L;
}