import org.springframework.context.support.ClassPathXmlApplicationContext;
import top.mowang.pojo.User;
import top.mowang.service.impl.BookServiceImpl;

/**
 * Spring-quick-start
 *
 * @author : Xuan Li
 * @website : https://mowangblog.top
 * @date : 2021/10/05 17:57
 **/
public class JdbcTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("jdbc.xml");
        BookServiceImpl bookServiceImpl = context.getBean("bookServiceImpl", BookServiceImpl.class);
//        bookServiceImpl.add(new User("lixuan","123456","2623872023@qq.com"));
//        bookServiceImpl.update(new User(3,"李煊","123456","mowangblog@qq.com"));
//        bookServiceImpl.delete(new User(1,"lixuan","123456","2623872023@qq.com"));
        bookServiceImpl.selectAll();
    }
}
