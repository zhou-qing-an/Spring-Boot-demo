package com.qingan.bean;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import java.util.Map;

@Data
@AllArgsConstructor
public class TesteBean {

    @NotBlank(message = "${guest.name.notblank}")// spring-boot  2.1.8版本才有
    private String name;

    @NotBlank
    private String age;

//    @NotEmpty
//    private Map map;

}
