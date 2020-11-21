package com.qingan.endpoint;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * 创建一个类交给Spring管控
 * 类上添加@Endpoint(id="端口名")  定义端口
 * 在方法上添加 @ReadOperation 端点被访问时执行此方法  注意 : 需返回JSON
 */
@RestController
@Endpoint(id = "testEndpoint") // 不能以大写字母开头
public class CustomEndpoint {

    @ReadOperation
    public Map<String, String> custom() {
        Map<String, String> map = new HashMap<>();
        map.put("message", "Hello Custom Endpoint");
        return map;
    }


}
