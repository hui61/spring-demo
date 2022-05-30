package demo;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    @Test
    public void testSpring(){
        // 1、获取工厂
        ApplicationContext act = new ClassPathXmlApplicationContext("/applicationContext.xml");
        // 2、通过工厂类获得对象
        UserService userService = (UserService)act.getBean("userService");
        // 3.调用方法
        userService.print();
    }

    @Test
    void test_DI() {
        // 1、获取工厂
        ApplicationContext act = new ClassPathXmlApplicationContext("/applicationContext.xml");
        // 2、通过工厂类获得对象
        User user = (User)act.getBean("user");
        System.out.println("姓名："+user.getName());
        System.out.println("性别："+user.getAge());

    }
}
