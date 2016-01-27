package com.xingyun.login.model.entity;

import android.databinding.BaseObservable;

import java.io.Serializable;
import java.util.Date;

public class UserCounter extends BaseObservable implements Serializable {

	/**
	 * user_counter.id 主键
	 * 
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	private Integer id;
	/**
	 * user_counter.userid 用户id
	 * 
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	private String userid;
	/**
	 * user_counter.followcount 关注数
	 * 
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	private Integer followcount;
	/**
	 * user_counter.fanscount 粉丝数
	 * 
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	private Integer fanscount;
	/**
	 * user_counter.recommendcount 推荐数
	 * 
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	private Integer recommendcount;
	/**
	 * user_counter.systime 系统时间
	 * 
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	private Date systime;
	/**
	 * user_counter.bifollowcount 相互关注数
	 * 
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	private Integer bifollowcount;
	/**
	 * user_conter.mutualscount 共同好友数
	 */
	private Integer mutualsCount;
	/**
	 * user_counter.affectcount 用户影响力数值
	 * 
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	private Integer affectcount;
	/**
	 * user_counter.cooperatecount 合作意向数
	 * 
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	private Integer cooperatecount;
	
	public Integer getSupportCount() {
		return supportCount;
	}

	public void setSupportCount(Integer supportCount) {
		this.supportCount = supportCount;
	}

	/**
	 * user_counter.supportCount 支持人数
	 * 
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	private Integer supportCount;

	/**
	 * user_counter.id 主键
	 * 
	 * @return the value of user_counter.id
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * user_counter.id 主键
	 * 
	 * @param id
	 *            the value for user_counter.id
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * user_counter.userid 用户id
	 * 
	 * @return the value of user_counter.userid
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	public String getUserid() {
		return userid;
	}

	/**
	 * user_counter.userid 用户id
	 * 
	 * @param userid
	 *            the value for user_counter.userid
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	public void setUserid(String userid) {
		this.userid = userid;
	}

	/**
	 * user_counter.followcount 关注数
	 * 
	 * @return the value of user_counter.followcount
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	public Integer getFollowcount() {
		return followcount;
	}

	/**
	 * user_counter.followcount 关注数
	 * 
	 * @param followcount
	 *            the value for user_counter.followcount
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	public void setFollowcount(Integer followcount) {
		this.followcount = followcount;
	}

	/**
	 * user_counter.fanscount 粉丝数
	 * 
	 * @return the value of user_counter.fanscount
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	public Integer getFanscount() {
		return fanscount;
	}

	/**
	 * user_counter.fanscount 粉丝数
	 * 
	 * @param fanscount
	 *            the value for user_counter.fanscount
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	public void setFanscount(Integer fanscount) {
		this.fanscount = fanscount;
	}

	/**
	 * user_counter.recommendcount 推荐数
	 * 
	 * @return the value of user_counter.recommendcount
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	public Integer getRecommendcount() {
		return recommendcount;
	}

	/**
	 * user_counter.recommendcount 推荐数
	 * 
	 * @param recommendcount
	 *            the value for user_counter.recommendcount
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	public void setRecommendcount(Integer recommendcount) {
		this.recommendcount = recommendcount;
	}

	/**
	 * user_counter.systime 系统时间
	 * 
	 * @return the value of user_counter.systime
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */

	public Date getSystime() {
		return systime;
	}

	/**
	 * user_counter.systime 系统时间
	 * 
	 * @param systime
	 *            the value for user_counter.systime
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	public void setSystime(Date systime) {
		this.systime = systime;
	}

	/**
	 * user_counter.bifollowcount 相互关注数
	 * 
	 * @return the value of user_counter.bifollowcount
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	public Integer getBifollowcount() {
		return bifollowcount;
	}

	/**
	 * user_counter.bifollowcount 相互关注数
	 * 
	 * @param bifollowcount
	 *            the value for user_counter.bifollowcount
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	public void setBifollowcount(Integer bifollowcount) {
		this.bifollowcount = bifollowcount;
	}

	/**
	 * user_counter.affectcount 用户影响力数值
	 * 
	 * @return the value of user_counter.affectcount
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	public Integer getAffectcount() {
		return affectcount;
	}

	/**
	 * user_counter.affectcount 用户影响力数值
	 * 
	 * @param affectcount
	 *            the value for user_counter.affectcount
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	public void setAffectcount(Integer affectcount) {
		this.affectcount = affectcount;
	}

	/**
	 * user_counter.cooperatecount 合作意向数
	 * 
	 * @return the value of user_counter.cooperatecount
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	public Integer getCooperatecount() {
		return cooperatecount;
	}

	/**
	 * user_counter.cooperatecount 合作意向数
	 * 
	 * @param cooperatecount
	 *            the value for user_counter.cooperatecount
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	public void setCooperatecount(Integer cooperatecount) {
		this.cooperatecount = cooperatecount;
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 899361360847907769L;
	/**
	 * 推荐我展示的人的数目
	 */
	Integer recommendMyWorksTalentCount;
	/**
	 * 我推荐的人才数
	 */
	Integer myRecommendTalentCount;

	public Integer getMyRecommendTalentCount() {
		return myRecommendTalentCount;
	}

	public void setMyRecommendTalentCount(Integer myRecommendTalentCount) {
		this.myRecommendTalentCount = myRecommendTalentCount;
	}

	public Integer getRecommendMyWorksTalentCount() {
		return recommendMyWorksTalentCount;
	}

	public void setRecommendMyWorksTalentCount(
			Integer recommendMyWorksTalentCount) {
		this.recommendMyWorksTalentCount = recommendMyWorksTalentCount;
	}

	public Integer getMutualsCount() {
		return mutualsCount;
	}

	public void setMutualsCount(Integer mutualsCount) {
		this.mutualsCount = mutualsCount;
	}

}