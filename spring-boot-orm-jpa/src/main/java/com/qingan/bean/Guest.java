package com.qingan.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import javax.persistence.Column;
import javax.persistence.Entity;
import java.io.Serializable;

@Data
@AllArgsConstructor
@Entity
@NoArgsConstructor
public class Guest implements Serializable {
    @javax.persistence.Id
    private Integer id;
    @Column
    private String name;
    @Column
    private String role;


}
