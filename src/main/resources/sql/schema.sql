DROP TABLE IF EXISTS department;
CREATE TABLE IF NOT EXISTS `department`(
  `id` INT PRIMARY KEY AUTO_INCREMENT COMMENT '部门号',
  `name` VARCHAR(200) COMMENT '部门名',
  `count` int COMMENT '人数'
) COMMENT='部门信息';

DROP TABLE IF EXISTS employee;
CREATE TABLE IF NOT EXISTS `employee`(
  `id` INT PRIMARY KEY AUTO_INCREMENT COMMENT '主键',
  `lastName` VARCHAR(200) COMMENT '员工名',
  `email` VARCHAR(200) COMMENT '邮箱',
  `gender` VARCHAR(2) COMMENT '性别',
  `d_id` int COMMENT '部门号'
) COMMENT='员工表';