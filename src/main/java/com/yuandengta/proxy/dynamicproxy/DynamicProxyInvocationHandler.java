package com.yuandengta.proxy.dynamicproxy;

import com.yuandengta.proxy.staticproxy.Rent;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Author:Mars
 * @wx:10769582
 */
//代理执行程序  用该类自动生成代理类
public class DynamicProxyInvocationHandler implements InvocationHandler {

    //被代理的接口
    private Object target;  // UserService、Rent

    public void setTarget(Object target) {
        this.target = target;
    }

    //动态生成得到代理类
    public Object getProxy(){

        return  Proxy.newProxyInstance(this.getClass().getClassLoader(),
                target.getClass().getInterfaces(),this);
        /*
          1. ClassLoader loader 本地的类加载器
          提问： 我现在要创建的是代理实例，那么为什么要用到类加载器？
          只要涉及实例化对象，就一定要记载类的字节码，而加载字节码一定要用到类加载器

          2.  Class<?>[] interfaces  代理类要实现的接口列表
          3. InvocationHandler 用来处理方法的调用，
         */
    }


    //处理代理实例,并返回结果
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        log(method.getName());
        //动态代理的本质，就是使用反射机制实现
      Object result = method.invoke(target,args);

        return result;
    }

    //扩展功能
    public void log(String msg){
        System.out.println("【Debug --> 】执行了"+msg+"方法");
    }

    /**
     *  动态代理：
     *    实现步骤：
     *       ①创建被代理的接口和类；
     *      ②创建InvocationHandler接口的实现类，在invoke方法中实现代理逻辑；
     *      ③通过Proxy的静态方法newProxyInstance( ClassLoader loader, Class[] interfaces, InvocationHandler h)创建一个代理对象
     *      ④使用代理对象。
     *
     *  获取方式有两种：
     *       可以通过Cache缓存直接get()
     *       通过 ProxyClassFactory生产
     */
}
