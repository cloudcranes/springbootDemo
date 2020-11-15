package cn.cqswxy.ljf.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import lombok.Data;

/**
 * t_goods
 * 商品表
 *
 * @author
 */
@Data
public class Goods implements Serializable {
    private static final long serialVersionUID = 1L;
    private Integer goodsId;
    private String goodsTitle;
    private BigDecimal goodsPrice;
    private Date goodsMod;
    private Integer goodsType;
    private Boolean goodsAble;
}