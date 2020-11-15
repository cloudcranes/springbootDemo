package cn.cqswxy.ljf.service;

import cn.cqswxy.ljf.entity.Goods;

import java.util.List;

/**
 * 商品服务层
 */
public interface GoodsSerivce {

    int delByPrimaryKey(Integer goodsId);

    int add(Goods record);

    int addSelective(Goods record);

    Goods getByPrimaryKey(Integer goodsId);

    int modByPrimaryKeySelective(Goods record);

    int modByPrimaryKey(Goods record);

    List<Goods> getList();

    List<Goods> searchSomes(Goods record);
}
