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
public class TransactionTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Transaction.xml");
        BookServiceImpl bookServiceImpl = context.getBean("bookServiceImpl", BookServiceImpl.class);
        bookServiceImpl.sendMoney(new User(3,"mowang","121324","123",150.0),
                new User(2,"李煊","121324","123",150.0));
    }
}
