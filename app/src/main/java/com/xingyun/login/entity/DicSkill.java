package com.xingyun.login.entity;

import android.databinding.BaseObservable;

import java.io.Serializable;
import java.util.Date;

public class DicSkill extends BaseObservable implements Serializable {

	/**
	 * dic_skill.id 主键
	 * 
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	private Integer id;
	/**
	 * dic_skill.tradeid 行业id
	 *
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	private Integer tradeid;
	/**
	 * dic_skill.vocationid 职业id
	 *
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	private Integer vocationid;
	/**
	 * dic_skill.name 技能名
	 *
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	private String name;
	/**
	 * dic_skill.status 是否热门 0：是 1：否
	 *
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	private Integer status;
	/**
	 * dic_skill.seq 顺序
	 *
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	private Integer seq;
	/**
	 * dic_skill.systime 系统时间
	 *
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	private Date systime;
	/**
	 * dic_skill.num 选择此技能人数
	 *
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	private Integer num;
	/**
	 * dic_skill.name_pinyin 技能拼音
	 *
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	private String namePinyin;

	/**
	 * dic_skill.id 主键
	 *
	 * @return the value of dic_skill.id
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * dic_skill.id 主键
	 *
	 * @param id
	 *            the value for dic_skill.id
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * dic_skill.tradeid 行业id
	 *
	 * @return the value of dic_skill.tradeid
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	public Integer getTradeid() {
		return tradeid;
	}

	/**
	 * dic_skill.tradeid 行业id
	 *
	 * @param tradeid
	 *            the value for dic_skill.tradeid
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	public void setTradeid(Integer tradeid) {
		this.tradeid = tradeid;
	}

	/**
	 * dic_skill.vocationid 职业id
	 *
	 * @return the value of dic_skill.vocationid
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	public Integer getVocationid() {
		return vocationid;
	}

	/**
	 * dic_skill.vocationid 职业id
	 *
	 * @param vocationid
	 *            the value for dic_skill.vocationid
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	public void setVocationid(Integer vocationid) {
		this.vocationid = vocationid;
	}

	/**
	 * dic_skill.name 技能名
	 *
	 * @return the value of dic_skill.name
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	public String getName() {
		return name;
	}

	/**
	 * dic_skill.name 技能名
	 *
	 * @param name
	 *            the value for dic_skill.name
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * dic_skill.status 是否热门 0：是 1：否
	 *
	 * @return the value of dic_skill.status
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	public Integer getStatus() {
		return status;
	}

	/**
	 * dic_skill.status 是否热门 0：是 1：否
	 *
	 * @param status
	 *            the value for dic_skill.status
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	public void setStatus(Integer status) {
		this.status = status;
	}

	/**
	 * dic_skill.seq 顺序
	 *
	 * @return the value of dic_skill.seq
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	public Integer getSeq() {
		return seq;
	}

	/**
	 * dic_skill.seq 顺序
	 *
	 * @param seq
	 *            the value for dic_skill.seq
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	public void setSeq(Integer seq) {
		this.seq = seq;
	}

	/**
	 * dic_skill.systime 系统时间
	 *
	 * @return the value of dic_skill.systime
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */

	public Date getSystime() {
		return systime;
	}

	/**
	 * dic_skill.systime 系统时间
	 *
	 * @param systime
	 *            the value for dic_skill.systime
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	public void setSystime(Date systime) {
		this.systime = systime;
	}

	/**
	 * dic_skill.num 选择此技能人数
	 *
	 * @return the value of dic_skill.num
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	public Integer getNum() {
		return num;
	}

	/**
	 * dic_skill.num 选择此技能人数
	 *
	 * @param num
	 *            the value for dic_skill.num
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	public void setNum(Integer num) {
		this.num = num;
	}

	/**
	 * dic_skill.name_pinyin 技能拼音
	 *
	 * @return the value of dic_skill.name_pinyin
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	public String getNamePinyin() {
		return namePinyin;
	}

	/**
	 * dic_skill.name_pinyin 技能拼音
	 *
	 * @param namePinyin
	 *            the value for dic_skill.name_pinyin
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	public void setNamePinyin(String namePinyin) {
		this.namePinyin = namePinyin;
	}

	/**
	 *
	 */
	private static final long serialVersionUID = 4464170673949303821L;
	/**
	 * 产业
	 */
	private DicTrade trade;
	/**
	 * 职业
	 */
	private DicVocation vocation;

	/**
	 * @return the trade
	 */
	public DicTrade getTrade() {
		return trade;
	}

	/**
	 * @param trade
	 *            the trade to set
	 */
	public void setTrade(DicTrade trade) {
		this.trade = trade;
	}

	/**
	 * @return the vocation
	 */
	public DicVocation getVocation() {
		return vocation;
	}

	/**
	 * @param vocation
	 *            the vocation to set
	 */
	public void setVocation(DicVocation vocation) {
		this.vocation = vocation;
	}
}