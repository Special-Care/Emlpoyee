# Emlpoyee
设计员工表（Employee）有以下字段
	id，年龄，姓名，性别，地址
注册git账号（coding，码云都可以）：

1.	手动搭建SSM框架，不能使用springboot搭建，需要手动原生spring整合。
注意：需要用Maven进行管理、尽量遵循resultful开发风格
（需要加入统一异常处理和事务管理）
整合完成后运行，找错，运行无问题后，将运行截图在world文档中，完成后上传一个git。

2.	完成员工增删改查开发，返回json数据即可。需要在添加员工和修改员工加入springmvc校验处理，校验字段是否合法，尽量遵循resultful开发风格。运行无问题后，将运行成功截图在word文档中，完成后上传一次git。
3.	编写发送短信验证接口，可以对接（阿里大于，互亿无线等短信平台），短信发送无问题后，将运行成功截图到word文档中，完成后上传一次git。
4.	设计一个单点登录系统，实现手机验证码登录和找回密码，登录信息使用jwt无状态存储。
5.	对接蚂蚁支付沙箱环境，对接完成后使用springcloud搭建字符微服务，在支付异步通知使用zookeeper实现分布式锁。
6.	将支付微服务项目发布到linux服务器中，可以在虚拟机安装centos7，可以直接使用linux发布也可以使用docker，将发布成功运行成功截图到word文档中。