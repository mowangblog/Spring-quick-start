package top.mowang.service.impl;

import top.mowang.dao.UserDao;
import top.mowang.dao.impl.UserDaoImpl;
import top.mowang.service.UserService;

/**
 * Spring-quick-start
 * UserService实现类
 *
 * @author : Xuan Li
 * @website : https://mowangblog.top
 * @date : 2021/10/04 14:42
 **/
public class UserServiceImpl implements UserService {
    UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void getUser() {

        userDao.getUser();
    }
}
