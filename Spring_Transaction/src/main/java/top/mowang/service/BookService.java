package top.mowang.service;

import top.mowang.pojo.User;

@SuppressWarnings("all")
public interface BookService {

    void selectAll();

    void add(User user);

    void delete(User user);

    void update(User user);

    void sendMoney(User senUser,User reciverUser);

}
