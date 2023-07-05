package com.jiamo.seckill.entity;

import lombok.*;

@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
//秒杀订单
public class SeckillOrder {
    private Long id;

    private Long userId;

    private Long orderId;

    private Long goodsId;

}