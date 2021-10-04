import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
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
        ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
        //测试set方法注入
        User user = context.getBean("user", User.class);
        //测试有参构造方法注入属性
        User2 user2 = context.getBean("user2", User2.class);
        //测试p命名空间注入属性
        User3 user3 = context.getBean("user3", User3.class);
        System.out.println(user);
        System.out.println(user2);
        System.out.println(user3);
    }
}
