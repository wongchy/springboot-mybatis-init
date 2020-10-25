package com.aus.system.config;

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author WongChy
 * @Date 2020/2/24
 */
@Configuration
@MapperScan(value="com.aus.system.mapper")
public class MybatisPlusConfig {

    @Bean
    public PaginationInterceptor paginationInterceptor() {
        // 设置sql的limit为无限制，默认是500
        return new PaginationInterceptor().setLimit(-1);
    }

}
