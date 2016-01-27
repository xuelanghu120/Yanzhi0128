package com.xingyun.login.entity;

import android.databinding.BaseObservable;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class UserProfileOther extends BaseObservable implements Serializable {

	/**
	 * user_profile_other.id 主键
	 * 
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	private Integer id;
	/**
	 * user_profile_other.userid 用户id
	 * 
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	private String userid;
	/**
	 * user_profile_other.name 名称
	 * 
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	private String name;
	/**
	 * user_profile_other.seq 顺序
	 * 
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	private Integer seq;
	/**
	 * user_profile_other.isshow 是否显示 0：显示 1：隐藏
	 * 
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	private Integer isshow;
	/**
	 * user_profile_other.systime 系统时间
	 * 
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	private Date systime;

	/**
	 * user_profile_other.id 主键
	 * 
	 * @return the value of user_profile_other.id
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * user_profile_other.id 主键
	 * 
	 * @param id
	 *            the value for user_profile_other.id
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * user_profile_other.userid 用户id
	 * 
	 * @return the value of user_profile_other.userid
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	public String getUserid() {
		return userid;
	}

	/**
	 * user_profile_other.userid 用户id
	 * 
	 * @param userid
	 *            the value for user_profile_other.userid
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	public void setUserid(String userid) {
		this.userid = userid;
	}

	/**
	 * user_profile_other.name 名称
	 * 
	 * @return the value of user_profile_other.name
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */

	public String getName() {
		return name;
	}

	/**
	 * user_profile_other.name 名称
	 * 
	 * @param name
	 *            the value for user_profile_other.name
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */

	public void setName(String name) {
		this.name = name;
	}

	/**
	 * user_profile_other.seq 顺序
	 * 
	 * @return the value of user_profile_other.seq
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	public Integer getSeq() {
		return seq;
	}

	/**
	 * user_profile_other.seq 顺序
	 * 
	 * @param seq
	 *            the value for user_profile_other.seq
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	public void setSeq(Integer seq) {
		this.seq = seq;
	}

	/**
	 * user_profile_other.isshow 是否显示 0：显示 1：隐藏
	 * 
	 * @return the value of user_profile_other.isshow
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	public Integer getIsshow() {
		return isshow;
	}

	/**
	 * user_profile_other.isshow 是否显示 0：显示 1：隐藏
	 * 
	 * @param isshow
	 *            the value for user_profile_other.isshow
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	public void setIsshow(Integer isshow) {
		this.isshow = isshow;
	}

	/**
	 * user_profile_other.systime 系统时间
	 * 
	 * @return the value of user_profile_other.systime
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */

	public Date getSystime() {
		return systime;
	}

	/**
	 * user_profile_other.systime 系统时间
	 * 
	 * @param systime
	 *            the value for user_profile_other.systime
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	public void setSystime(Date systime) {
		this.systime = systime;
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1347271252866439550L;
	private List<UserProfileOtherItem> items;

	public List<UserProfileOtherItem> getItems() {
		return items;
	}

	public void setItems(List<UserProfileOtherItem> items) {
		this.items = items;
	}
}