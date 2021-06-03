# 演示项目 

```
快速构建一个java程序，打出日志
测试日志收集程序
filebeat    ->  kafka   ->  logstash    ->  elasticsearch   ->  kibana
/logs/1/info日志
/logs/2/debug日志
/logs/3/err日志

```
```
jre8镜像
docker pull anapsix/alpine-java:8u201b09_server-jre_nashorn

docker run -d -v /home/project/demo:/jar -v /home/project/demo/logs:/logs -v /etc/localtime:/etc/localtime -p 8081:8081 --name springboot-demo anapsix/alpine-java:8u201b09_server-jre_nashorn java -jar -Duser.timezone=GMT+08 /jar/demo-0.0.1-SNAPSHOT.jar
```

# 测试接口
```
curl -i -X GET http://127.0.0.1:8081/logs/1/testlogs
curl -i -X GET http://127.0.0.1:8081/logs/2/testlogs
curl -i -X GET http://127.0.0.1:8081/logs/3/testlogs


tail -fn 30  /home/project/demo/logs/debug.log

2021-05-19 22:28:45.194 ERROR 1 --- [http-nio-8081-exec-1] c.e.demo.controller.DemoController       : 这是一个error级别的:testlogs
2021-05-19 22:29:43.404  INFO 1 --- [http-nio-8081-exec-2] c.e.demo.controller.DemoController       : 这是一个info级别的:testlogs
2021-05-19 22:29:47.593 ERROR 1 --- [http-nio-8081-exec-4] c.e.demo.controller.DemoController       : 这是一个error级别的:testlogs
2021-05-19 22:29:55.026  INFO 1 --- [http-nio-8081-exec-8] c.e.demo.controller.DemoController       : 这是一个info级别的:testlogs
```

# 添加RPC调用
```
把go项目中的proto文件
头部添加
option java_package = "com.example.demo.rpc";
option java_outer_classname= "Historydata";

生成java代码
protoc --java_out=./ historydata.proto

maven引用依赖包
io.etcd:jetcd-core:0.5.0
com.google.protobuf:protobuf-java:3.17.1
<grpc.version>1.27.1</grpc.version>


maven->Plugins->protobuf->protobuf:compile
生成的文件路径：target/generated-sources/protobuf

使用
1.调用etcd客户端工具
2.以前缀的方式查找key
3.取出value值获取rpc服务的地址和端口
4.创建channel生成一个Grpc对象
5.调用远程方法并获取结果
6.提供api接口供前端调用
```
