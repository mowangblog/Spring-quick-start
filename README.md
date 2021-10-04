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


## IOC（概念和原理）

1. 什么是IOC
   - 控制反转，把对象创建对象之间的调用过程，交给Spring进行管理
   - 为了降低耦合度
2. IOC底层原理
   -    xml解析、工厂模式、反射

## IOC（接口）

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

## IOC操作Bean管理

1. 什么是Bean管理
   - Spring创建对象
   - Spring注入属性
2. Bean管理操作的两种方式
   - 基于xml配置文件方式
   - 基于注解方式实现

