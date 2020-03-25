package com.jcp.dynamic.route.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.jcp.dynamic.route.entity.Route;
import com.jcp.dynamic.route.service.RouteService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author jcp
 * @date 2020/3/20 17:26
 */
@RestController
@RequestMapping("/route")
@Api(description = "路由管理")
public class RouteController {
    @Autowired
    private RouteService routeService;

    @GetMapping()
    @ApiOperation(value = "分页查询路由")
    public IPage<Route> getByPage(Page page){
        return routeService.getByPage(page);
    }

    @PostMapping()
    @ApiOperation(value = "添加路由")
    public Boolean add(Route route){
        return routeService.addRoute(route);
    }

    @PutMapping()
    @ApiOperation(value = "编辑路由信息")
    public Boolean edit(Route route){
        return routeService.updateRoute(route);
    }

    @DeleteMapping("{routeId}")
    @ApiOperation(value = "根据id删除路由...")
    public Boolean delete(@PathVariable Integer routeId){
        return routeService.removeById(routeId);
    }

    @GetMapping("{routeId}")
    @ApiOperation(value = "根据id查询路由")
    public Route getById(@PathVariable Integer routeId){
        return routeService.getById(routeId);
    }

}
