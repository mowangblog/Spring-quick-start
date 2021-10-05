package top.mowang.aop;

import org.springframework.stereotype.Component;

/**
 * Spring-quick-start
 * aop
 *
 * @author : Xuan Li
 * @website : https://mowangblog.top
 * @date : 2021/10/05 16:16
 **/
@Component
public class UserDao {


    public void add(){
        System.out.println("原来的方法执行");
    }
}
