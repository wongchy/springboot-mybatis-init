package com.aus.system.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * @Author WongChy
 * @Date 2020/6/19 10:37
 */
@Configuration
@EnableAsync
public class ThreadExecutorConfig {

    @Bean("MyTaskExecutor")
    public Executor executor() {
        ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
        int threadCount = Runtime.getRuntime().availableProcessors();
        System.out.println("++++"+threadCount);
        //核心池大小
        executor.setCorePoolSize(5);
        //队列程度
        executor.setQueueCapacity(12);
        //最大线程数
        executor.setMaxPoolSize(10);
        //线程空闲时间
        executor.setKeepAliveSeconds(1000);
        //线程前缀名称
        executor.setThreadNamePrefix("task-async");
        //配置拒绝策略
        executor.setRejectedExecutionHandler(new ThreadPoolExecutor.AbortPolicy());
        return executor;
    }

}
