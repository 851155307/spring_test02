package com.qf.spring_test02;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(scanBasePackages = "com.qf")
@MapperScan("com.qf.dao")
public class SpringTest02Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringTest02Application.class, args);
    }

}

