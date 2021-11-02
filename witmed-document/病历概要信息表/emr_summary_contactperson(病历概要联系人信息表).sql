drop table if exists emr_summary_contactperson;
create table emr_summary_contactperson(
	id varchar(100) not null comment '主键',
	medicalRecordSummary varchar(100) comment '病历摘要信息',
	srvCodeCategory varchar(100) comment '标识号-类别代码',
	srvNo varchar(100) comment '标识号-号码',
	srvCodeEffectiveDate datetime comment '标识号-生效日期',
	srvCodeExpirationDate datetime comment '标识号-失效日期',
	srvCodeOrgName varchar(100) comment '标识号-提供标识的机构名称',
	srvCategory varchar(100) comment '姓名-标识对象',
	srvCategoryCode varchar(100) comment '姓名-标识对象代码',
	srvName varchar(100) comment '姓名',
  	status varchar(10) not null default 1 comment '系统状态：0-禁用，1-启用',
	createUser varchar(100) comment '创建人',
	createTime timestamp not null default current_Timestamp comment '创建时间',
	updateUser varchar(100) comment '修改人',
	updateTime timestamp not null default current_Timestamp  on update current_Timestamp comment '修改时间',
	primary key(id)
)engine=Innodb charset=utf8mb4 comment='病历概要联系人信息表';