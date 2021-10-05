package top.mowang.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import top.mowang.dao.BookDao;
import top.mowang.pojo.User;
import top.mowang.service.BookService;

/**
 * Spring-quick-start
 * bookService实现类
 *
 * @author : Xuan Li
 * @website : https://mowangblog.top
 * @date : 2021/10/05 17:44
 **/
@Service
@SuppressWarnings("all")
//@Transactional(readOnly = false,propagation = Propagation.REQUIRED,isolation = Isolation.REPEATABLE_READ,timeout = -1)
/**
 * propagation 事务传播行为
 * ioslation 事务隔离级别
 * timout 超时时间
 * readonly 是否只读
 * rollbackFor 回滚
 */
public class BookServiceImpl implements BookService{

    @Autowired
    private BookDao bookDao;

    @Override
    public void selectAll() {
        bookDao.selectAll();
    }

    @Override
    public void add(User user) {
        bookDao.add(user);
    }

    @Override
    public void delete(User user) {
        bookDao.delete(user);
    }

    @Override
    public void update(User user) {
        bookDao.update(user);
    }

    @Override
    public void sendMoney(User senUser, User reciverUser) {
        bookDao.sendMoney(senUser);
        int i = 10/0;
        bookDao.revicerMoney(reciverUser);
    }


}
