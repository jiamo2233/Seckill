package com.jiamo.seckill.service.ipml;

import com.jiamo.seckill.bo.GoodsBo;
import com.jiamo.seckill.dao.GoodsMapper;
import com.jiamo.seckill.service.SeckillGoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service("seckillGoodsService")
public class SeckillGoodsServiceImpl implements SeckillGoodsService {
    @Autowired
    GoodsMapper goodsMapper;
    @Override
    public List<GoodsBo> getSeckillGoodsList() {
        return goodsMapper.selectAllGoodes();
    }

    @Override
    public GoodsBo getseckillGoodsBoByGoodsId(long goodsId) {
        return goodsMapper.getseckillGoodsBoByGoodsId(goodsId);
    }

    @Override
    public int reduceStock(long goodsId) {
        return goodsMapper.updateStock(goodsId);
    }
}
