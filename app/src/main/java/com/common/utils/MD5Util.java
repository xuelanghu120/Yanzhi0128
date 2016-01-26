/**
 * MD5Util.java created at 2013-3-15 下午2:45:12 by ShimonXin
 */
package com.common.utils;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * MD5Util
 * 
 * @author ShimonXin
 * @created 2013-3-15
 * 
 */
public class MD5Util {

	public static String toHexString(byte[] bytes) {
		StringBuffer sb = new StringBuffer(bytes.length * 2);
		for (int i = 0; i < bytes.length; i++) {
			sb.append(Character.forDigit((bytes[i] & 0XF0) >> 4, 16));
			sb.append(Character.forDigit(bytes[i] & 0X0F, 16));
		}
		return sb.toString();
	}

	public static String md5(String src) {
		MessageDigest md;
		try {
			md = MessageDigest.getInstance("MD5");
			if (md != null && src != null) {
				md.update(src.getBytes());
				return toHexString(md.digest());
			}
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
		return src;

	}
}
