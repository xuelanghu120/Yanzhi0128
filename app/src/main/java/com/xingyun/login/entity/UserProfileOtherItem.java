package com.xingyun.login.entity;

import android.databinding.BaseObservable;

import java.io.Serializable;
import java.util.Date;

public class UserProfileOtherItem extends BaseObservable implements Serializable {

	/**
	 * user_profile_other_item.id 主键
	 * 
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	private Integer id;
	/**
	 * user_profile_other_item.otherid user_profile_other表的主键
	 * 
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	private Integer otherid;
	/**
	 * user_profile_other_item.type 类型：0 文本 1图片
	 * 
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	private Integer type;
	/**
	 * user_profile_other_item.c1 文本或图片路径
	 * 
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	private String c1;
	/**
	 * user_profile_other_item.c2 图片描述或视频描述
	 * 
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	private String c2;
	/**
	 * user_profile_other_item.seq 顺序
	 * 
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	private Integer seq;
	/**
	 * user_profile_other_item.systime 系统时间
	 * 
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	private Date systime;
	
	/**
	 * 图片宽
	 */
	private Integer picWidth;
	/**
	 * 图片高
	 */
	private Integer picHeight;

	/**
	 * user_profile_other_item.id 主键
	 * 
	 * @return the value of user_profile_other_item.id
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * user_profile_other_item.id 主键
	 * 
	 * @param id
	 *            the value for user_profile_other_item.id
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * user_profile_other_item.otherid user_profile_other表的主键
	 * 
	 * @return the value of user_profile_other_item.otherid
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	public Integer getOtherid() {
		return otherid;
	}

	/**
	 * user_profile_other_item.otherid user_profile_other表的主键
	 * 
	 * @param otherid
	 *            the value for user_profile_other_item.otherid
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	public void setOtherid(Integer otherid) {
		this.otherid = otherid;
	}

	/**
	 * user_profile_other_item.type 类型：0 文本 1图片
	 * 
	 * @return the value of user_profile_other_item.type
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	public Integer getType() {
		return type;
	}

	/**
	 * user_profile_other_item.type 类型：0 文本 1图片
	 * 
	 * @param type
	 *            the value for user_profile_other_item.type
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	public void setType(Integer type) {
		this.type = type;
	}

	/**
	 * user_profile_other_item.c1 文本或图片路径
	 * 
	 * @return the value of user_profile_other_item.c1
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */

	public String getC1() {
		return c1;
	}

	/**
	 * user_profile_other_item.c1 文本或图片路径
	 * 
	 * @param c1
	 *            the value for user_profile_other_item.c1
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */

	public void setC1(String c1) {
		this.c1 = c1;
	}

	/**
	 * user_profile_other_item.c2 图片描述或视频描述
	 * 
	 * @return the value of user_profile_other_item.c2
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */

	public String getC2() {
		return c2;
	}

	/**
	 * user_profile_other_item.c2 图片描述或视频描述
	 * 
	 * @param c2
	 *            the value for user_profile_other_item.c2
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */

	public void setC2(String c2) {
		this.c2 = c2;
	}

	/**
	 * user_profile_other_item.seq 顺序
	 * 
	 * @return the value of user_profile_other_item.seq
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	public Integer getSeq() {
		return seq;
	}

	/**
	 * user_profile_other_item.seq 顺序
	 * 
	 * @param seq
	 *            the value for user_profile_other_item.seq
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	public void setSeq(Integer seq) {
		this.seq = seq;
	}

	/**
	 * user_profile_other_item.systime 系统时间
	 * 
	 * @return the value of user_profile_other_item.systime
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */

	public Date getSystime() {
		return systime;
	}

	/**
	 * user_profile_other_item.systime 系统时间
	 * 
	 * @param systime
	 *            the value for user_profile_other_item.systime
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	public void setSystime(Date systime) {
		this.systime = systime;
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 5198627162216688609L;

	public Integer getPicWidth() {
		return picWidth;
	}

	public void setPicWidth(Integer picWidth) {
		this.picWidth = picWidth;
	}

	public Integer getPicHeight() {
		return picHeight;
	}

	public void setPicHeight(Integer picHeight) {
		this.picHeight = picHeight;
	}
}