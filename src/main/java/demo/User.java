package demo;

import org.springframework.beans.factory.InitializingBean;

import java.util.List;

public class User implements InitializingBean {
    private String name;
    private int age;
    private List<String> phones;

    public User(String name, int age) {
        System.out.println("调用构造方法");
        this.name = name;
        this.age = age;
    }
    public User() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<String> getPhones() {
        return phones;
    }

    public void setPhones(List<String> phones) {
        this.phones = phones;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        this.name = "liuyi";
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", phones=" + phones +
                '}';
    }

    // 初始化方法
    public void initMethod() {
        this.name = "张无忌";
    }
}

