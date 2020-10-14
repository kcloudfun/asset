package com.likai.asset.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.likai.asset.entity.TGoods;
import com.likai.asset.mapper.TGoodsMapper;
import com.likai.asset.service.ITGoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author likai
 * @since 2020-09-24
 */
@Service
public class TGoodsServiceImpl extends ServiceImpl<TGoodsMapper, TGoods> implements ITGoodsService {

    @Autowired(required = false)
    private TGoodsMapper goodsMapper;

    /**
     * 条件查询资产列表（分页）
     *
     * @param goods
     * @param currentPage
     * @param pageSize
     * @return
     */
    @Override
    public Map<String, Object> queryGoodsList(TGoods goods, int currentPage, int pageSize) {
        Page<?> page = PageHelper.startPage(currentPage, pageSize);
        QueryWrapper<TGoods> queryWrapper = new QueryWrapper<>();
//        if (!StringUtils.isEmpty(goods.getType())) {
//            //不为空时才加这个查询条件
//            queryWrapper.eq("TYPE", goods.getType());
//        }
        goodsMapper.selectList(queryWrapper);
        Map<String, Object> map = new HashMap<>();
        map.put("list", page.getResult());
        map.put("total", page.getTotal());
        return map;
    }


}
