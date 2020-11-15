package cn.cqswxy.ljf.service.impl;

import cn.cqswxy.ljf.entity.Goods;
import cn.cqswxy.ljf.mapper.GoodsMapper;
import cn.cqswxy.ljf.service.GoodsSerivce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 商品服务层接口
 */

@Service
public class GoodsServiceImpl implements GoodsSerivce {

    @Autowired
    private GoodsMapper goodsMapper;


    @Override
    public int delByPrimaryKey(Integer goodsId) {
        return goodsMapper.deleteByPrimaryKey(goodsId);
    }

    @Override
    public int add(Goods record) {
        return goodsMapper.insert(record);
    }

    @Override
    public int addSelective(Goods record) {
        return goodsMapper.insertSelective(record);
    }

    @Override
    public Goods getByPrimaryKey(Integer goodsId) {
        return goodsMapper.selectByPrimaryKey(goodsId);
    }

    @Override
    public int modByPrimaryKeySelective(Goods record) {
        return goodsMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int modByPrimaryKey(Goods record) {
        return goodsMapper.updateByPrimaryKey(record);
    }

    @Override
    public List<Goods> getList() {
        return goodsMapper.selectAll();
    }

    @Override
    public List<Goods> searchSomes(Goods record) {
        return goodsMapper.searchSomes(record);
    }

}
