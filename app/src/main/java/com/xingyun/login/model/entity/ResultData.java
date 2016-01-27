/**
 * ResultData.java created at 2013-3-14 下午2:48:11 by ShimonXin
 */
package com.xingyun.login.model.entity;


/**
 * 结果数据
 * @author ShimonXin
 * @created 2013-3-14
 * 
 */
public class ResultData<T> {
	private T result;

	public ResultData(T result) {
		super();
		this.result = result;
	}

	public T getResult() {
		return result;
	}

	public void setResult(T result) {
		this.result = result;
	}
}
