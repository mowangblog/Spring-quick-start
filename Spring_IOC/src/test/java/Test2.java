import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.SQLException;

/**
 * Spring-quick-start
 * 测试引入外部文件
 *
 * @author : Xuan Li
 * @website : https://mowangblog.top
 * @date : 2021/10/04 18:03
 **/
public class Test2 {
    public static void main(String[] args) throws SQLException {
        //加载spring配置文件
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext
                ("jdbc.xml");
        DruidDataSource druid = context.getBean("druid", DruidDataSource.class);
        System.out.println(druid.getConnection());
    }
}
