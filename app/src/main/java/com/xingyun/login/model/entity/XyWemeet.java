package com.xingyun.login.model.entity;

import android.databinding.BaseObservable;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class XyWemeet extends BaseObservable implements Serializable{
    /**
	 * xy_wemeet.id 主键
	 * @mbggenerated  Wed Jun 04 11:41:06 CST 2014
	 */
	private Integer id;

	/**
	 * xy_wemeet.userid 约见人
	 * @mbggenerated  Wed Jun 04 11:41:06 CST 2014
	 */
	private String userid;

	/**
	 * xy_wemeet.meet_title 标题
	 * @mbggenerated  Wed Jun 04 11:41:06 CST 2014
	 */
	private String meetTitle;

	/**
	 * xy_wemeet.meet_type 约见类型:0免费 1付费
	 * @mbggenerated  Wed Jun 04 11:41:06 CST 2014
	 */
	private Integer meetType;

	/**
	 * xy_wemeet.meet_active 是否上架 0：未上架 1：已上架
	 * @mbggenerated  Wed Jun 04 11:41:06 CST 2014
	 */
	private Integer meetActive;

	/**
	 * xy_wemeet.meet_status 约见状态 0：进行中 1：已结束
	 * @mbggenerated  Wed Jun 04 11:41:06 CST 2014
	 */
	private Integer meetStatus;

	/**
	 * xy_wemeet.is_top 置顶状态 0:默认不置顶 1:置顶
	 * @mbggenerated  Wed Jun 04 11:41:06 CST 2014
	 */
	private Integer isTop;

	/**
	 * xy_wemeet.is_hot 热门状态 0:默认非热门 1:热门
	 * @mbggenerated  Wed Jun 04 11:41:06 CST 2014
	 */
	private Integer isHot;

	/**
	 * xy_wemeet.provinceid 省份ID
	 * @mbggenerated  Wed Jun 04 11:41:06 CST 2014
	 */
	private Integer provinceid;

	/**
	 * xy_wemeet.cityid 城市ID
	 * @mbggenerated  Wed Jun 04 11:41:06 CST 2014
	 */
	private Integer cityid;

	/**
	 * xy_wemeet.meet_place 约见地点
	 * @mbggenerated  Wed Jun 04 11:41:06 CST 2014
	 */
	private String meetPlace;

	/**
	 * xy_wemeet.latitude 纬度
	 * @mbggenerated  Wed Jun 04 11:41:06 CST 2014
	 */
	private Double latitude;

	/**
	 * xy_wemeet.longitude 经度
	 * @mbggenerated  Wed Jun 04 11:41:06 CST 2014
	 */
	private Double longitude;

	/**
	 * xy_wemeet.meet_time 约见时间
	 * @mbggenerated  Wed Jun 04 11:41:06 CST 2014
	 */
	private String meetTime;

	/**
	 * xy_wemeet.post_weibo 是否发微博 0:不发送 1：发微博
	 * @mbggenerated  Wed Jun 04 11:41:06 CST 2014
	 */
	private Integer postWeibo;

	/**
	 * xy_wemeet.view_count 访问量
	 * @mbggenerated  Wed Jun 04 11:41:06 CST 2014
	 */
	private Integer viewCount;

	/**
	 * xy_wemeet.show_count 前端显示的报名人数
	 * @mbggenerated  Wed Jun 04 11:41:06 CST 2014
	 */
	private Integer showCount;

	/**
	 * xy_wemeet.enroll_count 报名人数
	 * @mbggenerated  Wed Jun 04 11:41:06 CST 2014
	 */
	private Integer enrollCount;

	/**
	 * xy_wemeet.updatetime 更新时间
	 * @mbggenerated  Wed Jun 04 11:41:06 CST 2014
	 */
	private Date updatetime;

	/**
	 * xy_wemeet.systime 系统时间
	 * @mbggenerated  Wed Jun 04 11:41:06 CST 2014
	 */
	private Date systime;

	/**
	 * xy_wemeet.former_pic 回顾封面
	 * @mbggenerated  Wed Jun 04 11:41:06 CST 2014
	 */
	private String formerPic;

	/**
	 * xy_wemeet.id 主键
	 * @return  the value of xy_wemeet.id
	 * @mbggenerated  Wed Jun 04 11:41:06 CST 2014
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * xy_wemeet.id 主键
	 * @param id  the value for xy_wemeet.id
	 * @mbggenerated  Wed Jun 04 11:41:06 CST 2014
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * xy_wemeet.userid 约见人
	 * @return  the value of xy_wemeet.userid
	 * @mbggenerated  Wed Jun 04 11:41:06 CST 2014
	 */
	public String getUserid() {
		return userid;
	}

	/**
	 * xy_wemeet.userid 约见人
	 * @param userid  the value for xy_wemeet.userid
	 * @mbggenerated  Wed Jun 04 11:41:06 CST 2014
	 */
	public void setUserid(String userid) {
		this.userid = userid;
	}

	/**
	 * xy_wemeet.meet_title 标题
	 * @return  the value of xy_wemeet.meet_title
	 * @mbggenerated  Wed Jun 04 11:41:06 CST 2014
	 */
	public String getMeetTitle() {
		return meetTitle;
	}

	/**
	 * xy_wemeet.meet_title 标题
	 * @param meetTitle  the value for xy_wemeet.meet_title
	 * @mbggenerated  Wed Jun 04 11:41:06 CST 2014
	 */
	public void setMeetTitle(String meetTitle) {
		this.meetTitle = meetTitle;
	}

	/**
	 * xy_wemeet.meet_type 约见类型:0免费 1付费
	 * @return  the value of xy_wemeet.meet_type
	 * @mbggenerated  Wed Jun 04 11:41:06 CST 2014
	 */
	public Integer getMeetType() {
		return meetType;
	}

	/**
	 * xy_wemeet.meet_type 约见类型:0免费 1付费
	 * @param meetType  the value for xy_wemeet.meet_type
	 * @mbggenerated  Wed Jun 04 11:41:06 CST 2014
	 */
	public void setMeetType(Integer meetType) {
		this.meetType = meetType;
	}

	/**
	 * xy_wemeet.meet_active 是否上架 0：未上架 1：已上架
	 * @return  the value of xy_wemeet.meet_active
	 * @mbggenerated  Wed Jun 04 11:41:06 CST 2014
	 */
	public Integer getMeetActive() {
		return meetActive;
	}

	/**
	 * xy_wemeet.meet_active 是否上架 0：未上架 1：已上架
	 * @param meetActive  the value for xy_wemeet.meet_active
	 * @mbggenerated  Wed Jun 04 11:41:06 CST 2014
	 */
	public void setMeetActive(Integer meetActive) {
		this.meetActive = meetActive;
	}

	/**
	 * xy_wemeet.meet_status 约见状态 0：进行中 1：已结束
	 * @return  the value of xy_wemeet.meet_status
	 * @mbggenerated  Wed Jun 04 11:41:06 CST 2014
	 */
	public Integer getMeetStatus() {
		return meetStatus;
	}

	/**
	 * xy_wemeet.meet_status 约见状态 0：进行中 1：已结束
	 * @param meetStatus  the value for xy_wemeet.meet_status
	 * @mbggenerated  Wed Jun 04 11:41:06 CST 2014
	 */
	public void setMeetStatus(Integer meetStatus) {
		this.meetStatus = meetStatus;
	}

	/**
	 * xy_wemeet.is_top 置顶状态 0:默认不置顶 1:置顶
	 * @return  the value of xy_wemeet.is_top
	 * @mbggenerated  Wed Jun 04 11:41:06 CST 2014
	 */
	public Integer getIsTop() {
		return isTop;
	}

	/**
	 * xy_wemeet.is_top 置顶状态 0:默认不置顶 1:置顶
	 * @param isTop  the value for xy_wemeet.is_top
	 * @mbggenerated  Wed Jun 04 11:41:06 CST 2014
	 */
	public void setIsTop(Integer isTop) {
		this.isTop = isTop;
	}

	/**
	 * xy_wemeet.is_hot 热门状态 0:默认非热门 1:热门
	 * @return  the value of xy_wemeet.is_hot
	 * @mbggenerated  Wed Jun 04 11:41:06 CST 2014
	 */
	public Integer getIsHot() {
		return isHot;
	}

	/**
	 * xy_wemeet.is_hot 热门状态 0:默认非热门 1:热门
	 * @param isHot  the value for xy_wemeet.is_hot
	 * @mbggenerated  Wed Jun 04 11:41:06 CST 2014
	 */
	public void setIsHot(Integer isHot) {
		this.isHot = isHot;
	}

	/**
	 * xy_wemeet.provinceid 省份ID
	 * @return  the value of xy_wemeet.provinceid
	 * @mbggenerated  Wed Jun 04 11:41:06 CST 2014
	 */
	public Integer getProvinceid() {
		return provinceid;
	}

	/**
	 * xy_wemeet.provinceid 省份ID
	 * @param provinceid  the value for xy_wemeet.provinceid
	 * @mbggenerated  Wed Jun 04 11:41:06 CST 2014
	 */
	public void setProvinceid(Integer provinceid) {
		this.provinceid = provinceid;
	}

	/**
	 * xy_wemeet.cityid 城市ID
	 * @return  the value of xy_wemeet.cityid
	 * @mbggenerated  Wed Jun 04 11:41:06 CST 2014
	 */
	public Integer getCityid() {
		return cityid;
	}

	/**
	 * xy_wemeet.cityid 城市ID
	 * @param cityid  the value for xy_wemeet.cityid
	 * @mbggenerated  Wed Jun 04 11:41:06 CST 2014
	 */
	public void setCityid(Integer cityid) {
		this.cityid = cityid;
	}

	/**
	 * xy_wemeet.meet_place 约见地点
	 * @return  the value of xy_wemeet.meet_place
	 * @mbggenerated  Wed Jun 04 11:41:06 CST 2014
	 */
	public String getMeetPlace() {
		return meetPlace;
	}

	/**
	 * xy_wemeet.meet_place 约见地点
	 * @param meetPlace  the value for xy_wemeet.meet_place
	 * @mbggenerated  Wed Jun 04 11:41:06 CST 2014
	 */
	public void setMeetPlace(String meetPlace) {
		this.meetPlace = meetPlace;
	}

	/**
	 * xy_wemeet.latitude 纬度
	 * @return  the value of xy_wemeet.latitude
	 * @mbggenerated  Wed Jun 04 11:41:06 CST 2014
	 */
	public Double getLatitude() {
		return latitude;
	}

	/**
	 * xy_wemeet.latitude 纬度
	 * @param latitude  the value for xy_wemeet.latitude
	 * @mbggenerated  Wed Jun 04 11:41:06 CST 2014
	 */
	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}

	/**
	 * xy_wemeet.longitude 经度
	 * @return  the value of xy_wemeet.longitude
	 * @mbggenerated  Wed Jun 04 11:41:06 CST 2014
	 */
	public Double getLongitude() {
		return longitude;
	}

	/**
	 * xy_wemeet.longitude 经度
	 * @param longitude  the value for xy_wemeet.longitude
	 * @mbggenerated  Wed Jun 04 11:41:06 CST 2014
	 */
	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}

	/**
	 * xy_wemeet.meet_time 约见时间
	 * @return  the value of xy_wemeet.meet_time
	 * @mbggenerated  Wed Jun 04 11:41:06 CST 2014
	 */
	public String getMeetTime() {
		return meetTime;
	}

	/**
	 * xy_wemeet.meet_time 约见时间
	 * @param meetTime  the value for xy_wemeet.meet_time
	 * @mbggenerated  Wed Jun 04 11:41:06 CST 2014
	 */
	public void setMeetTime(String meetTime) {
		this.meetTime = meetTime;
	}

	/**
	 * xy_wemeet.post_weibo 是否发微博 0:不发送 1：发微博
	 * @return  the value of xy_wemeet.post_weibo
	 * @mbggenerated  Wed Jun 04 11:41:06 CST 2014
	 */
	public Integer getPostWeibo() {
		return postWeibo;
	}

	/**
	 * xy_wemeet.post_weibo 是否发微博 0:不发送 1：发微博
	 * @param postWeibo  the value for xy_wemeet.post_weibo
	 * @mbggenerated  Wed Jun 04 11:41:06 CST 2014
	 */
	public void setPostWeibo(Integer postWeibo) {
		this.postWeibo = postWeibo;
	}

	/**
	 * xy_wemeet.view_count 访问量
	 * @return  the value of xy_wemeet.view_count
	 * @mbggenerated  Wed Jun 04 11:41:06 CST 2014
	 */
	public Integer getViewCount() {
		return viewCount;
	}

	/**
	 * xy_wemeet.view_count 访问量
	 * @param viewCount  the value for xy_wemeet.view_count
	 * @mbggenerated  Wed Jun 04 11:41:06 CST 2014
	 */
	public void setViewCount(Integer viewCount) {
		this.viewCount = viewCount;
	}

	/**
	 * xy_wemeet.show_count 前端显示的报名人数
	 * @return  the value of xy_wemeet.show_count
	 * @mbggenerated  Wed Jun 04 11:41:06 CST 2014
	 */
	public Integer getShowCount() {
		return showCount;
	}

	/**
	 * xy_wemeet.show_count 前端显示的报名人数
	 * @param showCount  the value for xy_wemeet.show_count
	 * @mbggenerated  Wed Jun 04 11:41:06 CST 2014
	 */
	public void setShowCount(Integer showCount) {
		this.showCount = showCount;
	}

	/**
	 * xy_wemeet.enroll_count 报名人数
	 * @return  the value of xy_wemeet.enroll_count
	 * @mbggenerated  Wed Jun 04 11:41:06 CST 2014
	 */
	public Integer getEnrollCount() {
		return enrollCount;
	}

	/**
	 * xy_wemeet.enroll_count 报名人数
	 * @param enrollCount  the value for xy_wemeet.enroll_count
	 * @mbggenerated  Wed Jun 04 11:41:06 CST 2014
	 */
	public void setEnrollCount(Integer enrollCount) {
		this.enrollCount = enrollCount;
	}

	/**
	 * xy_wemeet.updatetime 更新时间
	 * @return  the value of xy_wemeet.updatetime
	 * @mbggenerated  Wed Jun 04 11:41:06 CST 2014
	 */
	public Date getUpdatetime() {
		return updatetime;
	}

	/**
	 * xy_wemeet.updatetime 更新时间
	 * @param updatetime  the value for xy_wemeet.updatetime
	 * @mbggenerated  Wed Jun 04 11:41:06 CST 2014
	 */
	public void setUpdatetime(Date updatetime) {
		this.updatetime = updatetime;
	}

	/**
	 * xy_wemeet.systime 系统时间
	 * @return  the value of xy_wemeet.systime
	 * @mbggenerated  Wed Jun 04 11:41:06 CST 2014
	 */
	public Date getSystime() {
		return systime;
	}

	/**
	 * xy_wemeet.systime 系统时间
	 * @param systime  the value for xy_wemeet.systime
	 * @mbggenerated  Wed Jun 04 11:41:06 CST 2014
	 */
	public void setSystime(Date systime) {
		this.systime = systime;
	}

	/**
	 * xy_wemeet.former_pic 回顾封面
	 * @return  the value of xy_wemeet.former_pic
	 * @mbggenerated  Wed Jun 04 11:41:06 CST 2014
	 */
	public String getFormerPic() {
		return formerPic;
	}

	/**
	 * xy_wemeet.former_pic 回顾封面
	 * @param formerPic  the value for xy_wemeet.former_pic
	 * @mbggenerated  Wed Jun 04 11:41:06 CST 2014
	 */
	public void setFormerPic(String formerPic) {
		this.formerPic = formerPic;
	}

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 378533717027622996L;

	/**
     * 约见人
     */
    private User user;
    /**
     * 详细
     */
    private List<XyWemeetItem> items;
    
    /**
     * 回顾
     */
    private List<XyWemeetFormer> formers;
	/**
	 * 报名状态
	 */
	private Integer enroll;
	/**
	 * 是否存在回顾
	 */
	private Integer hasFormer;
	/**
	 * 省份
	 */
	private String province;
	/**
	 * 城市
	 */
	private String city;
	/**
	 * WEB版URL
	 */
	private String url;
	/**
	 * 带报名的WEB版URL
	 */
	private String enrollUrl;	
	/**
	 * 首页封面
	 */
	private String coverPic;
	/**
	 * 列表图片
	 */
	private String listPic;
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public List<XyWemeetItem> getItems() {
		return items;
	}

	public void setItems(List<XyWemeetItem> items) {
		this.items = items;
	}

	public List<XyWemeetFormer> getFormers() {
		return formers;
	}

	public void setFormers(List<XyWemeetFormer> formers) {
		this.formers = formers;
	}

	public Integer getEnroll() {
		return enroll;
	}

	public void setEnroll(Integer enroll) {
		this.enroll = enroll;
	}

	public Integer getHasFormer() {
		return hasFormer;
	}

	public void setHasFormer(Integer hasFormer) {
		this.hasFormer = hasFormer;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getCoverPic() {
		return coverPic;
	}

	public void setCoverPic(String coverPic) {
		this.coverPic = coverPic;
	}

	public String getListPic() {
		return listPic;
	}

	public void setListPic(String listPic) {
		this.listPic = listPic;
	}

	public String getEnrollUrl() {
		return enrollUrl;
	}

	public void setEnrollUrl(String enrollUrl) {
		this.enrollUrl = enrollUrl;
	}
}