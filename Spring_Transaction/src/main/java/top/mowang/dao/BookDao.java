package top.mowang.dao;

import top.mowang.pojo.User;

import java.time.Year;

/**
 * dao
 *
 * @author : Xuan Li
 * @website : https://mowangblog.top
 * @date : 2021/10/5 17:43
 **/
@SuppressWarnings("all")
public interface BookDao {
    /**
     * 查询全部
     * @description:
     * @author: Xuan Li
     * @date: 2021/10/5 17:43
    */
    void selectAll();

    void add(User user);

    void delete(User user);

    void update(User user);

    void sendMoney(User user);

    void revicerMoney(User user);
}
