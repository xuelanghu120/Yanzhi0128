package com.xingyun.login.entity;

import android.databinding.BaseObservable;

import java.io.Serializable;
import java.util.Date;

public class Face extends BaseObservable implements Serializable {

	/**
	 * face.id 主键
	 * 
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	private Integer id;
	/**
	 * face.userid 用户id
	 * 
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	private String userid;
	/**
	 * face.isshowvideo 是否显示视频简历 1：显示 0：不显示
	 * 
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	private Integer isshowvideo;
	/**
	 * face.isshowfacepic 是否显示幻灯片 1：显示 0：不显示
	 * 
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	private Integer isshowfacepic;
	/**
	 * face.isshowpost 是否显示展示 1：显示 0：不显示
	 * 
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	private Integer isshowpost;
	/**
	 * face.isshowfollow 是否显示关注 1：显示 0：不显示
	 * 
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	private Integer isshowfollow;
	/**
	 * face.systime 系统时间
	 * 
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	private Date systime;
	/**
	 * face.isshowserve æ˜¯å¦æ˜¾ç¤ºæœåŠ¡æŠ¥ä»· 1ï¼šæ˜¾ç¤º 0ï¼šä¸æ˜¾ç¤º
	 * 
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	private Integer isshowserve;
	/**
	 * face.isshowxingyu 是否显示星语 1：显示 0：不显示
	 * 
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	private Integer isshowxingyu;
	/**
	 * face.isshowjob 是否显示合作需求 1:显示 0:不显示
	 * 
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	private Integer isshowjob;
	/**
	 * face.isshowrecommend 是否显示推荐我的精英 1:显示 0:不显示
	 * 
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	private Integer isshowrecommend;

	/**
	 * face.id 主键
	 * 
	 * @return the value of face.id
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * face.id 主键
	 * 
	 * @param id
	 *            the value for face.id
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * face.userid 用户id
	 * 
	 * @return the value of face.userid
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	public String getUserid() {
		return userid;
	}

	/**
	 * face.userid 用户id
	 * 
	 * @param userid
	 *            the value for face.userid
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	public void setUserid(String userid) {
		this.userid = userid;
	}

	/**
	 * face.isshowvideo 是否显示视频简历 1：显示 0：不显示
	 * 
	 * @return the value of face.isshowvideo
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	public Integer getIsshowvideo() {
		return isshowvideo;
	}

	/**
	 * face.isshowvideo 是否显示视频简历 1：显示 0：不显示
	 * 
	 * @param isshowvideo
	 *            the value for face.isshowvideo
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	public void setIsshowvideo(Integer isshowvideo) {
		this.isshowvideo = isshowvideo;
	}

	/**
	 * face.isshowfacepic 是否显示幻灯片 1：显示 0：不显示
	 * 
	 * @return the value of face.isshowfacepic
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	public Integer getIsshowfacepic() {
		return isshowfacepic;
	}

	/**
	 * face.isshowfacepic 是否显示幻灯片 1：显示 0：不显示
	 * 
	 * @param isshowfacepic
	 *            the value for face.isshowfacepic
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	public void setIsshowfacepic(Integer isshowfacepic) {
		this.isshowfacepic = isshowfacepic;
	}

	/**
	 * face.isshowpost 是否显示展示 1：显示 0：不显示
	 * 
	 * @return the value of face.isshowpost
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	public Integer getIsshowpost() {
		return isshowpost;
	}

	/**
	 * face.isshowpost 是否显示展示 1：显示 0：不显示
	 * 
	 * @param isshowpost
	 *            the value for face.isshowpost
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	public void setIsshowpost(Integer isshowpost) {
		this.isshowpost = isshowpost;
	}

	/**
	 * face.isshowfollow 是否显示关注 1：显示 0：不显示
	 * 
	 * @return the value of face.isshowfollow
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	public Integer getIsshowfollow() {
		return isshowfollow;
	}

	/**
	 * face.isshowfollow 是否显示关注 1：显示 0：不显示
	 * 
	 * @param isshowfollow
	 *            the value for face.isshowfollow
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	public void setIsshowfollow(Integer isshowfollow) {
		this.isshowfollow = isshowfollow;
	}

	/**
	 * face.systime 系统时间
	 * 
	 * @return the value of face.systime
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */

	public Date getSystime() {
		return systime;
	}

	/**
	 * face.systime 系统时间
	 * 
	 * @param systime
	 *            the value for face.systime
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	public void setSystime(Date systime) {
		this.systime = systime;
	}

	/**
	 * face.isshowserve æ˜¯å¦æ˜¾ç¤ºæœåŠ¡æŠ¥ä»· 1ï¼šæ˜¾ç¤º 0ï¼šä¸æ˜¾ç¤º
	 * 
	 * @return the value of face.isshowserve
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	public Integer getIsshowserve() {
		return isshowserve;
	}

	/**
	 * face.isshowserve æ˜¯å¦æ˜¾ç¤ºæœåŠ¡æŠ¥ä»· 1ï¼šæ˜¾ç¤º 0ï¼šä¸æ˜¾ç¤º
	 * 
	 * @param isshowserve
	 *            the value for face.isshowserve
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	public void setIsshowserve(Integer isshowserve) {
		this.isshowserve = isshowserve;
	}

	/**
	 * face.isshowxingyu 是否显示星语 1：显示 0：不显示
	 * 
	 * @return the value of face.isshowxingyu
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	public Integer getIsshowxingyu() {
		return isshowxingyu;
	}

	/**
	 * face.isshowxingyu 是否显示星语 1：显示 0：不显示
	 * 
	 * @param isshowxingyu
	 *            the value for face.isshowxingyu
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	public void setIsshowxingyu(Integer isshowxingyu) {
		this.isshowxingyu = isshowxingyu;
	}

	/**
	 * face.isshowjob 是否显示合作需求 1:显示 0:不显示
	 * 
	 * @return the value of face.isshowjob
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	public Integer getIsshowjob() {
		return isshowjob;
	}

	/**
	 * face.isshowjob 是否显示合作需求 1:显示 0:不显示
	 * 
	 * @param isshowjob
	 *            the value for face.isshowjob
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	public void setIsshowjob(Integer isshowjob) {
		this.isshowjob = isshowjob;
	}

	/**
	 * face.isshowrecommend 是否显示推荐我的精英 1:显示 0:不显示
	 * 
	 * @return the value of face.isshowrecommend
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	public Integer getIsshowrecommend() {
		return isshowrecommend;
	}

	/**
	 * face.isshowrecommend 是否显示推荐我的精英 1:显示 0:不显示
	 * 
	 * @param isshowrecommend
	 *            the value for face.isshowrecommend
	 * @mbggenerated Fri Aug 30 17:15:39 CST 2013
	 */
	public void setIsshowrecommend(Integer isshowrecommend) {
		this.isshowrecommend = isshowrecommend;
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 3169347930329500661L;
}