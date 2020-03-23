package com.jcp.product.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jcp
 * @date 2020/3/20 11:49
 */
@RestController
@RequestMapping("/product")
public class ProductController {

    @GetMapping("{id}")
    public String getById(@PathVariable String id){
        return "product Id:"+id;
    }
}
