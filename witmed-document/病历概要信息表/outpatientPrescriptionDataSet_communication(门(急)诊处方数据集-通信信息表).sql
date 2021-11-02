drop table if exists outpatientPrescriptionDataSet_communication;
create table outpatientPrescriptionDataSet_communication(
	id varchar(100) not null comment '主键',
	medicalRecordSummary varchar(100) comment '病历摘要信息',
	phoneCategory varchar(100) comment '联系电话-类别',
	phoneCategoryCode varchar(100) comment '联系电话-类别代码',
	phoneNum varchar(100) comment '联系电话-号码',
    email varchar(100) comment '电子邮件地址',
    status varchar(10) not null default 1 comment '系统状态：0-禁用，1-启用',
	createUser varchar(100) comment '创建人',
	createTime timestamp not null default current_Timestamp comment '创建时间',
	updateUser varchar(100) comment '修改人',
	updateTime timestamp not null default current_Timestamp  on update current_Timestamp comment '修改时间',
	primary key(id)
)engine=Innodb charset=utf8mb4 comment='门(急)诊处方数据集-通信信息表';