package com.xingyun.login.model.entity;

import android.databinding.BaseObservable;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserControl extends BaseObservable implements Serializable {

	/**
	 * user_control.id 主键
	 * 
	 * @mbggenerated Fri Oct 11 11:54:44 CST 2013
	 */
	private Integer id;
	/**
	 * user_control.userid 用户ID
	 * 
	 * @mbggenerated Fri Oct 11 11:54:44 CST 2013
	 */
	private String userid;
	/**
	 * user_control.picwater 图片添加水印 0：默认添加 1：不添加
	 * 
	 * @mbggenerated Fri Oct 11 11:54:44 CST 2013
	 */
	private Integer picwater;
	/**
	 * user_control.commenttype 用户评论类型 0：默认全部可以评论 1：我关注的人可以评论 2：明星精英以上级别用户可以评论
	 * 
	 * @mbggenerated Fri Oct 11 11:54:44 CST 2013
	 */
	private Integer commenttype;
	/**
	 * user_control.postcomment 展示评论 0：所有人 1：我关注的人 2：精英级别以上及我关注的人
	 * 
	 * @mbggenerated Fri Oct 11 11:54:44 CST 2013
	 */
	private Integer postcomment;
	/**
	 * user_control.xingyucomment 星语评论 0：所有人 1：我关注的人 2：精英级别以上及我关注的人
	 * 
	 * @mbggenerated Fri Oct 11 11:54:44 CST 2013
	 */
	private Integer xingyucomment;
	/**
	 * user_control.systime 系统时间
	 * 
	 * @mbggenerated Fri Oct 11 11:54:44 CST 2013
	 */
	private Date systime;
	/**
	 * user_control.contact 显示联系方式到展示详细页面
	 * 
	 * @mbggenerated Fri Oct 11 11:54:44 CST 2013
	 */
	private Integer contact;
	/**
	 * user_control.messagelimit 用户私信限制 0：全部可发 1：我关注的人可发 2：精英以上级别 和 我关注的人 可发
	 * 
	 * @mbggenerated Fri Oct 11 11:54:44 CST 2013
	 */
	private Integer messagelimit;
	/**
	 * user_control.cooperatewarn 显示合作意向提示框 0：显示 1：不再显示
	 * 
	 * @mbggenerated Fri Oct 11 11:54:44 CST 2013
	 */
	private Integer cooperatewarn;
	/**
	 * user_control.quickpublish 快速发布 0:开启 1：关闭
	 * 
	 * @mbggenerated Fri Oct 11 11:54:44 CST 2013
	 */
	private Integer quickpublish;
	/**
	 * user_control.rpush 是否接收Push私信：1 接收（默认），0 不接收
	 * 
	 * @mbggenerated Fri Oct 11 11:54:44 CST 2013
	 */
	private Integer rpush;
	/**
	 * user_control.push_detail 是否推送详细私信
	 * 
	 * @mbggenerated Fri Oct 11 11:54:44 CST 2013
	 */
	private Integer pushDetail;
	/**
	 * user_control.push_comment 是否推送评论:0 不推送, 1推送
	 * 
	 * @mbggenerated Fri Oct 11 11:54:44 CST 2013
	 */
	private Integer pushComment;
	/**
	 * user_control.push_fans 是否推送粉丝:0 不推送, 1推送
	 * 
	 * @mbggenerated Fri Oct 11 11:54:44 CST 2013
	 */
	private Integer pushFans;
	/**
	 * user_control.push_forward 是否推送转发:0 不推送, 1推送
	 * 
	 * @mbggenerated Fri Oct 11 11:54:44 CST 2013
	 */
	private Integer pushForward;
	/**
	 * user_control.push_recommend 是否推送推荐:0 不推送, 1推送
	 * 
	 * @mbggenerated Fri Oct 11 11:54:44 CST 2013
	 */
	private Integer pushRecommend;
	/**
	 * user_control.push_mayknown 是否推送可能认识的人:0 不推送, 1推送
	 * 
	 * @mbggenerated Fri Oct 11 11:54:44 CST 2013
	 */
	private Integer pushMayknown;
	/**
	 * user_control.push_dynamic 是否推送动态：0不推送, 1推送
	 * 
	 * @mbggenerated Fri Oct 11 11:54:44 CST 2013
	 */
	private Integer pushDynamic;
	/**
	 * user_control.push_coop 是否推送合作意向：0不推送, 1推送
	 * 
	 * @mbggenerated Fri Oct 11 11:54:44 CST 2013
	 */
	private Integer pushCoop;
	/**
	 * user_control.push_notify 是否接收星云通知：0不推送, 1推送
	 * 
	 * @mbggenerated Fri Oct 11 11:54:44 CST 2013
	 */
	private Integer pushNotify;
	/**
	 * user_control.push_sound 推送声音：0无声音, 1有声音
	 * 
	 * @mbggenerated Fri Oct 11 11:54:44 CST 2013
	 */
	private Integer pushSound;
	/**
	 * user_control.close_friends 是否关闭我的朋友：0公开, 1关闭
	 * @mbggenerated  Wed Nov 20 14:10:22 CST 2013
	 */
	private Integer closeFriends;
	/**
	 * user_control.changed_friends_time 更改朋友设定的时间
	 * @mbggenerated  Wed Nov 20 14:10:22 CST 2013
	 */
	private Date changedFriendsTime;
	
	/**
	 * user_control.zan_forward 是否关闭动态：0公开, 1关闭
	 * @mbggenerated  Mon Dec 09 16:49:15 CST 2013
	 */
	private Integer zanForward;
	/**
	 * user_control.zan_forward_show 是显示提醒：0 显示, 1不显示
	 * @mbggenerated  Mon Dec 09 16:49:15 CST 2013
	 */
	private Integer zanForwardShow;
	/**
	 * 允许陌生人搜索
	 */
	private Integer allowAnonymousSearch;
	
	/**
	 * user_control.hide_status_position 隐藏动态位置:0显示;1隐藏
	 * @mbggenerated  Wed Sep 10 11:16:48 CST 2014
	 */
	private Integer hideStatusPosition;
	
	/**
	 * user_control.hide_position_flag 隐藏我的位置 1-隐藏 0-不隐藏
	 * @mbggenerated  Fri Mar 20 17:56:33 CST 2015
	 */
	private Short hidePositionFlag;
	
	/**
	 * 隐藏关注的人：0不隐藏，1隐藏V3.9.5
	 */
	private Short hideFollowers;
	// 赞，推送设置 0 不推送, 1推送, 2按时间段推送 默认1
	private Integer pushLikeComment;
	
	// 推送选项 1-随时接收，2-09:00-22:00接收，0-不接收 ，默认1
	private List<BaseIdNameData> pushOptions = new ArrayList<BaseIdNameData>();
	
	public static BaseIdNameData PUSH_OPTION_ACCEPTION = new BaseIdNameData(1,   "随时接收");
	public static BaseIdNameData PUSH_OPTION_REFUSAL   = new BaseIdNameData(0,   "不接收");
	/**
	 * user_control.id 主键
	 * 
	 * @return the value of user_control.id
	 * @mbggenerated Fri Oct 11 11:54:44 CST 2013
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * user_control.id 主键
	 * 
	 * @param id
	 *            the value for user_control.id
	 * @mbggenerated Fri Oct 11 11:54:44 CST 2013
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * user_control.userid 用户ID
	 * 
	 * @return the value of user_control.userid
	 * @mbggenerated Fri Oct 11 11:54:44 CST 2013
	 */
	public String getUserid() {
		return userid;
	}

	/**
	 * user_control.userid 用户ID
	 * 
	 * @param userid
	 *            the value for user_control.userid
	 * @mbggenerated Fri Oct 11 11:54:44 CST 2013
	 */
	public void setUserid(String userid) {
		this.userid = userid;
	}

	/**
	 * user_control.picwater 图片添加水印 0：默认添加 1：不添加
	 * 
	 * @return the value of user_control.picwater
	 * @mbggenerated Fri Oct 11 11:54:44 CST 2013
	 */
	public Integer getPicwater() {
		return picwater;
	}

	/**
	 * user_control.picwater 图片添加水印 0：默认添加 1：不添加
	 * 
	 * @param picwater
	 *            the value for user_control.picwater
	 * @mbggenerated Fri Oct 11 11:54:44 CST 2013
	 */
	public void setPicwater(Integer picwater) {
		this.picwater = picwater;
	}

	/**
	 * user_control.commenttype 用户评论类型 0：默认全部可以评论 1：我关注的人可以评论 2：明星精英以上级别用户可以评论
	 * 
	 * @return the value of user_control.commenttype
	 * @mbggenerated Fri Oct 11 11:54:44 CST 2013
	 */
	public Integer getCommenttype() {
		return commenttype;
	}

	/**
	 * user_control.commenttype 用户评论类型 0：默认全部可以评论 1：我关注的人可以评论 2：明星精英以上级别用户可以评论
	 * 
	 * @param commenttype
	 *            the value for user_control.commenttype
	 * @mbggenerated Fri Oct 11 11:54:44 CST 2013
	 */
	public void setCommenttype(Integer commenttype) {
		this.commenttype = commenttype;
	}

	/**
	 * user_control.postcomment 展示评论 0：所有人 1：我关注的人 2：精英级别以上及我关注的人
	 * 
	 * @return the value of user_control.postcomment
	 * @mbggenerated Fri Oct 11 11:54:44 CST 2013
	 */
	public Integer getPostcomment() {
		return postcomment;
	}

	/**
	 * user_control.postcomment 展示评论 0：所有人 1：我关注的人 2：精英级别以上及我关注的人
	 * 
	 * @param postcomment
	 *            the value for user_control.postcomment
	 * @mbggenerated Fri Oct 11 11:54:44 CST 2013
	 */
	public void setPostcomment(Integer postcomment) {
		this.postcomment = postcomment;
	}

	/**
	 * user_control.xingyucomment 星语评论 0：所有人 1：我关注的人 2：精英级别以上及我关注的人
	 * 
	 * @return the value of user_control.xingyucomment
	 * @mbggenerated Fri Oct 11 11:54:44 CST 2013
	 */
	public Integer getXingyucomment() {
		return xingyucomment;
	}

	/**
	 * user_control.xingyucomment 星语评论 0：所有人 1：我关注的人 2：精英级别以上及我关注的人
	 * 
	 * @param xingyucomment
	 *            the value for user_control.xingyucomment
	 * @mbggenerated Fri Oct 11 11:54:44 CST 2013
	 */
	public void setXingyucomment(Integer xingyucomment) {
		this.xingyucomment = xingyucomment;
	}

	/**
	 * user_control.systime 系统时间
	 * 
	 * @return the value of user_control.systime
	 * @mbggenerated Fri Oct 11 11:54:44 CST 2013
	 */

	public Date getSystime() {
		return systime;
	}

	/**
	 * user_control.systime 系统时间
	 * 
	 * @param systime
	 *            the value for user_control.systime
	 * @mbggenerated Fri Oct 11 11:54:44 CST 2013
	 */
	public void setSystime(Date systime) {
		this.systime = systime;
	}

	/**
	 * user_control.contact 显示联系方式到展示详细页面
	 * 
	 * @return the value of user_control.contact
	 * @mbggenerated Fri Oct 11 11:54:44 CST 2013
	 */
	public Integer getContact() {
		return contact;
	}

	/**
	 * user_control.contact 显示联系方式到展示详细页面
	 * 
	 * @param contact
	 *            the value for user_control.contact
	 * @mbggenerated Fri Oct 11 11:54:44 CST 2013
	 */
	public void setContact(Integer contact) {
		this.contact = contact;
	}

	/**
	 * user_control.messagelimit 用户私信限制 0：全部可发 1：我关注的人可发 2：精英以上级别 和 我关注的人 可发
	 * 
	 * @return the value of user_control.messagelimit
	 * @mbggenerated Fri Oct 11 11:54:44 CST 2013
	 */
	public Integer getMessagelimit() {
		return messagelimit;
	}

	/**
	 * user_control.messagelimit 用户私信限制 0：全部可发 1：我关注的人可发 2：精英以上级别 和 我关注的人 可发
	 * 
	 * @param messagelimit
	 *            the value for user_control.messagelimit
	 * @mbggenerated Fri Oct 11 11:54:44 CST 2013
	 */
	public void setMessagelimit(Integer messagelimit) {
		this.messagelimit = messagelimit;
	}

	/**
	 * user_control.cooperatewarn 显示合作意向提示框 0：显示 1：不再显示
	 * 
	 * @return the value of user_control.cooperatewarn
	 * @mbggenerated Fri Oct 11 11:54:44 CST 2013
	 */
	public Integer getCooperatewarn() {
		return cooperatewarn;
	}

	/**
	 * user_control.cooperatewarn 显示合作意向提示框 0：显示 1：不再显示
	 * 
	 * @param cooperatewarn
	 *            the value for user_control.cooperatewarn
	 * @mbggenerated Fri Oct 11 11:54:44 CST 2013
	 */
	public void setCooperatewarn(Integer cooperatewarn) {
		this.cooperatewarn = cooperatewarn;
	}

	/**
	 * user_control.quickpublish 快速发布 0:开启 1：关闭
	 * 
	 * @return the value of user_control.quickpublish
	 * @mbggenerated Fri Oct 11 11:54:44 CST 2013
	 */
	public Integer getQuickpublish() {
		return quickpublish;
	}

	/**
	 * user_control.quickpublish 快速发布 0:开启 1：关闭
	 * 
	 * @param quickpublish
	 *            the value for user_control.quickpublish
	 * @mbggenerated Fri Oct 11 11:54:44 CST 2013
	 */
	public void setQuickpublish(Integer quickpublish) {
		this.quickpublish = quickpublish;
	}

	/**
	 * user_control.rpush 是否接收Push私信：1 接收（默认），0 不接收
	 * 
	 * @return the value of user_control.rpush
	 * @mbggenerated Fri Oct 11 11:54:44 CST 2013
	 */
	public Integer getRpush() {
		return rpush;
	}

	/**
	 * user_control.rpush 是否接收Push私信：1 接收（默认），0 不接收
	 * 
	 * @param rpush
	 *            the value for user_control.rpush
	 * @mbggenerated Fri Oct 11 11:54:44 CST 2013
	 */
	public void setRpush(Integer rpush) {
		this.rpush = rpush;
	}

	/**
	 * user_control.push_detail 是否推送详细私信
	 * 
	 * @return the value of user_control.push_detail
	 * @mbggenerated Fri Oct 11 11:54:44 CST 2013
	 */
	public Integer getPushDetail() {
		return pushDetail;
	}

	/**
	 * user_control.push_detail 是否推送详细私信
	 * 
	 * @param pushDetail
	 *            the value for user_control.push_detail
	 * @mbggenerated Fri Oct 11 11:54:44 CST 2013
	 */
	public void setPushDetail(Integer pushDetail) {
		this.pushDetail = pushDetail;
	}

	/**
	 * user_control.push_comment 是否推送评论:0 不推送, 1推送
	 * 
	 * @return the value of user_control.push_comment
	 * @mbggenerated Fri Oct 11 11:54:44 CST 2013
	 */
	public Integer getPushComment() {
		return pushComment;
	}

	/**
	 * user_control.push_comment 是否推送评论:0 不推送, 1推送
	 * 
	 * @param pushComment
	 *            the value for user_control.push_comment
	 * @mbggenerated Fri Oct 11 11:54:44 CST 2013
	 */
	public void setPushComment(Integer pushComment) {
		this.pushComment = pushComment;
	}

	/**
	 * user_control.push_fans 是否推送粉丝:0 不推送, 1推送
	 * 
	 * @return the value of user_control.push_fans
	 * @mbggenerated Fri Oct 11 11:54:44 CST 2013
	 */
	public Integer getPushFans() {
		return pushFans;
	}

	/**
	 * user_control.push_fans 是否推送粉丝:0 不推送, 1推送
	 * 
	 * @param pushFans
	 *            the value for user_control.push_fans
	 * @mbggenerated Fri Oct 11 11:54:44 CST 2013
	 */
	public void setPushFans(Integer pushFans) {
		this.pushFans = pushFans;
	}

	/**
	 * user_control.push_forward 是否推送转发:0 不推送, 1推送
	 * 
	 * @return the value of user_control.push_forward
	 * @mbggenerated Fri Oct 11 11:54:44 CST 2013
	 */
	public Integer getPushForward() {
		return pushForward;
	}

	/**
	 * user_control.push_forward 是否推送转发:0 不推送, 1推送
	 * 
	 * @param pushForward
	 *            the value for user_control.push_forward
	 * @mbggenerated Fri Oct 11 11:54:44 CST 2013
	 */
	public void setPushForward(Integer pushForward) {
		this.pushForward = pushForward;
	}

	/**
	 * user_control.push_recommend 是否推送推荐:0 不推送, 1推送
	 * 
	 * @return the value of user_control.push_recommend
	 * @mbggenerated Fri Oct 11 11:54:44 CST 2013
	 */
	public Integer getPushRecommend() {
		return pushRecommend;
	}

	/**
	 * user_control.push_recommend 是否推送推荐:0 不推送, 1推送
	 * 
	 * @param pushRecommend
	 *            the value for user_control.push_recommend
	 * @mbggenerated Fri Oct 11 11:54:44 CST 2013
	 */
	public void setPushRecommend(Integer pushRecommend) {
		this.pushRecommend = pushRecommend;
	}

	/**
	 * user_control.push_mayknown 是否推送可能认识的人:0 不推送, 1推送
	 * 
	 * @return the value of user_control.push_mayknown
	 * @mbggenerated Fri Oct 11 11:54:44 CST 2013
	 */
	public Integer getPushMayknown() {
		return pushMayknown;
	}

	/**
	 * user_control.push_mayknown 是否推送可能认识的人:0 不推送, 1推送
	 * 
	 * @param pushMayknown
	 *            the value for user_control.push_mayknown
	 * @mbggenerated Fri Oct 11 11:54:44 CST 2013
	 */
	public void setPushMayknown(Integer pushMayknown) {
		this.pushMayknown = pushMayknown;
	}

	/**
	 * user_control.push_dynamic 是否推送动态：0不推送, 1推送
	 * 
	 * @return the value of user_control.push_dynamic
	 * @mbggenerated Fri Oct 11 11:54:44 CST 2013
	 */
	public Integer getPushDynamic() {
		return pushDynamic;
	}

	/**
	 * user_control.push_dynamic 是否推送动态：0不推送, 1推送
	 * 
	 * @param pushDynamic
	 *            the value for user_control.push_dynamic
	 * @mbggenerated Fri Oct 11 11:54:44 CST 2013
	 */
	public void setPushDynamic(Integer pushDynamic) {
		this.pushDynamic = pushDynamic;
	}

	/**
	 * user_control.push_coop 是否推送合作意向：0不推送, 1推送
	 * 
	 * @return the value of user_control.push_coop
	 * @mbggenerated Fri Oct 11 11:54:44 CST 2013
	 */
	public Integer getPushCoop() {
		return pushCoop;
	}

	/**
	 * user_control.push_coop 是否推送合作意向：0不推送, 1推送
	 * 
	 * @param pushCoop
	 *            the value for user_control.push_coop
	 * @mbggenerated Fri Oct 11 11:54:44 CST 2013
	 */
	public void setPushCoop(Integer pushCoop) {
		this.pushCoop = pushCoop;
	}

	/**
	 * user_control.push_notify 是否接收星云通知：0不推送, 1推送
	 * 
	 * @return the value of user_control.push_notify
	 * @mbggenerated Fri Oct 11 11:54:44 CST 2013
	 */
	public Integer getPushNotify() {
		return pushNotify;
	}

	/**
	 * user_control.push_notify 是否接收星云通知：0不推送, 1推送
	 * 
	 * @param pushNotify
	 *            the value for user_control.push_notify
	 * @mbggenerated Fri Oct 11 11:54:44 CST 2013
	 */
	public void setPushNotify(Integer pushNotify) {
		this.pushNotify = pushNotify;
	}

	/**
	 * user_control.push_sound 推送声音：0无声音, 1有声音
	 * 
	 * @return the value of user_control.push_sound
	 * @mbggenerated Fri Oct 11 11:54:44 CST 2013
	 */
	public Integer getPushSound() {
		return pushSound;
	}

	/**
	 * user_control.push_sound 推送声音：0无声音, 1有声音
	 * 
	 * @param pushSound
	 *            the value for user_control.push_sound
	 * @mbggenerated Fri Oct 11 11:54:44 CST 2013
	 */
	public void setPushSound(Integer pushSound) {
		this.pushSound = pushSound;
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 3043006486440334360L;
	public Integer getCloseFriends() {
		return closeFriends;
	}

	public void setCloseFriends(Integer closeFriends) {
		this.closeFriends = closeFriends;
	}

	public Date getChangedFriendsTime() {
		return changedFriendsTime;
	}

	public void setChangedFriendsTime(Date changedFriendsTime) {
		this.changedFriendsTime = changedFriendsTime;
	}

	public Integer getZanForward() {
		return zanForward;
	}

	public void setZanForward(Integer zanForward) {
		this.zanForward = zanForward;
	}

	public Integer getZanForwardShow() {
		return zanForwardShow;
	}

	public void setZanForwardShow(Integer zanForwardShow) {
		this.zanForwardShow = zanForwardShow;
	}
	
	public Integer getAllowAnonymousSearch() {
		return allowAnonymousSearch;
	}

	public void setAllowAnonymousSearch(Integer allowAnonymousSearch) {
		this.allowAnonymousSearch = allowAnonymousSearch;
	}

	public Integer getHideStatusPosition() {
		return hideStatusPosition;
	}

	public void setHideStatusPosition(Integer hideStatusPosition) {
		this.hideStatusPosition = hideStatusPosition;
	}

	/**
	 * @return the hidePositionFlag
	 */
	public Short getHidePositionFlag() {
		return hidePositionFlag;
	}

	/**
	 * @param hidePositionFlag the hidePositionFlag to set
	 */
	public void setHidePositionFlag(Short hidePositionFlag) {
		this.hidePositionFlag = hidePositionFlag;
	}

	public Short getHideFollowers() {
		return hideFollowers;
	}

	public void setHideFollowers(Short hideFollowers) {
		this.hideFollowers = hideFollowers;
	}

	public Integer getPushLikeComment() {
		return pushLikeComment;
	}

	public void setPushLikeComment(Integer pushLikeComment) {
		this.pushLikeComment = pushLikeComment;
	}

	public List<BaseIdNameData> getPushOptions() {
		return pushOptions;
	}

	public void setPushOptions(List<BaseIdNameData> pushOptions) {
		this.pushOptions = pushOptions;
	}

}