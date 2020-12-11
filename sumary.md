####自动装配时的xml配置文件模板####
```xml
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xmlns:context="http://www.springframework.org/schema/context"
       xsi:schemaLocation="http://www.springframework.org/schema/beans
        https://www.springframework.org/schema/beans/spring-beans.xsd
        http://www.springframework.org/schema/context
        https://www.springframework.org/schema/context/spring-context.xsd">
    <context:annotation-config/>
</beans>
```
####使用注解开发####
```
-@Autowired 默认通过byType查找，然后通过byName查找，当Autowire不能唯一装配时，
可通过@Qualifier(value = "...")来定义需要使用哪个实体;
-@Nullable 字段标记了这个注解，说明这个字段可以为null;
-@Component 组件，放在类上，说明这个类被Spring管理了，就是配置了一个bean;
    -@Controller servlet层
    -@Service   service层
    -@Repository dao层
-@Scope(singleton) 范围 
-@Configuration 配置类 相当于一个配置文件 beans.xml 
                这个类也会被Spring托管，注册到容器中，因为它也是一个@Component 
    -@Bean 注册一个bean，就相当于我们写的一个bean标签
            方法的名字相当于标签中的id属性
            方法的类型相当于标签中的class属性
-@ComponentScan("com.example") 扫描哪个包下的bean
-@Import() 导入其他配置类
```
#####Spring AOP######
```
横切关注点 : 跨越应用程序多个模块的方法或功能。即是，与我们业务逻辑无关的，但是我们需要关注的部分，
           就是横切关注点。如：日志，安全，缓存，事务等等...
切面(aspect) : 横切关注点被模块化的特殊对象，即为一个类。
通知(advice) : 切面必须要完成的工作。即，它时类中的一个方法。
目标(target) : 被通知对象。
代理(proxy) : 向目标对象应用通知之后的创建的对象。
切入点(pointcut) : 切面通知执行的"地点"的定义。
连接点(jointPoint) : 与切入点匹配的执行点。 
```
######编写Mybatis程序流程#######
```
1.编写mybatis-config.xml核心配置文件
2.编写实体类(pojo)
3.编写对应mapper(pojomapper.xml)
4.注册mapper   (maven静态资源加载问题)
5.测试
```
######编写Mybatis-Spring程序流程#######
```
1.dataSource
    driverClassName
    url
    username
    password
2.SqlSessionFactory
    dataSource
    configLocation
    mapperLocations
3.SqlSession
    <constructor-arg index="0" ref="sqlSessionFactory"/>
4.接口实现类 implements
5.注测实现类
    sqlSession
6.测试
```