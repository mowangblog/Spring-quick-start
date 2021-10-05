import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import top.mowang.config.SpringConfig;
import top.mowang.pojo.AnnotationDemo;
import top.mowang.pojo.User;
import top.mowang.pojo.User2;
import top.mowang.pojo.User3;

/**
 * Spring-quick-start
 * 测试ioc
 *
 * @author : Xuan Li
 * @website : https://mowangblog.top
 * @date : 2021/10/04 15:44
 **/
public class Test {
    public static void main(String[] args) {
        //完全注解开发 AnnotationConfigApplicationContext
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        //测试注解方法注入
        AnnotationDemo annotationDemo = context.getBean("annotationDemo", AnnotationDemo.class);
        annotationDemo.add();

    }
}
