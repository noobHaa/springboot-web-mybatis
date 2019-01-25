package com.springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan(value = "com.springboot.mapper")
@SpringBootApplication
public class SpringbootWebMybatisApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootWebMybatisApplication.class, args);
    }

}

