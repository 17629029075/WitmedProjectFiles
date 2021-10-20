package cn.ekgc.witmed.base.pojo.entity;

import java.io.Serializable;

/**
 * <b>系统基础信息类 - 基础实体信息类</b>
 * <p>
 *     基础实体信息包含以下属性：<br/>
 *     1、系统状态：status <br/>
 *     2、创建人：createUser <br/>
 *     3、创建时间：createTime <br/>
 *     4、修改人：updateUser <br/>
 *     5、修改时间：updateTime <br/>
 *     所有功能的实体信息<b>都必须继承于本基础实体类</b>
 * </p>
 * @author Administrator
 * @version 1.0.0
 * @since 1.0.0
 */
public class BaseEntity implements Serializable {
	private static final long serialVersionUID = 3563582030558185082L;
	
	private String status;                  //系统状态：0-禁用  1-启用
	private String createUser;              //创建人
	private String createTime;              //创建时间
	private String updateUser;              //修改人
	private String updatetime;              //修改时间
	
	public String getStatus() {
		return status;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}
	
	public String getCreateUser() {
		return createUser;
	}
	
	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}
	
	public String getCreateTime() {
		return createTime;
	}
	
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}
	
	public String getUpdateUser() {
		return updateUser;
	}
	
	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}
	
	public String getUpdatetime() {
		return updatetime;
	}
	
	public void setUpdatetime(String updatetime) {
		this.updatetime = updatetime;
	}
}
