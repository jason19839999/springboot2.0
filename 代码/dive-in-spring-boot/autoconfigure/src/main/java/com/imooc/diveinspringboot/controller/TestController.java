package com.imooc.diveinspringboot.controller;


import com.imooc.diveinspringboot.configuration.HelloWorldConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    private ApplicationContext applicationContext;

    @Autowired
    private HelloWorldConfiguration helloWorldConfiguration;

    @RequestMapping(value = "/testApplicationContext")
//   @RequestMapping(value = "/" , method = RequestMethod.GET)
   public String testApplicationContext(){
//        通过applicationContext获取bean
//        String result = applicationContext.getBean("helloWorld",String.class);

//        手动配置 ：在EnableHelloWorldBootstrap头部加上@EnableHelloWorld即可
//        自动配置：①在启动类EnableAutoConfigurationBootstrap加上@EnableAutoConfiguration
//                           ② HelloWorldAutoConfiguration 模式注解装配/模块装配/条件装配
//                           ③ META-INF 配置spring.factories
//        通过@Autowired    HelloWorldConfiguration 即可，就不用通过applicationContext了。
        String result = helloWorldConfiguration.helloWorld();
        return result;
    }
}
