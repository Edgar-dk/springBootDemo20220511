package com.sias.springBootDemo20220511;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * @Author: zyg
 * @License: (C) Copyright 2005-2019, xxx Corporation Limited.
 * @Contact: ytzhaof@isoftstone.com
 * @Date: 2022/5/11 16:03
 * @Version: 1.0
 * @Description:
 */
@Configuration
public class ExecutorConfig {
    private int corePoolSize = 10;  //核心线程数(默认线程数)
    private int maxPoolSize = 20;   // 最大线程数
    private static final int keepAliveTime = 60;   //允许线程空闲时间（单位：默认为秒）
    private int queueCapacity = 10;//缓冲队列大小
    @Bean
    public Executor asyncServiceExecutor(){
        ThreadPoolTaskExecutor executor=new ThreadPoolTaskExecutor();  //配置核心线程数
        executor.setCorePoolSize(corePoolSize);  //配置最大线程数
        executor.setMaxPoolSize(maxPoolSize);    //配置队列大小
        executor.setKeepAliveSeconds(keepAliveTime);  //配置空闲时间
        executor.setQueueCapacity(queueCapacity);//缓存
        executor.setThreadNamePrefix("async-service-");//配置线程前缀名
        //设置拒绝策略：当线程池达到最大线程数时，如何处理新任务
        // CALLER_RUNS：在添加到线程池失败时会由主线程自己来执行这个任务，
        // 当线程池没有处理能力的时候，该策略会直接在execute方法的调用线程中运行被拒绝的任务；如果执行程序已被关闭，则会丢弃该任务
        executor.setRejectedExecutionHandler(new ThreadPoolExecutor.CallerRunsPolicy());
        //执行初始化
        executor.initialize();
        return executor;
    }
    @Bean
    public Executor asyncServiceExecutor02(){
        ThreadPoolTaskExecutor executor=new ThreadPoolTaskExecutor();  //配置核心线程数
        executor.setCorePoolSize(corePoolSize);  //配置最大线程数
        executor.setMaxPoolSize(maxPoolSize);    //配置队列大小
        executor.setKeepAliveSeconds(keepAliveTime);  //配置空闲时间
        executor.setQueueCapacity(queueCapacity);//缓存
        executor.setThreadNamePrefix("async-service02-");//配置线程前缀名
        //设置拒绝策略：当线程池达到最大线程数时，如何处理新任务
        // CALLER_RUNS：在添加到线程池失败时会由主线程自己来执行这个任务，
        // 当线程池没有处理能力的时候，该策略会直接在execute方法的调用线程中运行被拒绝的任务；如果执行程序已被关闭，则会丢弃该任务
        executor.setRejectedExecutionHandler(new ThreadPoolExecutor.CallerRunsPolicy());
        //执行初始化
        executor.initialize();
        return executor;
    }

}
