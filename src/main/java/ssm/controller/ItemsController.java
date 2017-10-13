package ssm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import ssm.model.Items;
import ssm.service.ItemsService;
import ssm.service.UserService;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ItemsController {
    @Autowired
    private ItemsService itemsService;
    //指定url到请求方法的映射
    //url中输入一个list找到这个方法，例如localhost:8080/web-ssm/list.action
    @RequestMapping("/itemList")
    public ModelAndView itemList() throws Exception{
        List<Items>  itemsList = itemsService.itemList();
        //模型和视图
        //model模型中存放着返回页面的数据
        //view视图中存放着指定返回页面的位置
        ModelAndView ModelAndView = new ModelAndView();
        //将返回到页面的数据，放入模型和视图对象中
        ModelAndView.addObject("itemList",itemsList);
        //指定返回页面的位置
        ModelAndView.setViewName("/item/itemList");
        return ModelAndView;
    }


    @Autowired
    private UserService userService;
}
