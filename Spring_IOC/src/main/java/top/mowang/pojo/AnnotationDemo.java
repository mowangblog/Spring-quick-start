package top.mowang.pojo;

import org.springframework.stereotype.Component;

/**
 * Spring-quick-start
 * 注解演示
 * Component 中value的值可以省略，默认是类名首字母小写
 *
 * @author : Xuan Li
 * @website : https://mowangblog.top
 * @date : 2021/10/05 00:27
 **/
@Component(value = "annotationDemo")
public class AnnotationDemo {
    public void add(){
        System.out.println("add..");
    }
}
