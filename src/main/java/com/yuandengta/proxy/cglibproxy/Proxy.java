package com.yuandengta.proxy.cglibproxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @Author:Mars
 * @wx:10769582
 */
public class Proxy  implements MethodInterceptor {

    // 聚合一个目标对象(选中 alt+enter)
    private  Object target;

    //构造器，传入一个被代理的对象
    public Proxy(Object target) {
        this.target = target;
    }

    // 返回一个代理对象，是target对象的代理对象
    public Object getProxyInstance(){
        // 1. 创建加强器，用来创建动态代理类
        Enhancer enhancer = new Enhancer();
        // 2. 为代理类指定需要代理的类，即设置父类
        enhancer.setSuperclass(target.getClass());
        //  可在这里添加拦截器
        // 3. 设置回调函数
        enhancer.setCallback(this);
        // 4.创建子类对象，即代理对象
        return enhancer.create();
    }

    /**
     *
     * @param o  代表Cglib 生成的动态代理类 对象本身
     * @param method 代理类中被拦截的接口方法 Method 实例
     * @param objects 接口方法参数
     * @param methodProxy 用于调用父类真正的业务类方法。可以直接调用被代理类接口方法
     * @return
     * @throws Throwable
     */
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("cglib代理模式开始。。。");

         log("执行了"+method.getName());
         //  反射
         Object returnVal = method.invoke(target,objects);
        System.out.println("cglib代理模式提交。。。");
        return returnVal;
    }
    //日志方法
    public void log(String msg){
        System.out.println("[Debug]-->使用了"+msg+"方法");
    }
    // 没有改变原有代码，扩展了功能
}
