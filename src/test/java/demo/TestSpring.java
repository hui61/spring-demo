package demo;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import proxy.CalculateService;

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
        System.out.println("Phones" + user.getPhones());
    }

    @Test
    public void test_custom(){
        // 1、获取工厂
        ApplicationContext act = new ClassPathXmlApplicationContext("/applicationContext.xml");
        // 2、通过工厂类获得对象
        UserService userService = (UserService)act.getBean("userService");
        // 3.调用方法
        userService.print();
    }

    @Test
    void test_constructor_di() {
        ApplicationContext act = new ClassPathXmlApplicationContext("/applicationContext.xml");
        User user = (User) act.getBean(User.class);
        System.out.println(user.getName());
    }

    @Test
    void implement_initializingBean_interface() {
        ApplicationContext act = new ClassPathXmlApplicationContext("/applicationContext.xml");
        Object user = act.getBean("user");
        System.out.println(user);
    }

    @Test
    public void test_init_method(){
        ApplicationContext act = new ClassPathXmlApplicationContext("/applicationContext.xml");
        Object user = act.getBean("user");
        System.out.println(user);
    }

    @Test
    public void test_dynamic_proxy() {
        // 1、获取工厂
        ApplicationContext act = new ClassPathXmlApplicationContext("/applicationContext.xml");
        // 2、通过工厂类获得对象
        CalculateService calculateService = (CalculateService) act.getBean("calculateService");
        // 3.调用方法
        int result = calculateService.add(1, 2);
        System.out.println("result:" + result);
    }

    @Test
    void aspect_test() {
        // 1、获取工厂
        ApplicationContext act = new ClassPathXmlApplicationContext("/applicationContext.xml");
        // 2、通过工厂类获得对象
        CalculateService calculateService = (CalculateService) act.getBean("calculateService");
        // 3.调用方法
        int result = calculateService.add(100, 1);
        System.out.println("result:" + result);
    }
}
