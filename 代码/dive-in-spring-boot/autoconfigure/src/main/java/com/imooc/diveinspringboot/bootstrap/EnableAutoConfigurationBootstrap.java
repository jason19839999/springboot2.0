package com.imooc.diveinspringboot.bootstrap;

import com.imooc.diveinspringboot.annotation.EnableHelloWorld;
import com.imooc.diveinspringboot.configuration.HelloWorldConfiguration;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * {@link EnableAutoConfiguration} 引导类
 *
 * @author
 * @since
 */
@EnableAutoConfiguration
@ComponentScan(basePackages = "com.imooc.diveinspringboot.controller")
public class EnableAutoConfigurationBootstrap {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = new SpringApplicationBuilder(EnableAutoConfigurationBootstrap.class)
                .web(WebApplicationType.SERVLET)
                .run(args);

        // helloWorld Bean 是否存在  这个是调用被装配的类的方法
//        String helloWorld =
//                context.getBean("helloWorld", String.class);

        //这个是调用被装配的类
        HelloWorldConfiguration helloWorld =
                context.getBean(HelloWorldConfiguration.class);

        System.out.println("helloWorld Bean : " + helloWorld.helloWorld());

        // 关闭上下文
//        context.close();

    }
}
