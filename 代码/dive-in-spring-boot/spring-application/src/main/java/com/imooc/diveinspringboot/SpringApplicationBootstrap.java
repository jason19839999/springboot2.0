package com.imooc.diveinspringboot;

import com.imooc.diveinspringboot.listener.HelloWorldApplicationListener;
import com.imooc.diveinspringboot.run.HelloWorldRunListener;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import java.util.HashSet;
import java.util.Set;

/**
 * {@link SpringApplication} 引导类
 *
 * @author 小马哥
 * @since 2018/5/16
 */
//@ComponentScan(basePackages = "com.imooc.diveinspringboot.run")
public class SpringApplicationBootstrap {

    public static void main(String[] args) {
//        SpringApplication.run(ApplicationConfiguration.class,args);

        Set<String> sources = new HashSet();
        // 配置Class 名称
//     推断引导类   deduceMainApplicationClass    deduce→演绎; 推论，推断; 追溯根源;
        sources.add(ApplicationConfiguration.class.getName());
        SpringApplication springApplication = new SpringApplication();
        springApplication.setSources(sources);
//        springApplication.addListeners(new HelloWorldApplicationListener());  如果不用配置spring.factories，在这里代码添加实现也可以的

        ConfigurableApplicationContext context = springApplication.run(args);

//        context.addApplicationListener(new HelloWorldApplicationListener());  添加事件监听
//        context.publishEvent(new ApplicationEvent("jason") {             发布事件

    }

    @SpringBootApplication
    public static class ApplicationConfiguration {

    }

}
