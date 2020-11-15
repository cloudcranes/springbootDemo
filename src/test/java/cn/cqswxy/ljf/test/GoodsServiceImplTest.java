package cn.cqswxy.ljf.test;

import cn.cqswxy.ljf.entity.Goods;
import cn.cqswxy.ljf.service.impl.GoodsServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

@SpringBootTest
public class GoodsServiceImplTest {

    @Autowired
    private GoodsServiceImpl goodsService;

    @Test
    public void selectByPrimaryKey() {
    }

    @Test
    public void modByPrimaryKeySelectiveTest() {
        Goods goods = new Goods();
        goods.setGoodsId(3);
        goods.setGoodsAble(false);
        goodsService.modByPrimaryKeySelective(goods);
    }

    @Test
    public void getListTest() {
        List<Goods> list = goodsService.getList();
        for (Goods goods : list) {
            //日期格式
            Date goodsMod = goods.getGoodsMod();
            DateFormat df = DateFormat.getDateInstance(DateFormat.MEDIUM, Locale.CHINA);
            System.out.println(df.format(goodsMod));
            Goods goods1 = new Goods();
        }
        System.out.println(goodsService.getList());
    }
}
