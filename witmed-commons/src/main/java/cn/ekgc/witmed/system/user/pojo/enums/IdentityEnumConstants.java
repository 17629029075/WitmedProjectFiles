package cn.ekgc.witmed.system.user.pojo.enums;

import java.io.IOException;
import java.util.Properties;

class IdentityEnumConstants {
	private static Properties properties = new Properties();
	
	// 使用静态代码块加载配置信息
	static {
		try {
			properties.load(IdentityEnumConstants.class.getClassLoader().getResourceAsStream("props/system/identity.properties"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	/**
	 * <b>系统人员身份信息：行政人员</b>
	 */
	static final String IDENTITY_ADMIN=properties.getProperty("identity.admin");
	/**
	 * <b>系统人员身份信息：医生</b>
	 */
	static final String IDENTITY_DOCTOR=properties.getProperty("identity.doctor");
	/**
	 * <b>系统人员身份信息：护士</b>
	 */
	static final String IDENTITY_NURSE=properties.getProperty("identity.nurse");
}
