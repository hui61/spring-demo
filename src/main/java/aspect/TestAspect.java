package aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class TestAspect {

    // 前置通知：方法执行前添加额外功能
    @Before("execution(* *(..))")
    public void beforePrint(){
        System.out.println("------before: 方法执行前打印~");
    }

    //后置通知： 方法执行后添加额外功能
    @After("execution(* *(..))")
    public void afterPrint(){
        System.out.println("------after: 方法执行前打印~");
    }

    // 环绕通知：方法执行前后添加额外功能
    @Around("execution(* *(..))")
    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("方法执行前打印~");
        Object result = joinPoint.proceed();
        System.out.println("方法执行后打印~");
        return result;
    }
}
