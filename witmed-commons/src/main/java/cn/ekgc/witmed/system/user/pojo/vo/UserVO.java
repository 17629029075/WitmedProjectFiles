package cn.ekgc.witmed.system.user.pojo.vo;

import cn.ekgc.witmed.base.pojo.vo.BaseVO;
import cn.ekgc.witmed.system.user.pojo.entity.User;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.beans.BeanUtils;

/**
 * <b>系统功能模块 - 基础用户视图信息</b>
 * @author Administrator
 * @version 1.0.0
 */
@ApiModel(value = "系统功能模块 - 基础用户视图信息")
public class UserVO extends BaseVO {
	private static final long serialVersionUID = 7308793403668803330L;
	@ApiModelProperty(value = "主键")
	private String id;                      // 主键
	@ApiModelProperty(value = "姓名")
	private String name;                    // 姓名
	@ApiModelProperty(value = "手机号码")
	private String cellphone;               // 手机号码
	@ApiModelProperty(value = "登录密码")
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
	 * <b>将实体对象复制到视图对象中</b>
	 * @param entity
	 * @return
	 */
	public static UserVO getVOFromEntity(User entity) {
		// 创建视图对象
		UserVO vo = new UserVO();
		// 使用 Spring 所提供的 CopyProperties 提取实体对象属性值，填充到视图对象属性上
		BeanUtils.copyProperties(entity, vo);
		return vo;
	}
}
