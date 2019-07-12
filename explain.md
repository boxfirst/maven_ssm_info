# ssm_crud

## 需求

1. 通过程序管理对应的数据文件
2. 实现单表的增删改查
3. 实现数据校验
4. 简单的美观页面

## 环境

1. java运行时环境：jdk 1.8

2. 服务器：Tomcat 8.5

3. 依赖管理：maven 3.6

4. 使用的框架：

   1. spring 5.1.5.RELEASE

   2. mybatis 3.5.1

   3. springMVC 5.1.5.RELEASE

   4. log4j 1.2.17

   5. Junit 4.12

   6. mysql 5.1.47

   7. c3p0 0.9.5.2

   8. bootstrap 3.3.7

      ## 项目说明

      1. 项目使用ssm框架，简单整合，实现用户信息的增删改查分页等操作
      2. 使用mybatis逆向工程生成对应的实体操作
      3. 使用bootstrap实现简单美观的页面
      4. 使用spring进行解耦，实现依赖注入，事务管理
      5. 使用springMVC进行前端页面的跳转控制
      6. 大量使用ajax进行操作，使用requestbody进行数据传输
      7. 实现了单个修改，批量或单个删除

## 数据库设计

#### infor表：

 ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8

| 字段          | 说明     | 长度               | 主键 |
| ------------- | -------- | ------------------ | ---- |
| inforid       | 主键     | bigint(20)         | 主键 |
| infornumber   | 账号     | varchar(20)        |      |
| inforname     | 姓名     | varchar(20)        |      |
| sex           | 性别     | enum('boy','girl') |      |
| inforage      | 年龄     | int(11)            |      |
| inforpassword | 密码     | varchar(32)        |      |
| inforphone    | 电话     | varchar(11)        |      |
| jobid         | 职务主键 | int(11)            | 外键 |
| registdate    | 注册时间 | timestamp          |      |

#### job表

 ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8

| 字段     | 说明     | 长度         | 主键 |
| -------- | -------- | ------------ | ---- |
| jobid    | 主键     | int(11)      | 主键 |
| jobname | 职务名称 | varchar(255) |      |