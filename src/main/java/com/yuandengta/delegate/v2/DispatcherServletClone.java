package com.yuandengta.delegate.v2;



import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/**
 * TODO {@link DispatcherServletClone}
 *
 * @Author:Mars
 * @wx:10769582
 */
// 模拟DispatcherServlet
// selvelt的任务分发者 ，主要完成url的映射和调用(Url --> Method --> Handler)
public class DispatcherServletClone {
    //这里也可以用map 对象来保存Hanlder对象
    private List<Handler> handlerMapping = new ArrayList<Handler>();

    public DispatcherServletClone() {
        //简单实现一个controller的映射
        try {
            Class clazz  = RequestAction.class;

            handlerMapping.add(new Handler()
                    .setController(clazz.newInstance())
                    .setMethod(clazz.getMethod("getHandleById",new Class[]{String.class}))
                    .setUrl("/web/getHandleById.json")
            );
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void  doService(HttpServletRequest request, HttpServletResponse response){
        doDispatch(request,response);
    }

    /**
     * 请求的分发工作
     * @param request
     * @param response
     */
    private void doDispatch(HttpServletRequest request, HttpServletResponse response) {
        //1.获取用户请求的url
        String url =   request.getRequestURI();
        Handler handler =null;

        ////2、根据url 去handlerMapping找到对应的handler
        for(Handler h :handlerMapping){
            if(url.equals(h.getUrl())){
                handler = h;
                break;
            }
        }
        //3.将具体的任务分发给Method（通过反射去调用其对应的方法）
        Object obj = null;
        try {
            obj =  handler.getMethod().invoke(handler.getController(),request.getParameter("mid"));
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        //4、获取到Method执行的结果，通过Response返回出去
        // response.getWriter().write();

    }
    /**
     * 具体的hanlder对象
     */
    class Handler{
        //controller对象
        private Object controller;
        //controller对象映射的方法
        private  String url;
        //url对应的方法
        private Method method;

        public Object getController() {
            return controller;
        }

        public Handler setController(Object controller) {
            this.controller = controller;
            return this;
        }

        public String getUrl() {
            return url;
        }

        public Handler setUrl(String url) {
            this.url = url;
            return  this;
        }

        public Method getMethod() {
            return method;
        }

        public Handler setMethod(Method method) {
            this.method = method;
            return this;
        }
    }
}
