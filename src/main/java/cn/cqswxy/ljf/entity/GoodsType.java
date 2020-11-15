package cn.cqswxy.ljf.entity;

import java.io.Serializable;

import lombok.Data;

/**
 * t_goods_type
 * 商品类型表
 *
 * @author
 */
@Data
public class GoodsType implements Serializable {
    private static final long serialVersionUID = 1L;
    private Integer goodsTypeId;
    private String goodsTypeName;
    private Boolean goodsTypeAble;
}