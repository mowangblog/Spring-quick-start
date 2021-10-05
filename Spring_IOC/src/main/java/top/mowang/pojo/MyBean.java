package top.mowang.pojo;

import org.springframework.beans.factory.FactoryBean;

/**
 * Spring-quick-start
 * 测试工厂bean
 *
 * @author : Xuan Li
 * @website : https://mowangblog.top
 * @date : 2021/10/04 17:17
 **/
public class MyBean implements FactoryBean<User> {

    @Override
    public User getObject() throws Exception {
        return new User("魔王博客",19);
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }

    @Override
    public boolean isSingleton() {
        return FactoryBean.super.isSingleton();
    }
}
