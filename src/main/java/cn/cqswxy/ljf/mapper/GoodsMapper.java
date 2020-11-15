package cn.cqswxy.ljf.mapper;

import cn.cqswxy.ljf.entity.Goods;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 商品操作层
 */
@Mapper
public interface GoodsMapper {
    int deleteByPrimaryKey(Integer goodsId);

    int insert(Goods record);

    int insertSelective(Goods record);

    Goods selectByPrimaryKey(Integer goodsId);

    int updateByPrimaryKeySelective(Goods record);

    int updateByPrimaryKey(Goods record);

    List<Goods> selectAll();

    List<Goods> searchSomes(Goods goods);
}