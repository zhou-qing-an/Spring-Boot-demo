package com.qingan.resolver;

import org.springframework.boot.autoconfigure.web.servlet.error.ErrorViewResolver;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

/**
 *  自定义一个类,实现ErrorViewResolver接口
 *  重写resolveErrorView方法
 */

@Component
public class MyErrorViewResolver implements ErrorViewResolver {

    @Override
    public ModelAndView resolveErrorView(HttpServletRequest request,
                                         HttpStatus status,
                                         Map<String, Object> model) {
        //      判断状态码
        if(status.equals(HttpStatus.NOT_FOUND)){
            //      创建ModelAndView对象
            ModelAndView mv = new ModelAndView();
            //      设置返回转发路径
            mv.setViewName("/resolver404");
            //      返回对象
            return mv;
        }
        return null;
    }
}
