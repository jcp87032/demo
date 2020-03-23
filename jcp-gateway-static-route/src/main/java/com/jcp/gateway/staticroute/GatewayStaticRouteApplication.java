package com.jcp.gateway.staticroute;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @author jcp
 * @date 2020/3/20 12:35
 */
@EnableDiscoveryClient
@SpringBootApplication
@EnableZuulProxy
public class GatewayStaticRouteApplication {
    public static void main(String[] args) {
        SpringApplication.run(GatewayStaticRouteApplication.class,args);
    }
}
