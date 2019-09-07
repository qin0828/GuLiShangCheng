package com.qin.guli.user;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.qin.guli.user.mapper")
public class GuliUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(GuliUserApplication.class, args);
    }

}
