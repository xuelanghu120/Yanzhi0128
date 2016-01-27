/**
 * 
 */
package com.xingyun.login.entity;

import android.databinding.BaseObservable;

import java.io.Serializable;

/**
 * 通用基础Id、Name数据
 * @author LHC
 *
 */
public class BaseIdNameData extends BaseObservable implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer dataId;
	
	private String dataName;

	public BaseIdNameData() {
		
	}
	
	public BaseIdNameData(Integer id) {
		dataId = id;
	}
	
	public BaseIdNameData(Integer id, String name) {
		dataId = id;
		dataName = name;
	}
	
	/**
	 * @return the dataId
	 */
	public Integer getDataId() {
		return dataId;
	}

	/**
	 * @param dataId the dataId to set
	 */
	public void setDataId(Integer dataId) {
		this.dataId = dataId;
	}

	/**
	 * @return the dataName
	 */
	public String getDataName() {
		return dataName;
	}

	/**
	 * @param dataName the dataName to set
	 */
	public void setDataName(String dataName) {
		this.dataName = dataName;
	}
}
