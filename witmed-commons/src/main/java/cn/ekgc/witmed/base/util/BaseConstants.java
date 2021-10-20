package cn.ekgc.witmed.base.util;

import io.swagger.models.auth.In;
import jdk.internal.org.objectweb.asm.tree.TryCatchBlockNode;

import java.util.Properties;

/**
 * <b>系统基础信息类 - 系统常量类</b>
 * @author Administrator
 * @version 1.0.0
 * @since 1.0.0
 */
public class BaseConstants {
	private static Properties properties = new Properties();
	
	static {
		try {
			properties.load(BaseConstants.class.getClassLoader().getResourceAsStream("props/base/base.properties"));
		} catch (Exception e ){
			e.printStackTrace();
		}
	}
	
	/**
	 * <b>分页信息：默认当前页码</b>
	 */
	public static final Integer PAGE_NUM = Integer.parseInt(properties.getProperty("base.page.num"));
	/**
	 * <b>分页信息：默认显示数量</b>
	 */
	public static final Integer PAGE_SIZE = Integer.parseInt(properties.getProperty("base.page.size"));
	/**
	 * <b>Token密钥信息</b>
	 */
	public static final String SECRET_KEY = properties.getProperty("base.secret");
	/**
	 * <b>默认登录时长（秒）</b>
	 */
	public static final Long EXPIRE_AUTH_SECOND = Long.parseLong(properties.getProperty("base.expire.auth.second"));
}
