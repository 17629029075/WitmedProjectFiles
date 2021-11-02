package cn.ekgc.witmed.system.user.pojo.entity;

import cn.ekgc.witmed.base.pojo.entity.BaseEntity;
import cn.ekgc.witmed.system.user.pojo.vo.UserVO;
import org.springframework.beans.BeanUtils;

/**
 * <b>系统功能模块 - 基础用户实体信息</b>
 * @author Administrator
 * @version 1.0.0
 */
public class User extends BaseEntity {
	private static final long serialVersionUID = -1568629942318602060L;
	private String id;                      // 主键
	private String name;                    // 姓名
	private String cellphone;               // 手机号码
	private String password;                // 登录密码
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getCellphone() {
		return cellphone;
	}
	
	public void setCellphone(String cellphone) {
		this.cellphone = cellphone;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * <b>将视图对象复制到实体对象中</b>
	 * @param vo
	 * @return
	 */
	public static User getEntityFromVO(UserVO vo) {
		// 创建实体对象
		User entity = new User();
		// 将视图对象属性值，复制到实体对象中
		BeanUtils.copyProperties(vo, entity);
		return entity;
	}
}
