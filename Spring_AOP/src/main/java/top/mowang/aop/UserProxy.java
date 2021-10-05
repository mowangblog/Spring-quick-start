package top.mowang.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * Spring-quick-start
 * 增强
 *
 * @author : Xuan Li
 * @website : https://mowangblog.top
 * @date : 2021/10/05 16:17
 **/
@Component
@Aspect
public class UserProxy {

    /**
     * @description: 抽取公用切入点
     * @author: Xuan Li
     * @date: 2021/10/5 17:19
    */
    @Pointcut(value = "execution(* top.mowang.aop.UserDao.add(..))")
    public void demo(){};

    /**
     * @description:  @Before表示作为前置通知 @Order表示执行优先级
     * @author: Xuan Li
     * @date: 2021/10/5 16:29
    */
    @Before(value = "demo()")
    @Order(1)
    public void before(){
        System.out.println("前置增强方法2");
    }

    /**
     * @description:  @After表示作为后置最终通知
     * @author: Xuan Li
     * @date: 2021/10/5 16:29
     */
    @After(value = "demo()")
    public void after(){
        System.out.println("后置增强方法");
    }

    /**
     * @description:  @AfterReturning 表示作为后置返回时通知
     * @author: Xuan Li
     * @date: 2021/10/5 16:29
     */
    @AfterReturning(value = "demo()")
    public void afterReturning(){
        System.out.println("后置返回时增强方法");
    }

    /**
     * @description:  @AfterReturning 表示作为后置异常时通知
     * @author: Xuan Li
     * @date: 2021/10/5 16:29
     */
    @AfterThrowing(value = "demo()")
    public void afterThrowing(){
        System.out.println("后置异常时增强方法");
    }

    /**
     * @description:  @Around 表示作为环绕通知
     * @author: Xuan Li
     * @date: 2021/10/5 16:29
     */
    @Around(value = "demo()")
    public void around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("环绕前置增强方法");
        proceedingJoinPoint.proceed();
        System.out.println("环绕后置增强方法");
    }

}
