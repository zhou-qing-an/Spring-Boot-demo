package com.qingan.controller;

import com.qingan.bean.Guest;
import com.qingan.service.GuestServiceBase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class GuestController {

    @Autowired
    private GuestServiceBase service;

    /**
     *     查询全表
     * @param model
     * @return  index 转发页面
     */
    @RequestMapping("/guestList")
    public String selectAll(Model model) {
        List<Guest> list = service.selectAll();
        model.addAttribute("list", list);
        return "index";
    }

    /**
     *  请求添加页面
     * @return
     */
    @RequestMapping("/toAdd")
    public String toAdd(){
        return "toAdd";
    }

    /**
     * 添加人物
     * @param guest  人物对象
     * @return   重定向
     */
    @RequestMapping("/add")
    public String add(Guest guest){
        service.add(guest);
        return "redirect:/guestList";
    }

    /**
     *  删除人物
     * @param name  人物姓名
     * @return   重定向
     */
    @RequestMapping("/delete")
    public String delete(String name){
        service.delete(name);
        return "redirect:/guestList";
    }

    /**
     *      跳转到修改页面
     * @param model
     * @param name
     * @return
     */
    @RequestMapping("/toUpdate")
    public String toUpdate(Model model,String name){
        Guest guest = service.selectOne(name);
        model.addAttribute("guest",guest);
        return "toUpdate";
    }

    /**
     *  修改人物
     * @param guest
     * @return
     */
    @RequestMapping("/update")
    public String update(Guest guest){
        service.update(guest);
        return "redirect:/guestList";
    }

}
