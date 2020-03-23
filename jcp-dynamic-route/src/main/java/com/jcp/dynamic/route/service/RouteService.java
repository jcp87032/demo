package com.jcp.dynamic.route.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.jcp.dynamic.route.entity.Route;

import java.util.List;

/**
 * @author jcp
 * @date 2020/3/20 13:29
 */
public interface RouteService extends IService<Route> {

    /**
     * 分页查询路由列表
     * @param page
     * @return
     */
    IPage getByPage(Page page);

    /**
     * 添加路由
     * @param route
     * @return
     */
    Boolean addRoute(Route route);

    /**
     * 编辑路由
     * @param route
     * @return
     */
    Boolean updateRoute(Route route);


    /**
     * 获取所有动态路由列表
     * @return
     */
    String getAllRoutes();
}
