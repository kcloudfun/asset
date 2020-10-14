package com.likai.asset.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Date;

/**
 * <p>
 * 资产
 * </p>
 *
 * @author likai
 * @since 2020-09-24
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("T_GOODS")
@ApiModel(value = "TGoods对象", description = "")
public class TGoods implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "主键")
    @TableId(value = "ID", type = IdType.AUTO)
    private String id;

    @ApiModelProperty(value = "资产类型：0手机，1电脑，2其他电子产品")
    @TableField("TYPE")
    private String type;

    @ApiModelProperty(value = "名称")
    @TableField("NAME")
    private String name;

    @ApiModelProperty(value = "描述")
    @TableField("DESCRIPTION")
    private String description;

    @ApiModelProperty(value = "购买价格")
    @TableField("PRICE")
    private BigDecimal price;

    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    @ApiModelProperty(value = "购买时间")
    @TableField("BUY_TIME")
    private Date buyTime;

    @ApiModelProperty(value = "购买渠道：0京东，1淘宝")
    @TableField("BUY_CHANNEL")
    private String buyChannel;

    @ApiModelProperty(value = "状态：0正常使用，1二手转出")
    @TableField("STATUS")
    private String status;

    @ApiModelProperty(value = "所属人")
    @TableField("OWNER")
    private String owner;


}
