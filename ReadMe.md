#添加依赖
#数据库的文件在resources的ddl包下面 记得application.yml中的数据库改成自己的

##启动类SpringBootMybatisApplication中MapperScan的路径是持久层mapper接口的位置 对应mapper包表示回去扫描对应的接口注入和spring容器
##配置文件中的mapper-locations 是指 对应的mapper接口对应的mapper.xml的位置



##启动项目访问 localhost:8081/test/inquiry2 记得请求方式post
##在head中添加 Content-Type  application/json
##在body中添加访问数据  {"name":"gucci"}