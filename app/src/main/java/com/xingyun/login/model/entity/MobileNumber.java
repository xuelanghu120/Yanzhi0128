package com.xingyun.login.model.entity;

import android.databinding.BaseObservable;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class MobileNumber extends BaseObservable implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 6554039855626802380L;
	public static MobileNumber EMPTY = new MobileNumber();
	/**
	 * 国家代码
	 */
	String countryCode;
	/**
	 * 电话号码
	 */
	String mobileNumber;

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String cc) {
		this.countryCode = cc;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String number) {
		this.mobileNumber = number;
	}

	public static MobileNumber toMoblieNumber(String mobile) {
		if (mobile == null) {
			return EMPTY;
		}
		MobileNumber m = new MobileNumber();
		if (mobile.length() < 4) {
			m.setMobileNumber(mobile);
		} else {
			if (mobile.startsWith("+")) {
				String one = mobile.substring(0, 2);
				String two = mobile.substring(0, 3);
				if (ones.contains(one)) {
					m.setCountryCode(one);
					m.setMobileNumber(mobile.substring(2));
				} else if (twos.contains(two)) {
					m.setCountryCode(two);
					m.setMobileNumber(mobile.substring(3));
				} else {
					m.setCountryCode(mobile.substring(0, 4));
					m.setMobileNumber(mobile.substring(4));
				}
			} else {
				m.setMobileNumber(mobile);
			}
		}
		return m;
	}

	public static List<String> ones = new ArrayList<String>();
	static {
		ones.add("+1");
		ones.add("+7");
	}
	public static List<String> twos = new ArrayList<String>();
	static {
		twos.add("+20");
		twos.add("+27");
		twos.add("+30");
		twos.add("+31");
		twos.add("+32");
		twos.add("+33");
		twos.add("+34");
		twos.add("+35");
		twos.add("+36");
		twos.add("+37");
		twos.add("+38");
		twos.add("+39");
		twos.add("+40");
		twos.add("+41");
		twos.add("+42");
		twos.add("+43");
		twos.add("+44");
		twos.add("+45");
		twos.add("+46");
		twos.add("+47");
		twos.add("+48");
		twos.add("+49");
		twos.add("+51");
		twos.add("+52");
		twos.add("+53");
		twos.add("+54");
		twos.add("+55");
		twos.add("+56");
		twos.add("+57");
		twos.add("+58");
		twos.add("+60");
		twos.add("+61");
		twos.add("+62");
		twos.add("+63");
		twos.add("+64");
		twos.add("+65");
		twos.add("+66");
		twos.add("+81");
		twos.add("+82");
		twos.add("+84");
		twos.add("+86");
		twos.add("+90");
		twos.add("+91");
		twos.add("+92");
		twos.add("+93");
		twos.add("+94");
		twos.add("+95");
		twos.add("+98");

	}
}
