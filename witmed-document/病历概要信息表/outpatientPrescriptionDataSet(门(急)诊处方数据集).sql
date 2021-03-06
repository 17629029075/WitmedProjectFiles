drop table if exists outpatientPrescriptionDataSet;
create table outpatientPrescriptionDataSet(
	id varchar(100) not null comment '主键',
	docName varchar(100) comment '文档标识-名称',
	docCode varchar(100) comment '文档标识-类别代码',
	docOrgName varchar(100) comment '文档标识-管理机构名称',
	docOrgCode varchar(100) comment '文档标识-管理机构组织机构代码（法人代码）',
	docNo varchar(100) comment '文档标识-号码',
	docEffectiveDate datetime comment '文档标识-生效日期',
	docExpirationDate datetime comment '文档标识-失效日期',

	srvCodeCategory varchar(100) comment '标识号-类别代码',
	srvNo varchar(100) comment '标识号-号码',
	srvCodeEffectiveDate datetime comment '标识号-生效日期',
	srvCodeExpirationDate datetime comment '标识号-失效日期',
	srvCodeOrgName varchar(100) comment '标识号-提供标识的机构名称',
	srvCategory varchar(100) comment '姓名-标识对象',
	srvCategoryCode varchar(100) comment '姓名-标识对象代码',
	srvName varchar(100) comment '姓名',
	srvTypeCode varchar(100) comment '病人类型代码',

	genderCode varchar(100) comment '性别代码',
	age int(10) comment '年龄（岁）',
	nationalityCodes varchar(100) comment '国籍代码',
	nationalcode varchar(100) comment '民族代码',
	maritalCode varchar(100) comment '婚姻状况类别代码',
	occupationName varchar(100) comment '职业编码系统名称',
	occupationCode varchar(100) comment '职业代码',
	birthday date comment '出生日期',
	birthPlace varchar(100) comment '出生地',

	workUnitName varchar(100) comment '工作单位名称',
	addressCategoryCode varchar(100) comment '标识地址类别的代码',
	addressProvince varchar(100) comment '地址-省（自治区、直辖市）',
	addressCity varchar(100) comment '地址-市（地区）',
	addressCounty varchar(100) comment '地址-县（区）',
	addressTownship  varchar(100) comment '地址-乡（镇、街道办事处）',
	addressVillage varchar(100) comment '地址-村（街、路、弄等）',
	addressNumber varchar(100) comment '地址-门牌号码',
	postalCode varchar(100) comment '邮政编码',
	areaNumber varchar(100) comment '行政区划代码',

	orgName varchar(100) comment '机构名称',
	orgCode varchar(100) comment '机构组织机构代码',
	orgCharge varchar(100) comment '机构负责人（法人）',
	orgAddress varchar(100) comment '机构地址',
	officeName varchar(100) comment '科室名称',
	officeRole varchar(100) comment '机构角色',
	officeRoleCode varchar(100) comment '机构角色代码',

	servicerName varchar(100) comment '服务者姓名',
	servicerRole varchar(100) comment '服务者职责（角色）',
	servicerRoleCode varchar(100) comment '服务者职责（角色）代码',
	servicerTechPosition varchar(100) comment '服务者专业技术职务',
	servicerBackground varchar(100) comment '服务者学历',
	servicerMajor varchar(100) comment '服务者所学专业',
	servicerTechPositionRank varchar(100) comment '服务者专业技术职务等级',
	servicerPosition varchar(100) comment '服务者职务',

	healthEvents varchar(100) comment '卫生事件(动作)名称',
	eventSortCode varchar(100) comment '事件分类代码',
	eventstartTime datetime comment '事件开始时间',
	eventEndTime datetime comment '事件结束时间',
	eventMechanismName varchar(100) comment '事件发生地点',
	eventPlace  varchar(100) comment '事件发生场所',
	eventParticipants varchar(100) comment '事件参与方',
	eventCause varchar(100) comment '事件发生原因',
	eventOutcome varchar(100) comment '事件结局',
	observationCategory varchar(100) comment '观察-类别',
	observationCategoryCode varchar(100) comment '观察-类别代码',
	observationItemName varchar(100) comment '观察项目名称',
	observationItemCode varchar(100) comment '观察-项目代码',
	observationResultDescription varchar(100) comment '观察-结果描述',

	diagnosisOrganizationName varchar(100) comment '诊断机构名称',
	diagnosisDate datetime comment '诊断日期',
	diagnosticCategory varchar(100) comment '诊断类别',
	diagnosticCategoryCode varchar(100) comment '诊断类别代码',
	diagnosticSequenceCode varchar(100) comment '诊断顺位（从属关系）代码',
	diseaseName varchar(100) comment '疾病名称',
	diseaseCode varchar(100) comment '疾病代码',
	diagnosticBasis varchar(100) comment '诊断依据',
	diagnosticBasisCode varchar(100) comment '诊断依据代码',

	treatmentProcessName varchar(100) comment '诊疗过程名称',
	treatmentProcessDescription varchar(100) comment '诊疗过程描述',

	status varchar(10) not null default 1 comment '系统状态：0-禁用，1-启用',
	createUser varchar(100) comment '创建人',
	createTime timestamp not null default current_Timestamp comment '创建时间',
	updateUser varchar(100) comment '修改人',
	updateTime timestamp not null default current_Timestamp  on update current_Timestamp comment '修改时间',
	primary key(id)
)engine=Innodb charset=utf8mb4 comment='门(急)诊处方数据集信息表';
-- outpatientPrescriptionDataSet_communication(门(急)诊处方数据集-通信信息表).sql
-- outpatientPrescriptionDataSet_contactperson(门(急)诊处方数据集-联系人信息表).sql
-- outpatientPrescriptionDataSet_historydisease(门(急)诊处方数据集-疾病（外伤）史信息表).sql
-- outpatientPrescriptionDataSet_medicalInsurance(门(急)诊处方数据集-医保信息表).sql
-- outpatientPrescriptionDataSet_medication(门(急)诊处方数据集-用药信息表).sql