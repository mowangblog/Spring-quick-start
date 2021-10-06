package top.mowang.log;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Spring-quick-start
 * 日志测试
 *
 * @author : Xuan Li
 * @website : https://mowangblog.top
 * @date : 2021/10/06 11:54
 **/
public class UserLog {
    private static final Logger LOGGER = LoggerFactory.getLogger(UserLog.class);

    public static void main(String[] args) {
        LOGGER.info("hello info");
        LOGGER.warn("hello warn");
        LOGGER.error("hello err");
    }
}
