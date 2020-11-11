package com.qingan.mapper;

import com.qingan.bean.Guest;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

//@Mapper
public interface GuestMapper {

    @Select("select * from guest")
    List<Guest> selectAll();

}
