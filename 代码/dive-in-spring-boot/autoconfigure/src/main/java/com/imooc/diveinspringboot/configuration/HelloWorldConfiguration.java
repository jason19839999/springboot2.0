package com.imooc.diveinspringboot.configuration;

import com.imooc.diveinspringboot.annotation.EnableHelloWorld;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

/**
 * HelloWorld 配置
 *
 * @author 小马哥
 * @since 2018/5/14
 */
public class HelloWorldConfiguration {

    @Bean
    public String helloWorld() { // 方法名即 Bean 名称
        return "Hello,World 2018";
    }

}
