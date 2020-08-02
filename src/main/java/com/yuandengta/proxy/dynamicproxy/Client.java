package com.yuandengta.proxy.dynamicproxy;

import sun.misc.ProxyGenerator;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @Author:Mars
 * @wx:10769582
 */
public class Client {
    public static void main(String[] args) {
        //真实角色  房东
        UserServiceImp userServiceImp = new UserServiceImp();

        //代理角色：暂时没有
        DynamicProxyInvocationHandler pih = new DynamicProxyInvocationHandler();

        //  userServiceImp
        //设置要代理的对象  --》 真实角色
        pih.setTarget(userServiceImp);

        //动态生成代理对象
        UserService proxy = (UserService) pih.getProxy();

        //调用业务方法，并打印日志
        proxy.delete();
        // 打印 生成的代理对象的字节码类型
        System.out.println(proxy.getClass());
        //  class com.sun.proxy.$Proxy0  匿名内部类
        //获取$Proxy0 查看它做了什么事


        String path = "D:/$Proxy0.class";
        byte[] classFile = ProxyGenerator.generateProxyClass("$Proxy0", UserServiceImp.class.getInterfaces());
        FileOutputStream out = null;

        try {
            out = new FileOutputStream(path);
            out.write(classFile);
            out.flush();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
        /*
          JDK代理：
            1.具有静态代理的好处
            2. 一个动态代理类代理的是一个接口，一般对应的一类业务
            3. 一个动态代理类可以代理多个类，只要是实现了同一个接口

            坏处就是  被代理角色必须实现接口

            class com.sun.proxy.$Proxy0  是在内存中动态产生的

            动态代理 底层其实就是 反射
         */
    }
}