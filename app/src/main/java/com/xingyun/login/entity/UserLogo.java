package com.xingyun.login.entity;

import android.databinding.BaseObservable;

import java.io.Serializable;
import java.util.Date;

public class UserLogo extends BaseObservable implements Serializable {

	/**
	 * user_logo.id 主键
	 * 
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	private Integer id;
	/**
	 * user_logo.userid 用户id
	 * 
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	private String userid;
	/**
	 * user_logo.logourl 图片路径
	 * 
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	private String logourl;
	/**
	 * user_logo.seq 顺序
	 * 
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	private Integer seq;
	/**
	 * user_logo.systime 系统时间
	 * 
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	private Date systime;

	/**
	 * user_logo.id 主键
	 * 
	 * @return the value of user_logo.id
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * user_logo.id 主键
	 * 
	 * @param id
	 *            the value for user_logo.id
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * user_logo.userid 用户id
	 * 
	 * @return the value of user_logo.userid
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	public String getUserid() {
		return userid;
	}

	/**
	 * user_logo.userid 用户id
	 * 
	 * @param userid
	 *            the value for user_logo.userid
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	public void setUserid(String userid) {
		this.userid = userid;
	}

	/**
	 * user_logo.logourl 图片路径
	 * 
	 * @return the value of user_logo.logourl
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	public String getLogourl() {
		return logourl;
	}

	/**
	 * user_logo.logourl 图片路径
	 * 
	 * @param logourl
	 *            the value for user_logo.logourl
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	public void setLogourl(String logourl) {
		this.logourl = logourl;
	}

	/**
	 * user_logo.seq 顺序
	 * 
	 * @return the value of user_logo.seq
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	public Integer getSeq() {
		return seq;
	}

	/**
	 * user_logo.seq 顺序
	 * 
	 * @param seq
	 *            the value for user_logo.seq
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	public void setSeq(Integer seq) {
		this.seq = seq;
	}

	/**
	 * user_logo.systime 系统时间
	 * 
	 * @return the value of user_logo.systime
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */

	public Date getSystime() {
		return systime;
	}

	/**
	 * user_logo.systime 系统时间
	 * 
	 * @param systime
	 *            the value for user_logo.systime
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	public void setSystime(Date systime) {
		this.systime = systime;
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 7952337066942601020L;
}