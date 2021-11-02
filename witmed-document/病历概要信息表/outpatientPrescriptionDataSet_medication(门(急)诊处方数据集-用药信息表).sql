drop table if exists outpatientPrescriptionDataSet_medication;
create table outpatientPrescriptionDataSet_medication(
	id varchar(100) not null comment '主键',
	medicalRecordSummary varchar(100) comment '病历摘要信息',
	drugUsage varchar(100) comment '药物用法',
	drugUseFrequency varchar(100) comment '药物使用-频率',
	drugUseDoseUnits varchar(100) comment '药物使用-剂量单位',
	drugUseDingleDose varchar(100) comment '药物使用-次剂量',
	drugUseTotalDose varchar(100) comment '药物使用-总剂量',
	drugUseRouteCode varchar(100) comment '药物使用-途径代码',
	drugName varchar(100) comment '药物名称',
    drugDosageFormCode varchar(100) comment '药物剂型代码',
    drugType varchar(100) comment '药物类型',
    drugNameCode varchar(100) comment '药物名称代码',
  	status varchar(10) not null default 1 comment '系统状态：0-禁用，1-启用',
	createUser varchar(100) comment '创建人',
	createTime timestamp not null default current_Timestamp comment '创建时间',
	updateUser varchar(100) comment '修改人',
	updateTime timestamp not null default current_Timestamp  on update current_Timestamp comment '修改时间',
	primary key(id)
)engine=Innodb charset=utf8mb4 comment='门(急)诊处方数据集-用药信息表';
