package com.likai.asset.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.likai.asset.entity.TGoods;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Map;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author likai
 * @since 2020-09-24
 */
public interface ITGoodsService extends IService<TGoods> {

    /**
     * 条件查询资产列表（分页）
     *
     * @param goods
     * @param currentPage
     * @param pageSize
     * @return
     */
    Map<String, Object> queryGoodsList(TGoods goods, int currentPage, int pageSize);

}
