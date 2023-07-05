package com.jiamo.seckill.dao;

import com.jiamo.seckill.bo.GoodsBo;
import com.jiamo.seckill.entity.Goods;

import java.util.List;

public interface GoodsMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Goods goods);

    int insertSelective(Goods goods);

    Goods selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Goods goods);

    int updateByPrimaryKeyWithBLOBs(Goods goods);

    int updateByPrimaryKey(Goods goods);

    List<GoodsBo> selectAllGoodes ();

    GoodsBo getseckillGoodsBoByGoodsId(long goodsId);

    int updateStock(long goodsId);
}
