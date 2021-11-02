drop table if exists outpatientPrescriptionDataSet_medicalInsurance;
create table outpatientPrescriptionDataSet_medicalInsurance(
	id varchar(100) not null comment '主键',
	medicalRecordSummary varchar(100) comment '病历摘要信息',
	medicalInsuranceCategory varchar(100) comment '医疗保险-类别',
	medicalInsuranceCategoryCode varchar(100) comment '医疗保险-类别代码',
	MedicaltreatmentName varchar(100) comment '医疗待遇名称',
    MedicaltreatmentCode varchar(100) comment '医疗待遇代码',
    status varchar(10) not null default 1 comment '系统状态：0-禁用，1-启用',
	createUser varchar(100) comment '创建人',
	createTime timestamp not null default current_Timestamp comment '创建时间',
	updateUser varchar(100) comment '修改人',
	updateTime timestamp not null default current_Timestamp  on update current_Timestamp comment '修改时间',
	primary key(id)
)engine=Innodb charset=utf8mb4 comment='门(急)诊处方数据集-医保信息表';