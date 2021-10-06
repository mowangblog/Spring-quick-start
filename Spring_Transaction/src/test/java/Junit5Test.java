
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import top.mowang.pojo.User;
import top.mowang.service.impl.BookServiceImpl;

/**
 * Spring-quick-start
 * 测试
 *
 * @author : Xuan Li
 * @website : https://mowangblog.top
 * @date : 2021/10/06 12:52
 **/
@SpringJUnitConfig(locations = "classpath:Transaction.xml")
//@ExtendWith(SpringExtension.class)
//@ContextConfiguration("classpath:Transaction.xml")
//spring整合junit5
public class Junit5Test {
    @Autowired
    private BookServiceImpl bookServiceImpl;

    public static void main(String[] args) {

    }
    @Test
    public void sendTest2(){
        bookServiceImpl.sendMoney(new User(3,"mowang","121324","123",150.0),
                new User(2,"李煊","121324","123",150.0));
    }
}
