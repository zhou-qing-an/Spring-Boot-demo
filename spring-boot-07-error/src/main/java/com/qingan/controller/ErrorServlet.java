package com.qingan.controller;

import com.qingan.bean.TesteBean;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

@RestController
public class ErrorServlet {

    @RequestMapping("/ror")
    public String test(@Valid TesteBean tb){
        return "OK";
    }

    @RequestMapping("/rr")
    public String demo(@Valid TesteBean tb, BindingResult br){
        //     判断错误个数是否存在错误?
        if(br.getFieldErrorCount() > 0){
            //      接收所有错误信息对象
            List<FieldError> list = br.getFieldErrors();
            //      创建StringBuilder
            StringBuilder sb = new StringBuilder();
            //      循环拼接
            for(FieldError fe : list){
                sb.append(fe.getField());
                sb.append("\t");
                sb.append(fe.getDefaultMessage());
                sb.append("\n");
            }
            //      返回拼接后的信息
        return sb.toString();
        }
        return "OK";
    }

}
