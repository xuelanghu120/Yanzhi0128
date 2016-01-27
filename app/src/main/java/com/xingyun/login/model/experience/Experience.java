package com.xingyun.login.model.experience;

import android.databinding.BaseObservable;

import java.io.Serializable;
import java.util.List;


/**
 * 体验
 * 
 * @author ShimonXin
 *
 */
public class Experience extends BaseObservable implements Serializable{
	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -3764423157350604866L;
	Integer bizid;// 商家ID
	String authorId; // 最新体验人ＩＤ
	String authorNickname; // 最新体验人昵称
	String authorLogo; // 最新体验人头像
	Integer payUser; // 最新体验人是否颜值用户
	Integer verified; // 最新体验人是否认证用户

	String title; // 体验标题
	Integer signInCount; // 签到个数
	Integer favoriteCount; // 收藏个数
	Integer experienceCount; // 体验个数

	String experienceAddress; // 体验地址
	Double longitude; // 经度
	Double latitude; // 纬度
	String contact; // 联系方式
	Integer averageSpend; // 人均消费
	Integer distance; // 距离

//	// 操作时间
//	private Date systime;

	List<ExperienceUser> experienceUsersArray; // 体验用户列表
	List<ExperienceUser> signInUsersArray; // 签到用户列表
	List<NearbyBizLink> links; //外链列表
	/**
	 * 用户是否收藏
	 */
	private Integer isFavor;
	/**
	 * 用户是否签到
	 */
	private Integer isCheckin;


	public Integer getIsFavor() {
		return isFavor;
	}

	public void setIsFavor(Integer isFavor) {
		this.isFavor = isFavor;
	}

	public Integer getIsCheckin() {
		return isCheckin;
	}

	public void setIsCheckin(Integer isCheckin) {
		this.isCheckin = isCheckin;
	}

	public String getAuthorId() {
		return authorId;
	}

	public void setAuthorId(String authorId) {
		this.authorId = authorId;
	}

	public String getAuthorNickname() {
		return authorNickname;
	}

	public void setAuthorNickname(String authorNickname) {
		this.authorNickname = authorNickname;
	}

	public String getAuthorLogo() {
		return authorLogo;
	}

	public void setAuthorLogo(String authorLogo) {
		this.authorLogo = authorLogo;
	}

	public Integer getPayUser() {
		return payUser;
	}

	public void setPayUser(Integer payUser) {
		this.payUser = payUser;
	}

	public Integer getVerified() {
		return verified;
	}

	public void setVerified(Integer verified) {
		this.verified = verified;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Integer getSignInCount() {
		return signInCount;
	}

	public void setSignInCount(Integer signInCount) {
		this.signInCount = signInCount;
	}

	public Integer getFavoriteCount() {
		return favoriteCount;
	}

	public void setFavoriteCount(Integer favoriteCount) {
		this.favoriteCount = favoriteCount;
	}

	public Integer getExperienceCount() {
		return experienceCount;
	}

	public void setExperienceCount(Integer experienceCount) {
		this.experienceCount = experienceCount;
	}

	public String getExperienceAddress() {
		return experienceAddress;
	}

	public void setExperienceAddress(String experienceAddress) {
		this.experienceAddress = experienceAddress;
	}

	public Double getLongitude() {
		return longitude;
	}

	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}

	public Double getLatitude() {
		return latitude;
	}

	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public Integer getAverageSpend() {
		return averageSpend;
	}

	public void setAverageSpend(Integer averageSpend) {
		this.averageSpend = averageSpend;
	}

	public Integer getDistance() {
		return distance;
	}

	public void setDistance(Integer distance) {
		this.distance = distance;
	}

	public List<ExperienceUser> getExperienceUsersArray() {
		return experienceUsersArray;
	}

	public void setExperienceUsersArray(List<ExperienceUser> experienceUsersArray) {
		this.experienceUsersArray = experienceUsersArray;
	}

	public Integer getBizid() {
		return bizid;
	}

	public void setBizid(Integer bizid) {
		this.bizid = bizid;
	}

	public List<ExperienceUser> getSignInUsersArray() {
		return signInUsersArray;
	}

	public void setSignInUsersArray(List<ExperienceUser> signInUsersArray) {
		this.signInUsersArray = signInUsersArray;
	}

//	/**
//	 * @return the systime
//	 */
//	public Date getSystime() {
//		return systime;
//	}
//
//	/**
//	 * @param systime the systime to set
//	 */
//	public void setSystime(Date systime) {
//		this.systime = systime;
//	}

	@Override
	public String toString() {
		return "Experience [bizid=" + bizid + ", authorId=" + authorId
				+ ", authorNickname=" + authorNickname + ", authorLogo="
				+ authorLogo + ", payUser=" + payUser + ", verified="
				+ verified + ", title=" + title + ", signInCount="
				+ signInCount + ", favoriteCount=" + favoriteCount
				+ ", experienceCount=" + experienceCount
				+ ", experienceAddress=" + experienceAddress + ", longitude="
				+ longitude + ", latitude=" + latitude + ", contact=" + contact
				+ ", averageSpend=" + averageSpend + ", distance=" + distance
				+ ", experienceUsersArray="
				+ experienceUsersArray + ", signInUsersArray="
				+ signInUsersArray + ", isFavor=" + isFavor + ", isCheckin="
				+ isCheckin + "]";
	}

	public List<NearbyBizLink> getLinks() {
		return links;
	}

	public void setLinks(List<NearbyBizLink> links) {
		this.links = links;
	}
}
