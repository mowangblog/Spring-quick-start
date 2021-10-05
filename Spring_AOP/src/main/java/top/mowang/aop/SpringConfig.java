package top.mowang.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * Spring-quick-start
 * spring配置类,完全注解开发
 *
 * @author : Xuan Li
 * @website : https://mowangblog.top
 * @date : 2021/10/05 00:58
 **/
@Configuration
@ComponentScan(basePackages = "top.mowang")
@EnableAspectJAutoProxy
public class SpringConfig {

}
