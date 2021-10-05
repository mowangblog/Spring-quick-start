package top.mowang.dao.impl;

import org.springframework.stereotype.Repository;
import top.mowang.dao.UserDao;

/**
 * Spring-quick-start
 * userDao实现类
 *
 * @author : Xuan Li
 * @website : https://mowangblog.top
 * @date : 2021/10/04 14:41
 **/
@Repository
public class UserDaoImpl implements UserDao {
    @Override
    public void getUser() {
        System.out.println("获取用户信息");
    }
}
