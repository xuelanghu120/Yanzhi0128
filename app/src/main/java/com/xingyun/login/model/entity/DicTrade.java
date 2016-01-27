package com.xingyun.login.model.entity;

import android.databinding.BaseObservable;

import java.io.Serializable;
import java.util.Date;

public class DicTrade extends BaseObservable implements Serializable {

	/**
	 * dic_trade.id 主键
	 * 
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	private Integer id;
	/**
	 * dic_trade.name 行业名
	 * 
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	private String name;
	/**
	 * dic_trade.englishname 行业英文名
	 * 
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	private String englishname;
	/**
	 * dic_trade.iconname 行业标签名
	 * 
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	private String iconname;
	/**
	 * dic_trade.seq 顺序
	 * 
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	private Integer seq;
	/**
	 * dic_trade.systime 系统时间
	 * 
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	private Date systime;
	/**
	 * dic_trade.isprotect 是否受保护 0：否，1：是
	 * 
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	private Integer isprotect;
	/**
	 * dic_trade.showrencai 是否在人才目录显示 0:不显示 1:显示
	 * 
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	private Integer showrencai;

	/**
	 * dic_trade.id 主键
	 * 
	 * @return the value of dic_trade.id
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * dic_trade.id 主键
	 * 
	 * @param id
	 *            the value for dic_trade.id
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * dic_trade.name 行业名
	 * 
	 * @return the value of dic_trade.name
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	public String getName() {
		return name;
	}

	/**
	 * dic_trade.name 行业名
	 * 
	 * @param name
	 *            the value for dic_trade.name
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * dic_trade.englishname 行业英文名
	 * 
	 * @return the value of dic_trade.englishname
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	public String getEnglishname() {
		return englishname;
	}

	/**
	 * dic_trade.englishname 行业英文名
	 * 
	 * @param englishname
	 *            the value for dic_trade.englishname
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	public void setEnglishname(String englishname) {
		this.englishname = englishname;
	}

	/**
	 * dic_trade.iconname 行业标签名
	 * 
	 * @return the value of dic_trade.iconname
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	public String getIconname() {
		return iconname;
	}

	/**
	 * dic_trade.iconname 行业标签名
	 * 
	 * @param iconname
	 *            the value for dic_trade.iconname
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	public void setIconname(String iconname) {
		this.iconname = iconname;
	}

	/**
	 * dic_trade.seq 顺序
	 * 
	 * @return the value of dic_trade.seq
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	public Integer getSeq() {
		return seq;
	}

	/**
	 * dic_trade.seq 顺序
	 * 
	 * @param seq
	 *            the value for dic_trade.seq
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	public void setSeq(Integer seq) {
		this.seq = seq;
	}

	/**
	 * dic_trade.systime 系统时间
	 * 
	 * @return the value of dic_trade.systime
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */

	public Date getSystime() {
		return systime;
	}

	/**
	 * dic_trade.systime 系统时间
	 * 
	 * @param systime
	 *            the value for dic_trade.systime
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	public void setSystime(Date systime) {
		this.systime = systime;
	}

	/**
	 * dic_trade.isprotect 是否受保护 0：否，1：是
	 * 
	 * @return the value of dic_trade.isprotect
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	public Integer getIsprotect() {
		return isprotect;
	}

	/**
	 * dic_trade.isprotect 是否受保护 0：否，1：是
	 * 
	 * @param isprotect
	 *            the value for dic_trade.isprotect
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	public void setIsprotect(Integer isprotect) {
		this.isprotect = isprotect;
	}

	/**
	 * dic_trade.showrencai 是否在人才目录显示 0:不显示 1:显示
	 * 
	 * @return the value of dic_trade.showrencai
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	public Integer getShowrencai() {
		return showrencai;
	}

	/**
	 * dic_trade.showrencai 是否在人才目录显示 0:不显示 1:显示
	 * 
	 * @param showrencai
	 *            the value for dic_trade.showrencai
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	public void setShowrencai(Integer showrencai) {
		this.showrencai = showrencai;
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = -3616157512607355552L;
}