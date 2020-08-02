package com.yuandengta.principle.dependencyreverse.use;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.InitializingBean;

/**
 * TODO {@link DoXxxService}
 *
 * @Author:Mars
 * @wx:10769582
 */
public class DoXxxService implements InitializingBean, BeanFactoryAware {

    //属性   --》 赋值
    private BeanFactory beanFactory;

    //  不是我们主动去调，是框架去调的  我们只是去依赖于我们的抽象，
    //  我们去初始化beanFactory的主动权是容器
    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
         //  容器自动帮我们注入

        this.beanFactory = beanFactory;
    }

    @Override
    public void afterPropertiesSet() throws Exception {

    }
}
