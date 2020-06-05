package com.william.ui;

import com.william.dao.impl.AccountDaoImpl;
import com.william.service.IAccountService;
import com.william.service.impl.AccountServiceImpl;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/**
 * 模拟一个表现层，用于调用业务层
 */
public class Client {

    /**
     * 获取spring的ioc容器，并根据id创建对象
     *
     * @param args
     */
    public static void main(String[] args) {
        //IAccountService accountService = new AccountServiceImpl();

        //-----------ApplicationContext获取核心容器-------------
        //获取核心容器对象
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        //ApplicationContext ac = new FileSystemXmlApplicationContext("C:\\Users\\pactera\\Desktop\\bean.xml");
        //根绝id获取bean对象
        IAccountService accountService = ac.getBean("accountService", IAccountService.class);
        System.out.println(accountService);

//        //----------BeanFactory获取核心容器--------------
//        Resource resource = new ClassPathResource("bean.xml");
//        BeanFactory factory = new XmlBeanFactory(resource);
//        IAccountService accountService = factory.getBean("accountService", IAccountService.class);
//        System.out.println(accountService);


        accountService.saveAccount();
    }

}
