package top.mowang.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;
import top.mowang.dao.BookDao;
import top.mowang.pojo.User;

import java.util.List;

/**
 * Spring-quick-start
 * bookdao实现类
 *
 * @author : Xuan Li
 * @website : https://mowangblog.top
 * @date : 2021/10/05 17:41
 **/
@SuppressWarnings("all")
@Repository
public class BookDaoImpl implements BookDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void selectAll() {
//        String sql = "select count(*) from t_user";
//        Integer integer = jdbcTemplate.queryForObject(sql, Integer.class);
//        String sql = "select * from t_user where id = ?";
//        User user = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<User>(User.class),2);
        String sql = "select * from t_user limit 0,10";
        List<User> query = jdbcTemplate.query(sql, new BeanPropertyRowMapper<User>(User.class));
        System.out.println(query);
    }

    @Override
    public void add(User user) {
        String sql = "insert into t_user(username,password,email) values(?,?,?)";
        jdbcTemplate.update(sql,user.getUsername(),user.getPassword(),user.getEmail());
    }

    @Override
    public void delete(User user) {
        String sql = "delete from t_user where id = ?";
        jdbcTemplate.update(sql,user.getId());
    }

    @Override
    public void update(User user) {
        String sql = "update t_user set username=?,password=?,email=? where id = ?";
        jdbcTemplate.update(sql,user.getUsername(),user.getPassword(),user.getEmail(),user.getId());
    }
}
