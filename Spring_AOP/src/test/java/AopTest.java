import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import top.mowang.aop.UserDao;

/**
 * Spring-quick-start
 * test
 *
 * @author : Xuan Li
 * @website : https://mowangblog.top
 * @date : 2021/10/05 16:29
 **/
public class AopTest {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("aop.xml");
        UserDao userDao = applicationContext.getBean("userDao", UserDao.class);
        userDao.add();
    }
}
