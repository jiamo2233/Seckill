package com.jiamo.seckill.entity;

import lombok.*;

import java.math.BigDecimal;
import java.util.Date;

@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
//订单信息
public class OrderInfo {
    //交易id
    private Long id;
    //购买者id
    private Long userId;
    //货物id
    private Long goodsId;
    //地址id
    private Long addrId;
    //货物名称
    private String goodsName;
    //购买数量
    private Integer goodsCount;
    //价格
    private BigDecimal goodsPrice;

    private Integer orderChannel;

    private Integer status;

    private Date createDate;

    private Date payDate;
}
