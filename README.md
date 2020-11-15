#分层项目Spring boot (IDEA)版本
##9.27
###
新建项目,[^层次结构]

[^层次结构]:Controller,Service,Entity,Mapper,mapper

1. Controler层(控制层,业务操作层)
    - 实现页面的跳转
    - 调用服务
    - 异常处理[暂未实现]
    - 表单校验[暂未实现]
2. entity层(别名:pojo,实体层 数据库在项目中的类)
    - 数据库在项目中的类
    - 实体层,也就是model也称pojo层
    - 实体类的属性和对应属性的set、get方法
3. Mapper(DAO层,持久层 主要与数据库进行交互)
    - Mybatis逆向工程生成的mapper层
    - Mapper(Dao)层会调用entity层,会定义实际使用到的方法CRUD
    - 实体类的属性和对应属性的set、get方法
    - Mapper层的数据源和数据库连接的参数都是在配置文件中进行配置的(.properties or .yml)
    - 数据持久化操作就是指,把数据放到持久化的介质中,同时提供增删改查操作
    - CRUD的方法用 同名.xml 中sql语句进行操作
    - .xml文件在 ***IDEA中*** 一般放在src/main/resources 文件夹
    - 在IDEA需要在.properties或者是.yml中注明 xml的文件位置在哪个路径
4. Service层：业务层 控制业务
    - Service层主要负责业务模块的逻辑应用设计
    - 先设计放接口的类,再创建实现的类,然后在配置文件中进行配置其实现的关联
    - service层调用mapper层接口,接收mapper层返回的数据,完成项目的基本功能设计
    
5. 业务逻辑总结
    * Controller-->service接口-->serviceImpl-->dao接口-->daoImpl-->mapper-->db


在具体的项目中，其流程为：Controller层调用Service层的方法，

Service层调用Dao层中的方法，其中调用的参数是使用Entity层进行传递的。

总的来说这样每层做什么的分类只是为了使业务逻辑更加清晰，

写代码更加方便，所以有时候也需要根据具体情况来，但是大体的都是这样处理的，

因为它其实就是提供一种规则，让你把相同类型的代码放在一起，这样就形成了层次，

从而达到分层解耦、复用、便于测试和维护的目的。


配置文件一般在同层的XML文件夹中。

数据持久化操作就是指，把数据放到持久化的介质中，同时提供增删改查操作。
     
# #
