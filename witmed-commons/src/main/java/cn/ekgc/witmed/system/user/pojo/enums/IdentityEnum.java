package cn.ekgc.witmed.system.user.pojo.enums;

public enum IdentityEnum {
	IDENTITY_ADMIN(IdentityEnumConstants.IDENTITY_ADMIN, "行政人员"),
	IDENTITY_DOCTOR(IdentityEnumConstants.IDENTITY_DOCTOR, "医生"),
	IDENTITY_NURSE(IdentityEnumConstants.IDENTITY_NURSE, "医生"),
	;
	private String code;        // 身份编码
	private String remark;      // 说明
	
	IdentityEnum(String code, String remark) {
		this.code = code;
		this.remark = remark;
	}
	
	public String getCode() {
		return code;
	}
	
	public void setCode(String code) {
		this.code = code;
	}
	
	public String getRemark() {
		return remark;
	}
	
	public void setRemark(String remark) {
		this.remark = remark;
	}
}
