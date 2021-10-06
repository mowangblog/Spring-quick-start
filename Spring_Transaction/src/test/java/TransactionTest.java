import cn.hutool.Hutool;
import cn.hutool.core.util.DesensitizedUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import top.mowang.pojo.User;
import top.mowang.service.impl.BookServiceImpl;

/**
 * Spring-quick-start
 *
 * @author : Xuan Li
 * @website : https://mowangblog.top
 * @date : 2021/10/05 17:57
 **/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:Transaction.xml")
//spring整合junit4
public class TransactionTest {
    @Autowired
    private BookServiceImpl bookServiceImpl;
    public static void main(String[] args) {
//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Transaction.xml");
//        BookServiceImpl bookServiceImpl = context.getBean("bookServiceImpl", BookServiceImpl.class);
//        bookServiceImpl.sendMoney(new User(3,"mowang","121324","123",150.0),
//                new User(2,"李煊","121324","123",150.0));
    }

    @Test
    public void sendTest(){
        bookServiceImpl.sendMoney(new User(3,"mowang","121324","123",150.0),
                new User(2,"李煊","121324","123",150.0));
    }


}
