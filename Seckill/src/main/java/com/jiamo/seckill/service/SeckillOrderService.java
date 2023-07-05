package com.jiamo.seckill.service;

import com.jiamo.seckill.bo.GoodsBo;
import com.jiamo.seckill.entity.OrderInfo;
import com.jiamo.seckill.entity.SeckillOrder;
import com.jiamo.seckill.entity.User;


public interface SeckillOrderService {

    SeckillOrder getSeckillOrderByUserIdGoodsId(long userId , long goodsId);


    OrderInfo insert(User user , GoodsBo goodsBo);

    OrderInfo getOrderInfo(long orderId);

    long getSeckillResult(Long userId, long goodsId);

    boolean checkPath(User user, long goodsId, String path);

    String createMiaoshaPath(User user, long goodsId);

}
