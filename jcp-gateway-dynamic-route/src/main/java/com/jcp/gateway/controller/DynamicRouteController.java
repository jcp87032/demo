package com.jcp.gateway.controller;

/**
 * @author jcp
 * @date 2020/3/20 16:40
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.gateway.route.RouteDefinition;
import org.springframework.cloud.gateway.route.RouteDefinitionLocator;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

/**
 * 查询网关的路由信息
 */
@RestController
@RequestMapping("/dynamic-route")
public class DynamicRouteController {

    @Autowired
    private RouteDefinitionLocator routeDefinitionLocator;

    //获取网关所有的路由信息
    @RequestMapping("/routes")
    public Flux<RouteDefinition> getRouteDefinitions(){
        System.out.println("拉取网关所有路由信息...");
        return routeDefinitionLocator.getRouteDefinitions();
    }

}
