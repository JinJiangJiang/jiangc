package com.jiang;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by biu on 2018/8/13.
 */
@SpringBootApplication
@MapperScan(basePackages="com.jiang.mapper")
@ComponentScan(basePackages = "com.jiang")
public class Application {
    public static void main(String[] args){
        SpringApplication.run(Application.class, args);
    }
}
