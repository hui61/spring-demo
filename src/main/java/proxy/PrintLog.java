package proxy;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * @Desc: 动态代理完成非业务功能
 * @Author: 知否技术
 * @date: 下午8:49 2022/5/4
 */
public class PrintLog implements MethodInterceptor {
    @Override
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        System.out.println("在目标方法执行之前打印。。。。。");
        // 执行目标方法
        Object object = methodInvocation.proceed();
        System.out.println("在目标方法执行之后打印。。。。。");
        return object;
    }
}
