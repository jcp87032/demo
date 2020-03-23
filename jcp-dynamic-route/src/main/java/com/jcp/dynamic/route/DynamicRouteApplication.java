package com.jcp.dynamic.route;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author jcp
 * @date 2020/3/20 13:16
 */
@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.jcp.dynamic.route.mapper")
public class DynamicRouteApplication {
    public static void main(String[] args) {
        SpringApplication.run(DynamicRouteApplication.class,args);
    }
}
