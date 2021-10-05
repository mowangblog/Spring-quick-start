package top.mowang.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.mowang.dao.BookDao;
import top.mowang.pojo.User;
import top.mowang.service.BookService;

import java.awt.print.Book;

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
}
