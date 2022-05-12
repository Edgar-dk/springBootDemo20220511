package com.sias.springBootDemo20220511.service;

import ch.qos.logback.core.util.TimeUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

/**
 * @Author: zyg
 * @License: (C) Copyright 2005-2019, xxx Corporation Limited.
 * @Contact: ytzhaof@isoftstone.com
 * @Date: 2022/5/11 15:21
 * @Version: 1.0
 * @Description:
 */
@Service
public class EmpServiceImpl  implements  EmpService {
    Logger logger= LoggerFactory.getLogger(EmpServiceImpl.class);
    @Async//该注解加入方法上，表示该方法会在一个新的线程中执行（异步）
    //加入参数表示使用了参数对应的线程池来创建线程
    @Override
    public void testAsync() {

        try {
            TimeUnit.SECONDS.sleep(2);//休眠2秒
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        logger.info(">>>>>testAsync 异步方法被执行>>>>>线程名称："+Thread.currentThread().getName());
    }



    @Override
    public void testSync() {
        try {
            TimeUnit.SECONDS.sleep(2);//休眠2秒
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        logger.info(">>>>>testSync 同步方法被执行>>>>>线程名称："+Thread.currentThread().getName());

    }

    @Async
    @Override
    public void testAsync01() {
        try {
            TimeUnit.SECONDS.sleep(2);//休眠2秒
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        logger.info(">>>>>testAsync01 异步方法被执行>>>>>线程名称："+Thread.currentThread().getName());

    }
    @Async
    @Override
    public void testAsync02() {
        try {
            TimeUnit.SECONDS.sleep(2);//休眠2秒
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        logger.info(">>>>>testAsync02 异步方法被执行>>>>>线程名称："+Thread.currentThread().getName());

    }
}
