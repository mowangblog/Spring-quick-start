# Spring-quick-start
⚡Spring框架快速入门 ，详细笔记查漏补缺

## Spring框架概述

1. Spring 是轻量级的开源JavaEE框架

2. Spring 可以解决企业应用开发的复杂性

3. Spring 有两个核心部分：IOC和AOP

   - IOC：控制反转，把创建对象的过程交给Spring管理
   - AOP：面向切面，不修改源代码的情况下进行功能增强

4. Spring特点

   | Spring特点                      | 特性介绍                                                     |
   | ------------------------------- | :----------------------------------------------------------- |
   | **1.方便解耦，简化开发**        | 通过Spring可以避免硬编码所造成的过度程序耦合。用户不必再为很底层的需求编写代码，可以更专注于上层的应用。 |
   | **2.AO编程的支持**              | 通过Spring提供的功能，方便进行面向切面的编程，许多不容易用传统OOP实现的功能可以通过AOP轻松应付。 |
   | **3.声明式事务的支持**          | 在Spring中，我们可以从单调烦闷的事务管理代码中解脱出来，通过声明式方式灵活地进行事务的管理，提高开发效率和质量。 |
   | **4.方便程序的测试**            | 可以用非容器依赖的编程方式进行几乎所有的测试工作。例如：Spring对Junit4支持，可以通过注解方便的测试Spring程序。 |
   | **5.方便集成各种优秀框架**      | Spring可以降低各种框架的使用难度，Spring提供了对各种优秀框架（如Struts,Hibernate、Hessian、Quartz）等的直接支持。 |
   | **6.降低Java EE API的使用难度** | Spring对很多难用的Java EE API（如JDBC，JavaMail，远程调用等）提供了一个薄薄的封装层，通过Spring的简易封装，这些Java EE API的使用难度大为降低。 |
   | **7.Java 源码是经典学习范例**   | Spring的源码设计精妙、结构清晰、匠心独运，处处体现着大师对Java设计模式灵活运用以及对Java技术的高深造诣。 |


## IOC概念

1. 什么是IOC
   - 控制反转，把对象创建对象之间的调用过程，交给Spring进行管理
   - 为了降低耦合度
2. IOC底层原理
   -    xml解析、工厂模式、反射

## IOC接口

1. IOC 思想基于IOC容器完成，容器底层就是对象工厂

2. Spring 提供IOC容器实现两种方式：

   1. BeanFactory：IOC容器基本实现，是Spring内部的使用接口，不提供给开发人员使用

      *加载配置文件使不会加载对象，在使用对象时才会创建对象

   2. ApplicationContext： BeanFactory的子接口，提供更强大的功能，一般由开发人员使用

      *加载配置文件时候就会创建对象

3. ApplicationContext实现类

   1. ```
      ClassPathXmlApplicationContext
      ```

   2. ```
      FileSystemXmlApplicationContext
      ```

## IOC操作

1. 什么是Bean管理

   - Spring创建对象
   - Spring注入属性

2. Bean管理操作的两种方式

   - 基于xml配置文件方式
   - 基于注解方式实现

3. Bean的生命周期

   1. 无参构造创建bean实例

   2. 为bean的属性设置值和对其他bean引用

   3. 调用bean的初始化方法 (需进行配置)

      *（如果有后置处理器会执行后置处理器的初始化之前和之后的方法）

   4. bean可以使用了

   5. 当容器关闭时，调用bean销毁方法 (需进行配置)

4. 常用注解

   - Bean注解
     1. @Component
     2. @Service
     3. @Controller
     4. @Repository
   - 属性注解
     1. @AutoWired ：根据属性类型自动注入
     2. @Qualifier：根据属性名称自动注入
     3. @Resource：既可以根据类型也可以根据名称
     4. @Value：注入普通类型属性

## AOP概念

1. 什么是AOP
   - 不修改源代码添加新功能
   - 利用面向切面编程可以对业务逻辑的各个部分进行隔离，从而使得业务逻辑各部分之间的耦合度降低，提高程序的可重用性，同时提高了开发的效率。
2. AOP底层原理
   - AOP底层使用动态代理 （两种情况）
     1. 有接口时使用JDK动态代理
     2. 没有接口时使用CGLIB动态代理
3. AOP（术语）
   1. 连接点（类里可被增强的方法被称为连接点）
   2. 切入点（实际被增强的方法被称为切入点 ）
   3. 通知（增强）
      - 实际增强的逻辑被称为通知（增强）
      - 通知的多种类型
        1. 前置通知
        2. 后置通知
        3. 环绕通知
        4. 异常通知
        5. 最终通知
   4. 切面（把通知应用到切入点的过程就是切面）

## AOP操作

1. Spring框架一般都是基于AspectJ实现AOP操作
   - AspectJ不是Spring组成部分，独立于AOP框架，一般把AspectJ和Spring框架一起使用，进行AOP操作
2. 基于AspectJ实现AOP操作
   - 基于xml配置文件实现
   - 基于注解方式实现
     1. 创建被增强和增强的列
3. 切入点表达式
   - 作用：知道对哪个类的哪个方法进行增强
   - 语法结构：execution([权限修饰符] [返回值类型] [类路径] [方法名称] [参数列表]
     - 例子1：execution(* top.mowang.dao.UserDao.add(...)) 对类中add方法进行增强
     - 例子2：execution(* top.mowang.dao.UserDao.*(...)) 对类中所有方法进行增
     - 例子2：execution(* top.mowang.dao.* . *(...)) 对所有类中所有方法进行

## 事务

1. 事务是数据库操作的基本单元，逻辑上一组操作，要么都成功，要么都失败

2. 事务四个特性

   - 原子性
   - 一致性
   - 隔离性
   - 持久性

3. Spring事务操作

   - 事务添加到Service层

   - 事务管理两种方式：编程式事务管理和声明式事务管理（一般使用声明式）

   - 声明式事务管理

     1. 基于注解方式
     2. 基于xml文件配置文件方式
     3. 底层使用AOP原理

   - 事务注解参数

   - ```
     propagation 事务传播行为
     ioslation 事务隔离级别
     timout 超时时间
     readonly 是否只读
     rollbackFor 回滚
     ```

   - [事务隔离级别](https://mowangblog.top/mowang/mysql)

   - 事务传播行为 

![img](https://res.mowangblog.top/img/2021/10/20170420212829825)



## Spring5

1. Spring5框架基于JDK8，运行时兼容JDK9，许多不建议使用的类和方法被移除
2. Spring5框架自带了通用日志封装
3. Spring5框架核心容器支持@Nullable注解
   - 使用在方式上表示方法返回值可以为空
   - 使用在方法参数里面表示方法参数可以为空
   - 使用在属性上面，表示属性值可以为空
4. Spring5框架核心容器支持函数式风格GenericApplicationContext
5. Spring5框架支持整合junit

## Webflux

