/**
 * UploadPicture.java created at 2013-2-21 下午3:21:39 by ShimonXin
 */
package com.xingyun.login.upload;

import android.databinding.BaseObservable;

import java.io.Serializable;


/**
 * 上传图片
 * 
 * @author ShimonXin
 * @created 2013-2-21
 * 
 */


public class UploadPicture extends BaseObservable implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -1289503666374474906L;
	private String id;// 客户端ID **
	private String tempPath; // 上传原图path
	private Integer width; // 图片宽度
	private Integer height; // 图片高度
	private Integer midwidth; // 大图片宽度
	private Integer midheight; // 大图片高度
	private String fileName;
	private String contentType;
	private Long filesize;

	private Integer logoId;
	/**
	 * @return the tempPath
	 */
	public String getTempPath() {
		return tempPath;
	}

	public UploadPicture() {
	}

	public UploadPicture(String id, Integer width, Integer height, String fileName,
			String contentType, Long filesize) {
		super();
		this.id = id;
		this.width = width;
		this.height = height;
		this.fileName = fileName;
		this.contentType = contentType;
		this.filesize = filesize;
	}

	/**
	 * @param tempPath
	 *            the tempPath to set
	 */
	public void setTempPath(String tempPath) {
		this.tempPath = tempPath;
	}

	/**
	 * @return the width
	 */
	public Integer getWidth() {
		return width;
	}

	public UploadPicture(String id, Integer width, Integer height) {
		super();
		this.id = id;
		this.width = width;
		this.height = height;
	}

	/**
	 * @param width
	 *            the width to set
	 */
	public void setWidth(Integer width) {
		this.width = width;
	}

	/**
	 * @return the height
	 */
	public Integer getHeight() {
		return height;
	}

	/**
	 * @param height
	 *            the height to set
	 */
	public void setHeight(Integer height) {
		this.height = height;
	}

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the fileName
	 */
	public String getFileName() {
		return fileName;
	}

	/**
	 * @param fileName
	 *            the fileName to set
	 */
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	/**
	 * @return the contentType
	 */
	public String getContentType() {
		return contentType;
	}

	/**
	 * @param contentType
	 *            the contentType to set
	 */
	public void setContentType(String contentType) {
		this.contentType = contentType;
	}

	/**
	 * @return the filesize
	 */
	public Long getFilesize() {
		return filesize;
	}

	/**
	 * @param filesize
	 *            the filesize to set
	 */
	public void setFilesize(Long filesize) {
		this.filesize = filesize;
	}

	/**
	 * @return the logoId
	 */
	public Integer getLogoId() {
		return logoId;
	}

	/**
	 * @param logoId the logoId to set
	 */
	public void setLogoId(Integer logoId) {
		this.logoId = logoId;
	}

	public Integer getMidwidth() {
		return midwidth;
	}

	public void setMidwidth(Integer midwidth) {
		this.midwidth = midwidth;
	}

	public Integer getMidheight() {
		return midheight;
	}

	public void setMidheight(Integer midheight) {
		this.midheight = midheight;
	}
}
