import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import top.mowang.pojo.Dept;
import top.mowang.pojo.User;

import java.util.Map;

/**
 * Spring-quick-start
 * 测试注入集合和数组
 *
 * @author : Xuan Li
 * @website : https://mowangblog.top
 * @date : 2021/10/04 16:48
 **/
public class TestIoc {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
        //测试注入集合和数组
        Dept dept = context.getBean("dept", Dept.class);
        System.out.println(dept);
        context.close();
    }
}
