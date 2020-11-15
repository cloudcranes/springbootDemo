package cn.cqswxy.ljf.service.impl;

import cn.cqswxy.ljf.mapper.GoodsTypeMapper;
import cn.cqswxy.ljf.service.GoodsTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 商品类型服务层接口
 */

@Service
public class GoodsTypeServiceImpl implements GoodsTypeService {

    @Autowired
    private GoodsTypeMapper goodsTypeMapper;

    @Override
    public int delByPrimaryKey(Integer goodsTypeId) {
        return goodsTypeMapper.deleteByPrimaryKey(goodsTypeId);
    }

    @Override
    public int add(cn.cqswxy.ljf.entity.GoodsType record) {
        return goodsTypeMapper.insert(record);
    }

    @Override
    public int addSelective(cn.cqswxy.ljf.entity.GoodsType record) {
        return goodsTypeMapper.insertSelective(record);
    }

    @Override
    public cn.cqswxy.ljf.entity.GoodsType getByPrimaryKey(Integer goodsTypeId) {
        return goodsTypeMapper.selectByPrimaryKey(goodsTypeId);
    }

    @Override
    public int modByPrimaryKeySelective(cn.cqswxy.ljf.entity.GoodsType record) {
        return goodsTypeMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int modByPrimaryKey(cn.cqswxy.ljf.entity.GoodsType record) {
        return goodsTypeMapper.updateByPrimaryKey(record);
    }
}
