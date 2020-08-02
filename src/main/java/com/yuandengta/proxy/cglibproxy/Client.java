package com.yuandengta.proxy.cglibproxy;

/**
 *
 * @Author:Mars
 * @wx:10769582
 */
public class Client {
    public static void main(String[] args) {
        //创建目标对象
        UserServiceImp usi = new UserServiceImp();
        // 获取到代理对象，并且将目标对象传递给代理对象
        UserServiceImp proxyInstance = (UserServiceImp) new Proxy(usi).getProxyInstance();

        // 执行代理对象的方法，触发intecept方法，从而实现对目标对象的调用
        proxyInstance.delete();

        //class com.yuandengta.proxy.cglibproxy.UserServiceImp$$EnhancerByCGLIB$$a1ace36b
        System.out.println(proxyInstance.getClass());

        /*
         cglib 可以传接口也可以传普通类，接口使用实现的方式，普通类使用继承的方式

         cglib不能代理 staitc、private 、final修饰的方法

         做了方法访问的优化，使用建立方法索引的方式避免了传统JDK动态代理需要通过Method方法反射调用

         提供了callback设计，可以灵活的给不同的方法绑定不同的callback，编码方便

          cglib会默认代理Object中equals() 、hashCode()、 toString()、 clone()


          Spring框架 将 JDK代理和CHLIB代理在底层集成， 我们不需要带要担心使用哪种动态代理？

          Spring如何生成代理对象？

           工厂   AopProxyFactory

         1. 目标对象需要实现接口，则使用 JDK代理
         2. 目标对象不需要实现接口，用CGLIB代理
         */
    }
}
