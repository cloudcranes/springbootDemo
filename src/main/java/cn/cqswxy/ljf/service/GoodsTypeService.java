package cn.cqswxy.ljf.service;

/**
 * 商品类型服务层
 */
public interface GoodsTypeService {

    int delByPrimaryKey(Integer goodsTypeId);

    int add(cn.cqswxy.ljf.entity.GoodsType record);

    int addSelective(cn.cqswxy.ljf.entity.GoodsType record);

    cn.cqswxy.ljf.entity.GoodsType getByPrimaryKey(Integer goodsTypeId);

    int modByPrimaryKeySelective(cn.cqswxy.ljf.entity.GoodsType record);

    int modByPrimaryKey(cn.cqswxy.ljf.entity.GoodsType record);

}
