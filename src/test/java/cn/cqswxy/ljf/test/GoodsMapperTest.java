package cn.cqswxy.ljf.test;

import cn.cqswxy.ljf.entity.Goods;
import cn.cqswxy.ljf.mapper.GoodsMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.util.List;

@SpringBootTest
public class GoodsMapperTest {

    @Autowired
    private GoodsMapper goodsMapper;

    @Test
    public void serachSomesTest() {
        Goods goods = new Goods();
        goods.setGoodsType(1);
        List<Goods> list = goodsMapper.searchSomes(goods);
        for (Goods goods1 : list) {
            System.out.println(goods1);
        }
    }
}
