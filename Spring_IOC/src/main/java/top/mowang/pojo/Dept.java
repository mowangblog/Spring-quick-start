package top.mowang.pojo;

import sun.security.action.GetLongAction;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

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
    private List<User> users;
    private String[] workArrays;
    private Map<String,User> userMap;
    private Set<User> userSet;

    public void init(){
        System.out.println("第三步初始化方法");
    }
    public void destroy(){
        System.out.println("第五步销毁方法");
    }

    public Dept() {
        System.out.println("第一步无参构造");
    }

    @Override
    public String toString() {
        System.out.println(getDeptName());
        System.out.println(getUserMap().values());
        System.out.println(Arrays.asList(getWorkArrays()));;
        System.out.println(getUserSet());
        System.out.println(getUsers());
        return "Dept{" +
                "deptName='" + deptName + '\'' +
                ", users=" + users +
                ", workArrays=" + Arrays.toString(workArrays) +
                ", userMap=" + userMap +
                ", userSet=" + userSet +
                '}';
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public String[] getWorkArrays() {
        return workArrays;
    }

    public void setWorkArrays(String[] workArrays) {
        this.workArrays = workArrays;
    }

    public Map<String, User> getUserMap() {
        return userMap;
    }

    public void setUserMap(Map<String, User> userMap) {
        this.userMap = userMap;
    }

    public Set<User> getUserSet() {
        return userSet;
    }

    public void setUserSet(Set<User> userSet) {
        this.userSet = userSet;
    }

    public Dept(String deptName, List<User> users, String[] workArrays, Map<String, User> userMap, Set<User> userSet) {
        this.deptName = deptName;
        this.users = users;
        this.workArrays = workArrays;
        this.userMap = userMap;
        this.userSet = userSet;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        System.out.println("第二步设置属性");
        this.deptName = deptName;
    }

    public Dept(String deptName) {
        this.deptName = deptName;
    }

}
