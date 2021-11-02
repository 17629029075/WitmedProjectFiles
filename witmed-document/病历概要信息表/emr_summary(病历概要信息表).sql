drop table if exists emr_summary;
create table emr_summary(
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
	
	ABOBloodGroup varchar(100) comment 'ABO血型',
	RHBloodGroup varchar(100) comment 'RH血型',

	individualName varchar(100) comment '个体危险性名称',
	individualCode varchar(100) comment '个体危险性代码',

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

    healthEvents varchar(100) comment '卫生事件(动作)名称',
	eventSortCode varchar(100) comment '事件分类代码',
	eventstartTime datetime comment '事件开始时间',
	eventEndTime datetime comment '事件结束时间',
	eventMechanismName varchar(100) comment '事件发生地点',
	eventPlace  varchar(100) comment '事件发生场所',
	eventParticipants varchar(100) comment '事件参与方',
	eventCause varchar(100) comment '事件发生原因',
	eventOutcome varchar(100) comment '事件结局',

    outpatientExpensesClassification varchar(100) comment '门诊费用-分类',
	outpatientExpensesClassificationCode  varchar(100) comment '门诊费用-分类代码',
	outpatientExpensesAmount varchar(100) comment '门诊费用-金额（元/人民币）',
	outpatientExpensesPaymentMethodCode varchar(100) comment '门诊费用-支付方式代码',
	personalExpenses varchar(100) comment '个人承担费用（元）',

	status varchar(10) not null default 1 comment '系统状态：0-禁用，1-启用',
	createUser varchar(100) comment '创建人',
	createTime timestamp not null default current_Timestamp comment '创建时间',
	updateUser varchar(100) comment '修改人',
	updateTime timestamp not null default current_Timestamp  on update current_Timestamp comment '修改时间',
	primary key(id)
)engine=Innodb charset=utf8mb4 comment='病历概要信息表';