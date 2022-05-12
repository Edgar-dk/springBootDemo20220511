package com.sias.springBootDemo20220511;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

/**
 * @Author: zyg
 * @License: (C) Copyright 2005-2019, xxx Corporation Limited.
 * @Contact: ytzhaof@isoftstone.com
 * @Date: 2022/4/29 16:03
 * @Version: 1.0
 * @Description:
 */
@EnableAsync//表示开启异步支持
@SpringBootApplication
public class SpringBootDemoApplication {
    public static void main(String args[]){
        SpringApplication.run(SpringBootDemoApplication.class, args);
    }
}
