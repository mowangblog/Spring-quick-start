import org.springframework.context.support.ClassPathXmlApplicationContext;
import top.mowang.dao.impl.UserDaoImpl;
import top.mowang.service.UserService;
import top.mowang.service.impl.UserServiceImpl;

/**
 * Spring-quick-start
 * 测试
 *
 * @author : Xuan Li
 * @website : https://mowangblog.top
 * @date : 2021/10/04 14:45
 **/
public class MyTest {
    public static void main(String[] args) {
        //加载spring配置文件
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext
                ("application.xml");
        //获取配置文件中配置的对象
        UserService userService =  context.getBean("userService",UserServiceImpl.class);

        //获取配置文件中配置的对象,外部注入bean之后就可以不用自己传了
//        ((UserServiceImpl) userService).setUserDao(
//                context.getBean("userDao",UserDaoImpl.class));
        userService.getUser();
    }
}
