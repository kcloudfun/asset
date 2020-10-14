package com.likai.asset.controller;


import com.likai.asset.entity.TGoods;
import com.likai.asset.service.ITGoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author likai
 * @since 2020-09-24
 */
@RestController
@RequestMapping("/asset/goods")
public class TGoodsController {

    @Autowired
    private ITGoodsService goodsService;

    @PostMapping("/save")
    public boolean saveGoods(@RequestBody TGoods goods) {
        return goodsService.saveOrUpdate(goods);
    }

    @PostMapping("/list/{currentPage}/{pageSize}")
    public Map<String, Object> queryGoodsList(@RequestBody TGoods goods, @PathVariable int currentPage, @PathVariable int pageSize) {
        return goodsService.queryGoodsList(goods, currentPage, pageSize);
    }

    @PostMapping("/delete/{id}")
    public boolean deleteById(@PathVariable String id) {
        return goodsService.removeById(id);
    }
}
