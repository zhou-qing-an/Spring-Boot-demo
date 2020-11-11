package com.qingan.service;

import com.qingan.bean.Guest;
import com.qingan.mapper.GuestMapper;
import com.qingan.mapper2.GuestMapper2;
import com.qingan.tk.mapper.TkGuestMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GuestServiceImp implements GuestServiceBase{

    @Autowired
    private GuestMapper mapper;

    @Autowired
    private GuestMapper2 mapper2;

//    @Autowired
//    private TkGuestMapper mapper;

    /**
     * 查询所有人物
     *
     * @return
     */
    @Override
    public List<Guest> selectAll() {
        return mapper2.selectAll();
    }


}
