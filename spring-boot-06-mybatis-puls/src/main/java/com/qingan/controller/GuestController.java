package com.qingan.controller;

import com.qingan.bean.Guest;
import com.qingan.service.GuestServiceBase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/guest")
public class GuestController {

    @Autowired
    private GuestServiceBase service;

    /**
     *     查询全表
     * @param model
     * @return  index 转发页面
     */
    @GetMapping
    public String selectAll(Model model) {
        List<Guest> list = service.list();
        model.addAttribute("list", list);
        return "index";
    }

    @GetMapping("/toAdd")
    public String toAdd(){
        return "toAdd";
    }

    @Transactional
    @PostMapping()
    public String add(Guest guest){
        guest.setId(22);
        service.save(guest); // 添加数据
        int result = 1/0;
        return "redirect:/guest";
    }

}
