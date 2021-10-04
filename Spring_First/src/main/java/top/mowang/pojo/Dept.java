package top.mowang.pojo;

import java.util.List;

/**
 * Spring-quick-start
 * 部门类测试级联赋值
 *
 * @author : Xuan Li
 * @website : https://mowangblog.top
 * @date : 2021/10/04 16:17
 **/
public class Dept {
    private String deptName;
//    private List<User> users;

    @Override
    public String
    toString() {
        return "Dept{" +
                "deptName='" + deptName + '\'' +
                '}';
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public Dept(String deptName) {
        this.deptName = deptName;
    }
}
