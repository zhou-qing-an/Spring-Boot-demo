package com.qingan.health;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

/**
 * 设置自定义健康指示器 (health端口中添加信息 )
 * 自定义一个类交给Spring管理  添加@Component注解
 * 实现Health方法
 * down()添加指标   down
 * up()  添加指标   up
 * withDetail()   设置异常信息
 * build()         返回Health对象
 */
@Component
public class CustomHealth implements HealthIndicator {
    @Override
    public Health health() {
        int temp = 1;
        if (temp != 1) {
            return Health.down().withDetail("message", "垃圾是sb").build();
        }
        return Health.up().build();
    }
}
