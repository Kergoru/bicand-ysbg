package com.bicand.auth;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @program: bicand-oa-parent
 * @description:
 * @author: bicand
 * @create: 2024-07-28 11:18
 **/

@SpringBootApplication

public class ServiceAuthApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceAuthApplication.class,args);
    }
}
