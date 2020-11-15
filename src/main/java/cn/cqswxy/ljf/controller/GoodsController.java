package cn.cqswxy.ljf.controller;

import cn.cqswxy.ljf.entity.Goods;
import cn.cqswxy.ljf.service.GoodsSerivce;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * 商品控制层
 */
@Controller
public class GoodsController {

    @Autowired
    private GoodsSerivce goodsSerivce;

    @RequestMapping("/serachSomes")
    public String serachSomes(ModelMap modelMap, @RequestParam("title") String goodsTitle, @RequestParam("type") Integer goodsType) {
        Goods goods = new Goods();
        modelMap.addAttribute("goods", goodsSerivce.searchSomes(goods));
        return "index";
    }

    @RequestMapping("/index")
    public String index(ModelMap modelMap) {
        modelMap.addAttribute("goods", goodsSerivce.getList());
        return "index";
    }

    @RequestMapping("/modType")
    public String modType(Integer goodsId, Boolean goodsAble) {
        Boolean goodsAbles = Boolean.valueOf(goodsAble == true ? "false" : "true");
        Goods goods = new Goods();
        goodsSerivce.modByPrimaryKeySelective(goods);
        return "redirect:index";
    }

}
