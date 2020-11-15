package cn.cqswxy.ljf.mapper;

import cn.cqswxy.ljf.entity.GoodsType;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品类型操作层
 */
@Mapper
public interface GoodsTypeMapper {

    int deleteByPrimaryKey(Integer goodsTypeId);

    int insert(GoodsType record);

    int insertSelective(GoodsType record);

    GoodsType selectByPrimaryKey(Integer goodsTypeId);

    int updateByPrimaryKeySelective(GoodsType record);

    int updateByPrimaryKey(GoodsType record);

}