drop table if exists outpatientPrescriptionDataSet_historydisease;
create table outpatientPrescriptionDataSet_historydisease(
	id varchar(100) not null comment '主键',
	medicalRecordSummary varchar(100) comment '病历摘要信息',
	historyPreviousDisease varchar(100) comment '既往疾病史',
	previousPsychiatricDiagnosesNames varchar(100) comment '既往精神类疾病诊断名称',
	previousDiseaseName varchar(100) comment '既往疾病名称',
	previousDiseaseCodes varchar(100) comment '既往疾病代码',
	diagnosticInstitutions varchar(100) comment '既往疾病诊断机构',
	diagnosticInstitutionsCode varchar(100) comment '既往疾病诊断机构级别代码',
	diagnosticInstitutionsTime datetime comment '既往疾病诊断时间',
    diseaseCurrentStatusCode varchar(100) comment '疾病当前状态代码',
  	status varchar(10) not null default 1 comment '系统状态：0-禁用，1-启用',
	createUser varchar(100) comment '创建人',
	createTime timestamp not null default current_Timestamp comment '创建时间',
	updateUser varchar(100) comment '修改人',
	updateTime timestamp not null default current_Timestamp  on update current_Timestamp comment '修改时间',
	primary key(id)
)engine=Innodb charset=utf8mb4 comment='门(急)诊处方数据集-疾病（外伤）史信息表';