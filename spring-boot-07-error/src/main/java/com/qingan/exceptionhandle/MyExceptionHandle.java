package com.qingan.exceptionhandle;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

/**
 *  使用@ControllerAdvice注解监听所有controller中发生的异常,并且执行Handle方法
 */

@ControllerAdvice
public class MyExceptionHandle {

    //      监测错误异常  执行此方法
    @ExceptionHandler(Exception.class)
    public ModelAndView handle(Exception e){
        //      创建对象
        ModelAndView mv = new ModelAndView();
        //      设置错误页面
        mv.setViewName("error");
        //      获取错误信息
        mv.addObject("message",e.getMessage());
        //      返回对象
        return mv;
    }

}
