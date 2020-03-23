package com.jcp.dynamic.route.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.jcp.dynamic.route.entity.Route;
import com.jcp.dynamic.route.mapper.RouteMapper;
import com.jcp.dynamic.route.service.RouteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.PriorityQueue;

/**
 * @author jcp
 * @date 2020/3/20 13:30
 */
@Service
public class RouteServiceImpl extends ServiceImpl<RouteMapper, Route> implements RouteService {
    @Value("${jcp.routeKey}")
    private String routeKey;

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Autowired
    private RouteMapper routeMapper;

    @Override
    public IPage getByPage(Page page) {
        return baseMapper.selectPage(page,null);
    }

    @Override
    public Boolean addRoute(Route route) {
        return baseMapper.insert(route)>0?true:false;
    }

    @Override
    public Boolean updateRoute(Route route) {
        return baseMapper.updateById(route)>0?true:false;
    }


    @Override
    public String getAllRoutes() {
        return null;
    }
}
