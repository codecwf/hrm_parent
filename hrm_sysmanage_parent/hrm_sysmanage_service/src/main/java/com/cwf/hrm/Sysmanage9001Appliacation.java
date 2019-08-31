package com.cwf.hrm;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@MapperScan("com.cwf.hrm.mapper")
public class Sysmanage9001Appliacation {
    public static void main(String[] args) {
        SpringApplication.run(Sysmanage9001Appliacation.class,args);
    }
}
