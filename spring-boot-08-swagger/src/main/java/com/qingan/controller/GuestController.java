package com.qingan.controller;

import com.qingan.bean.Guest;
import io.swagger.annotations.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.annotations.ApiIgnore;

@Controller
@RequestMapping("/guest")
@Api(tags = {"嘉宾的接口"},description = "嘉宾的增删改查")
public class GuestController {


    /**
     *     查询全表
     * @param model
     * @return  index 转发页面
     */
    @GetMapping
    @ApiOperation("查询所有嘉宾")
    public String selectAll(Model model) {
        return "index";
    }

    /**
     *  请求添加页面
     * @return
     */
    @GetMapping("/toAdd")
    @ApiIgnore
    public String toAdd(){
        return "toAdd";
    }

    /**
     * 添加人物
     * @param guest  人物对象
     * @return   重定向
     */
    @PostMapping
    @ApiOperation("添加嘉宾")
    public String add(Guest guest){
        return "redirect:/guest";
    }

    /**
     *  删除人物
     * @param name  人物姓名
     * @return   重定向
     */
    @DeleteMapping("/{name}")
    @ApiOperation("删除嘉宾")
    @ApiImplicitParam(name = "name",value = "名字")
    public String delete(@PathVariable("name") String name){
        return "redirect:/guestList";
    }

    /**
     *      跳转到修改页面
     * @param model
     * @param name
     * @return
     */
    @GetMapping("/toUpdate/{name}")
    @ApiIgnore
    public String toUpdate(Model model, String name){
        return "toUpdate";
    }

    /**
     *  修改人物
     * @param guest
     * @return
     */
    @PutMapping
    @ApiOperation("修改嘉宾")
    public String update( Guest guest){
        return "redirect:/guestList";
    }

}
