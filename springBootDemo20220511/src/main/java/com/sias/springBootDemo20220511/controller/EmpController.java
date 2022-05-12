package com.sias.springBootDemo20220511.controller;

import com.sias.springBootDemo20220511.service.EmpService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author: zyg
 * @License: (C) Copyright 2005-2019, xxx Corporation Limited.
 * @Contact: ytzhaof@isoftstone.com
 * @Date: 2022/5/11 15:28
 * @Version: 1.0
 * @Description:
 */
@Controller
public class EmpController {
    Logger logger= LoggerFactory.getLogger(EmpController.class);
    @Autowired
    private EmpService empService;

    @RequestMapping("/testAsync")
    public String  testAsync(){//异步执行
        long start = System.currentTimeMillis();
        empService.testAsync();
        long end = System.currentTimeMillis();
        logger.info("testAsync方法被执行：{} ms",end-start);
        return "/success.html";
    }
    @RequestMapping("/testAsync01")
    public String  testAsync01(){//异步执行
        long start = System.currentTimeMillis();
        empService.testAsync01();
        long end = System.currentTimeMillis();
        logger.info("testAsync01方法被执行：{} ms",end-start);
        return "/success.html";
    }
    @RequestMapping("/testAsync02")
    public String  testAsync02(){//异步执行
        long start = System.currentTimeMillis();
        empService.testAsync02();
        long end = System.currentTimeMillis();
        logger.info("testAsync02方法被执行：{} ms",end-start);
        return "/success.html";
    }
    @RequestMapping("/testsync")
    public String  testsync(){//同步执行
        long start = System.currentTimeMillis();
        empService.testSync();
        long end = System.currentTimeMillis();
        logger.info("testsync方法被执行：{} ms",end-start);
        return "/success.html";
    }
}
