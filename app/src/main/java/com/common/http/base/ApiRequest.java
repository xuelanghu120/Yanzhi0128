package com.common.http.base;

import com.common.common.XYConfig;

/**
 *
 * @param <T>
 */
public class ApiRequest<T> {
	AppClient client;
	/**
	 * app类型: android/iphone/ipad
	 */
	String appSystem= XYConfig.PLATFORM;
	/**
	 * 企业版标识(用于双证书push)
	 */
	String ent;
	/**
	 * app版本
	 */
	String appVersion=XYConfig.VERSION;
	/**
	 * 何种微博登录 ： sina/qq
	 */
	String loginType;

	/**
	 * 格式 ：目前只支持json
	 */
	String format=XYConfig.REQUESTFORMAT;
	/**
	 * 请求Token：登录时可以忽略
	 */
	String token;
	/**
	 * 每次请求的ID，防止提交重复请求
	 */
	String callid;
	/**
	 * 请求对象
	 */
	T req;
	/**
	 * 用于API日志的ID
	 */
	Long logId;
	/**
	 * 安全验证码
	 */
	String v;
	/**
	 * 是否为企业版，1为企业版，Null为非企业版
	 */
	String plus;
	/**
	 * 渠道
	 */
	String channel;

	/**
	 * @return the appVersion
	 */
	public String getAppVersion() {
		return appVersion;
	}

	/**
	 * @param appVersion
	 *            the appVersion to set
	 */
	public void setAppVersion(String appVersion) {
		this.appVersion = appVersion;
	}

	/**
	 * @return the token
	 */
	public String getToken() {
		return token;
	}

	/**
	 * @param token
	 *            the token to set
	 */
	public void setToken(String token) {
		this.token = token;
	}

	/**
	 * @return the req
	 */
	public T getReq() {
		return req;
	}

	/**
	 * @param req
	 *            the req to set
	 */
	public void setReq(T req) {
		this.req = req;
	}

	/**
	 * @return the client
	 */
	public AppClient getClient() {
		return client;
	}

	/**
	 * @param client
	 *            the client to set
	 */
	public void setClient(AppClient client) {
		this.client = client;
	}

	/**
	 * @return the appSystem
	 */
	public String getAppSystem() {
		return appSystem;
	}

	/**
	 * @param appSystem
	 *            the appSystem to set
	 */
	public void setAppSystem(String appSystem) {
		this.appSystem = appSystem;
	}

	/**
	 * @return the format
	 */
	public String getFormat() {
		return format;
	}

	/**
	 * @param format
	 *            the format to set
	 */
	public void setFormat(String format) {
		this.format = format;
	}

	/**
	 * @return the callid
	 */
	public String getCallid() {
		return callid;
	}

	/**
	 * @param callid
	 *            the callid to set
	 */
	public void setCallid(String callid) {
		this.callid = callid;
	}

	/**
	 * @return the weibo
	 */
	public String getLoginType() {
		return loginType;
	}

	/**
	 * @param weibo
	 *            the weibo to set
	 */
	public void setLoginType(String weibo) {
		this.loginType = weibo;
	}

	/**
	 * 
	 * @see Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((appSystem == null) ? 0 : appSystem.hashCode());
		result = prime * result
				+ ((appVersion == null) ? 0 : appVersion.hashCode());
		result = prime * result + ((callid == null) ? 0 : callid.hashCode());
		result = prime * result + ((client == null) ? 0 : client.hashCode());
		result = prime * result + ((format == null) ? 0 : format.hashCode());
		result = prime * result
				+ ((loginType == null) ? 0 : loginType.hashCode());
		result = prime * result + ((req == null) ? 0 : req.hashCode());
		result = prime * result + ((token == null) ? 0 : token.hashCode());
		return result;
	}

	/**
	 * 
	 * @see Object#equals(Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof ApiRequest)) {
			return false;
		}
		ApiRequest<?> other = (ApiRequest<?>) obj;
		if (appSystem == null) {
			if (other.appSystem != null) {
				return false;
			}
		} else if (!appSystem.equals(other.appSystem)) {
			return false;
		}
		if (appVersion == null) {
			if (other.appVersion != null) {
				return false;
			}
		} else if (!appVersion.equals(other.appVersion)) {
			return false;
		}
		if (callid == null) {
			if (other.callid != null) {
				return false;
			}
		} else if (!callid.equals(other.callid)) {
			return false;
		}
		if (client == null) {
			if (other.client != null) {
				return false;
			}
		} else if (!client.equals(other.client)) {
			return false;
		}
		if (format == null) {
			if (other.format != null) {
				return false;
			}
		} else if (!format.equals(other.format)) {
			return false;
		}
		if (loginType == null) {
			if (other.loginType != null) {
				return false;
			}
		} else if (!loginType.equals(other.loginType)) {
			return false;
		}
		if (req == null) {
			if (other.req != null) {
				return false;
			}
		} else if (!req.equals(other.req)) {
			return false;
		}
		if (token == null) {
			if (other.token != null) {
				return false;
			}
		} else if (!token.equals(other.token)) {
			return false;
		}
		return true;
	}

	/**
	 * 
	 * @see Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ApiRequest [");
		if (client != null) {
			builder.append("client=");
			builder.append(client);
			builder.append(", ");
		}
		if (appSystem != null) {
			builder.append("appSystem=");
			builder.append(appSystem);
			builder.append(", ");
		}
		if (appVersion != null) {
			builder.append("appVersion=");
			builder.append(appVersion);
			builder.append(", ");
		}
		if (loginType != null) {
			builder.append("loginType=");
			builder.append(loginType);
			builder.append(", ");
		}
		if (format != null) {
			builder.append("format=");
			builder.append(format);
			builder.append(", ");
		}
		if (token != null) {
			builder.append("token=");
			builder.append(token);
			builder.append(", ");
		}
		if (callid != null) {
			builder.append("callid=");
			builder.append(callid);
			builder.append(", ");
		}
		// if (req != null) {
		// builder.append("req=");
		// builder.append(req);
		// }
		builder.append("]");
		return builder.toString();
	}

	public Long getLogId() {
		return logId;
	}

	public void setLogId(Long logId) {
		this.logId = logId;
	}

	public String getV() {
		return v;
	}

	public void setV(String v) {
		this.v = v;
	}

	public String getEnt() {
		return ent;
	}

	public void setEnt(String ent) {
		this.ent = ent;
	}

	public String getPlus() {
		return plus;
	}

	public void setPlus(String plus) {
		this.plus = plus;
	}

	public String getChannel() {
		return channel;
	}

	public void setChannel(String channel) {
		this.channel = channel;
	}

}
