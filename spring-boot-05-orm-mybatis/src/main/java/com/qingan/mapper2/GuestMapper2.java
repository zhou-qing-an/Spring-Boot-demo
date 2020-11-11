package com.qingan.mapper2;

import com.qingan.bean.Guest;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface GuestMapper2 {

    @Select("select * from guest")
    List<Guest> selectAll();
}
