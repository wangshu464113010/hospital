
create table `patient`(
                        p_id varchar(40) primary key comment '病人主键',
                        p_name varchar(20)  comment '病人姓名',
                        p_sex varchar(8) comment '性别',
                        p_age int(3) comment '年龄',
                        p_birthday date comment '出生日期',
                        p_weight double(8,2) comment '体重单位：公斤',
  p_height double(4,2) comment '身高,单位：米',
  P_illness_Date date not null comment '发病日期',
  p_tel varchar(20) not null comment '病人电话号码',
  p_address varchar(60) comment '家庭住址',
  p_Identity_Num varchar(20) not null comment '身份证号码',
  p_rel_person varchar(20) not null comment '关系人姓名',
  p_rel_person_tel varchar(20) not null comment '关系人电话'
  ) engine = innodb charset = utf8 comment '病人信息表';

drop table  if exists `employee`;

create table `employee`(
                         id varchar(40) primary key comment '主键',
                         name varchar(20) not null comment '姓名',
                         serial_num varchar(20) not null unique comment '编号--规则：入职年+部门号+第几人',
                         password varchar(20) not null comment '密码',
                         sex varchar(8) comment '性别',
                         age int(3) comment '年龄',
                         birthday date comment '出生日期',
                         weight double(6,2) comment '体重--单位：公斤',
  height double(4,3) comment '身高--单位：m',
  marriage varchar(10) comment '婚姻状况--已婚/未婚',
  home_position varchar(12) comment '家庭职位',
  blood_type char(3) comment '血型',
  address varchar(50) comment '家庭住址',
  tel varchar(20) comment '电话号码',
  identity_num varchar(20) comment '身份证号码',
  allergy varchar(50) comment '过敏史',
  diploma varchar(10) comment '文凭',
  email varchar(40) unique comment '唯一约束，邮箱',
  state int comment '状态：0=离职，1=在职，2=休息，3=退休',
  sal double comment '工资',
  before_job varchar(20) comment '以前职业'
  )engine = innodb charset =utf8 comment '雇员表-->医生/护士...';

drop table if exists `Registration` ;
create table `Registration`(
                             id varchar(40) primary key comment '主键',
                             serial_num int comment '编号',

                             Department_id varchar(40) comment '科室主键', -- 外键
                             Department_name varchar(20) comment '科室名称',

                             employeeId varchar(40) comment '医生主键', -- 外键
                             employeeName varchar(20) comment '医生姓名',

                             Registration_id varchar(40) comment '挂号员主键',
                             Registration_person varchar(20) comment '挂号员',

                             state int comment '该号的状态,1=就诊，2=已经就诊，3=退号',
                             money_state int comment '收费状态，1=已收费，2=未交费',
                             money double(10,2) comment '挂号费用',
  category int comment '挂号类别：1=专家号，2=普通号',
  pay_way varchar(20) comment '支付方式',

  Registration_date date comment '挂号日期',

  CONSTRAINT `FK_employeeId` FOREIGN KEY (`employeeId`) REFERENCES `employee` (`id`),
  CONSTRAINT `FK_Registration_id` FOREIGN KEY (`Registration_id`) REFERENCES `employee` (`id`),
  CONSTRAINT `FK_Department_id` FOREIGN KEY (`Department_id`) REFERENCES `Department` (`id`)

  )engine = innodb charset =utf8 comment '挂号表';

create table `Department`(
                           id varchar(40) primary key comment '主键',
                           name varchar(20) comment '科室名',

                           disease_id int comment '科室类别主键',
                           category varchar(20) comment '科室类别',

                           person_id varchar(40) comment '负责人主键',
                           person_name varchar(20) comment '负责人姓名',
                           CONSTRAINT `FK_person_id` FOREIGN KEY (`person_id`) REFERENCES `employee` (`id`),
                           CONSTRAINT `FK_disease_id` FOREIGN KEY (`disease_id`) REFERENCES `disease` (`id`)

)engine = innodb charset =utf8 comment '科室表';

-- 疾病分类---科室类别表
create table disease(
                      id int primary key comment '主键',
                      serial_num varchar(40) unique comment '科室编号',
                      name varchar(20) comment '类别',
                      parent_id int comment '所属的父id,无父id使用0'
)engine = innodb charset =utf8 comment '-- 科室类别表';

create table `medical_record`(
                               id varchar(40) primary key comment '主键',
                               allergy varchar(50) comment '过敏史',
                               Diagnostic_type varchar(200) comment '诊断类型',
                               temperature int comment '体温',
                               symptom varchar(200) comment '症状',
                               blood_pressure varchar(20) comment '血压,一段范围',
                               Diagnostic_info varchar(200) comment '诊断信息',
                               Doctor_advice varchar(200) comment '医嘱',

                               breathing varchar(20) comment '呼吸',
                               pulse varchar(20) comment '脉搏',
                               money double comment '治疗费用',
                               consultation_Date date comment '就诊日期',
                               contagion int comment '是否传染：1=是，2=否',
                               Medical_history varchar(40) comment '病史',

                               employee_Id varchar(40) comment '医生主键', -- 外键
                               employee_Name varchar(20) comment '医生姓名',

                               disease_id int comment '疾病类别主键',
                               disease_name varchar(20) comment '疾病类别名',

                               Department_id varchar(40) comment '科室主键',
                               Department_name varchar(20) comment '科室名',

                               CONSTRAINT `FK_mr_employee_Id` FOREIGN KEY (`employee_Id`) REFERENCES `employee` (`id`),
                               CONSTRAINT `FK_mr_disease_id` FOREIGN KEY (`disease_id`) REFERENCES `disease` (`id`),
                               CONSTRAINT `FK_mr_Department_id` FOREIGN KEY (`department_id`) REFERENCES `department` (`id`)
)engine = innodb charset =utf8 comment '病历表';

drop table if exists prescription;
create table `prescription`(
                             id varchar(40) primary key comment '主键',
                             name varchar(20) comment '处方名称',
  -- zhuhao,
                             Drug_usage varchar(40) comment '用法',
                             Single_dose varchar(10) comment '单次用量',
                             day int comment '天数',
                             Frequency varchar(20) comment '频度',
                             total varchar(20) comment '总量',

                             money double comment '价格/单价',
                             remark varchar(50) comment '备注',

                             medical_record_id varchar(40) comment '病历主键',
                             Drug_details_id varchar(40) comment '药品主键',

                             CONSTRAINT `FK_p_medical_record_id` FOREIGN KEY (`medical_record_id`) REFERENCES `medical_record` (`id`),
                             CONSTRAINT `FK_p_Drug_details_id` FOREIGN KEY (`Drug_details_id`) REFERENCES `Drug_details` (`id`)

)engine = innodb charset =utf8 comment '处方表';


drop table if exists Drug_details;
create table `Drug_details`(
                             id varchar(40) primary key comment '主键',
                             serial_num varchar(20) comment '药品编号',
                             Generic_name varchar(40) comment '药品通用名/名称',
                             alias varchar(40) comment '别名',
                             Freight_yard_code varchar(40) comment '货位码',
                             bar_code varchar(40) comment '条形码',
                             category varchar(40) comment '药品类别/分类',
                             Dosage_form varchar(40) comment '药品剂型',
                             Invoice_type varchar(20) comment '发票类型',
                             Medication_type varchar(20) comment '用药类型,处方药/非处方',
                             Approval_number varchar(40) comment '批准文号',
                             factory varchar(40) comment '生产厂家',
                             remark varchar(200) comment '备注',
                             National_essential_drugs bool comment '是否为国家基本药物',
                             Drug_usage varchar(40) comment '用法',
                             Single_dose varchar(10) comment '单次用量',
                             day int comment '天数',
                             Frequency varchar(20) comment '频度',
                             total varchar(20) comment '总量',
                             Drug_Explain varchar(200) comment '药品说明',
                             Effect varchar(200) comment '功效',
                             Side_effects varchar(200) comment '不良反应',
                             Applicable_disease varchar(200) comment '使用症',
                             production_Date date comment '出厂日期期',
                             Validity_period int comment '有效期限',
                             price double comment '价格',
                             other varchar(400) comment '其他'

)engine = innodb charset =utf8 comment '药品表';

create table Accessory_cost(
                             id varchar(40) primary key comment '主键',
                             name varchar(20) comment '名称',
                             money double comment '金额',
                             category varchar(20) comment '费用类型',

                             Medical_record_id varchar(40) comment '病历主键',
                             CONSTRAINT `FK_ac_Medical_record_id` FOREIGN KEY (`Medical_record_id`) REFERENCES `Medical_record` (`id`)

)engine = innodb charset =utf8 comment '附件费用表';

create table data_dictionary(
                              id varchar(40) primary key comment '主键',
                              name varchar(40) comment '名称',
                              parent_id varchar(40) comment '父id，没有用-1代替',
                              create_date date comment '创建时间',
                              update_date date comment '最近一次修改日期',
                              state int comment '状态，0=停用，1=启用'

)engine = innodb charset =utf8 comment '数据字典';










