package com.jiamo.seckill.service;

import com.jiamo.seckill.entity.OrderInfo;


public interface OrderService {

    long addOrder(OrderInfo orderInfo);

    OrderInfo getOrderInfo(long rderId);
}
