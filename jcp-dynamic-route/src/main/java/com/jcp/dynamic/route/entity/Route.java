package com.jcp.dynamic.route.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

/**
 * @author jcp
 * @date 2020/3/20 13:18
 */
@Data
@TableName("gateway_routes")
public class Route {
    /**
     * 路由ID
     */
    @TableId
    private Integer routeId;

    /**
     * 转发目标uri
     */
    private String routeUri;

    /**
     * 路由执行顺序
     */
    private Integer routeOrder;

    /**
     * 断言字符串集合，字符串结构：[{
     *                 "name":"Path",
     *                 "args":{
     *                    "pattern" : "/zy/**"
     *                 }
     *               }]
     */
    private String predicates;

    /**
     * 过滤器字符串集合，字符串结构：{
     *               	"name":"StripPrefix",
     *               	 "args":{
     *               	 	"_genkey_0":"1"
     *                                  }
     *               }
     */
    private String filters;

    /**
     * 是否启用 0：关闭  1：启用
     */
    private Integer isEnable;
    /**
     * 是否删除  逻辑删除 1：已删除 0：未删除
     */
    @TableLogic
    private Integer deleted;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 更新时间
     */
    private Date updateTime;



}
