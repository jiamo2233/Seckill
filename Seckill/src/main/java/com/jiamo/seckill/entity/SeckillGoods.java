package com.jiamo.seckill.entity;

import lombok.*;

import java.math.BigDecimal;
import java.util.Date;

@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
//秒杀货物
public class SeckillGoods {
    private Long id;

    private Long goodsId;

    private BigDecimal seckilPrice;

    private Integer stockCount;

    private Date startDate;

    private Date endDate;
}
