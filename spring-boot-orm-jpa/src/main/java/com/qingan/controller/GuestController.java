package com.qingan.controller;

import com.qingan.bean.Guest;
import com.qingan.service.GuestServiceBase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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
        List<Guest> list = service.selectAll();
        model.addAttribute("list", list);
        return "index";
    }


}
