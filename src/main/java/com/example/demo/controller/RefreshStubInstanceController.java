package com.example.demo.controller;

import com.example.demo.service.GrpcClientService;
import com.example.demo.service.StubWrapper;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RefreshStubInstanceController implements ApplicationContextAware {

    private ApplicationContext applicationContext;

    @Autowired
    private GrpcClientService grpcClientService;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

    @RequestMapping("/refreshstub")
    public String refreshstub() {

        String beanName = "stubWrapper";

        //获取BeanFactory
        DefaultListableBeanFactory defaultListableBeanFactory = (DefaultListableBeanFactory) applicationContext.getAutowireCapableBeanFactory();

        // 删除已有bean
        defaultListableBeanFactory.removeBeanDefinition(beanName);

        //创建bean信息.
        BeanDefinitionBuilder beanDefinitionBuilder = BeanDefinitionBuilder.genericBeanDefinition(StubWrapper.class);

        //动态注册bean.
        defaultListableBeanFactory.registerBeanDefinition(beanName, beanDefinitionBuilder.getBeanDefinition());

        // 更新引用关系(注意，applicationContext.getBean方法很重要，会触发StubWrapper实例化操作)
        grpcClientService.setStubWrapper(applicationContext.getBean(StubWrapper.class));

        return "Refresh success";
    }

}
