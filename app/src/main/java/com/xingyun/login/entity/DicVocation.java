package com.xingyun.login.entity;

import android.databinding.BaseObservable;

import java.io.Serializable;
import java.util.Date;

public class DicVocation extends BaseObservable implements Serializable {

	/**
	 * dic_vocation.id 主键
	 * 
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	private Integer id;
	/**
	 * dic_vocation.tradeid 行业id
	 * 
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	private Integer tradeid;
	/**
	 * dic_vocation.name 职业名
	 * 
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	private String name;
	/**
	 * dic_vocation.seq 顺序
	 * 
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	private Integer seq;
	/**
	 * dic_vocation.isindex 是否首页显示 0：否 1：是
	 * 
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	private Integer isindex;
	/**
	 * dic_vocation.systime 系统时间
	 * 
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	private Date systime;

	/**
	 * dic_vocation.id 主键
	 *
	 * @return the value of dic_vocation.id
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * dic_vocation.id 主键
	 *
	 * @param id
	 *            the value for dic_vocation.id
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * dic_vocation.tradeid 行业id
	 *
	 * @return the value of dic_vocation.tradeid
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	public Integer getTradeid() {
		return tradeid;
	}

	/**
	 * dic_vocation.tradeid 行业id
	 *
	 * @param tradeid
	 *            the value for dic_vocation.tradeid
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	public void setTradeid(Integer tradeid) {
		this.tradeid = tradeid;
	}

	/**
	 * dic_vocation.name 职业名
	 *
	 * @return the value of dic_vocation.name
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	public String getName() {
		return name;
	}

	/**
	 * dic_vocation.name 职业名
	 *
	 * @param name
	 *            the value for dic_vocation.name
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * dic_vocation.seq 顺序
	 *
	 * @return the value of dic_vocation.seq
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	public Integer getSeq() {
		return seq;
	}

	/**
	 * dic_vocation.seq 顺序
	 *
	 * @param seq
	 *            the value for dic_vocation.seq
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	public void setSeq(Integer seq) {
		this.seq = seq;
	}

	/**
	 * dic_vocation.isindex 是否首页显示 0：否 1：是
	 *
	 * @return the value of dic_vocation.isindex
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	public Integer getIsindex() {
		return isindex;
	}

	/**
	 * dic_vocation.isindex 是否首页显示 0：否 1：是
	 *
	 * @param isindex
	 *            the value for dic_vocation.isindex
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	public void setIsindex(Integer isindex) {
		this.isindex = isindex;
	}

	/**
	 * dic_vocation.systime 系统时间
	 *
	 * @return the value of dic_vocation.systime
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */

	public Date getSystime() {
		return systime;
	}

	/**
	 * dic_vocation.systime 系统时间
	 *
	 * @param systime
	 *            the value for dic_vocation.systime
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	public void setSystime(Date systime) {
		this.systime = systime;
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 3515121855623016644L;
}