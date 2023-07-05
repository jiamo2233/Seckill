package com.jiamo.seckill.service.ipml;

import com.jiamo.seckill.dao.OrderInfoMapper;
import com.jiamo.seckill.entity.OrderInfo;
import com.jiamo.seckill.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Service;


@Service("orderService")
public class OrderServiceImpl implements OrderService {
    @Autowired
    OrderInfoMapper ordeInfoMapper;

    @Override
    public long addOrder(OrderInfo orderInfo) {
        return ordeInfoMapper.insertSelective(orderInfo);
    }

    @Override
    public OrderInfo getOrderInfo(long orderId) {
        return ordeInfoMapper.selectByPrimaryKey(orderId);
    }
}
