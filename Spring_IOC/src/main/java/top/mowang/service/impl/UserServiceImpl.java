package top.mowang.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import top.mowang.dao.UserDao;
import top.mowang.dao.impl.UserDaoImpl;
import top.mowang.service.UserService;

import javax.annotation.Resource;

/**
 * Spring-quick-start
 * UserService实现类
 *
 * @author : Xuan Li
 * @website : https://mowangblog.top
 * @date : 2021/10/04 14:42
 **/
@SuppressWarnings("all")
@Service
public class UserServiceImpl implements UserService {

//    @Autowired
//    @Qualifier(value = "userDaoImpl")
//    UserDao userDao;

//      @Resource//根据类型注入
      @Resource(name = "userDaoImpl")//根据名称注入
      UserDao userDao;
//    public void setUserDao(UserDao userDao) {
//        this.userDao = userDao;
//    }
    @Value("lixuan")
    private String name;

    @Override
    public void getUser() {
        System.out.println(name+"1111");
        userDao.getUser();
    }
}
