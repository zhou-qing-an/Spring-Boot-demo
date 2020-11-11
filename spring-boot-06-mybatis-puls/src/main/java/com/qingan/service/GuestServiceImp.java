package com.qingan.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.qingan.bean.Guest;
import com.qingan.mapper.GuestMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GuestServiceImp extends ServiceImpl<GuestMapper,Guest> implements GuestServiceBase{


//    @Autowired
//    private GuestMapper mapper;
//
//    /**
//     * 查询所有人物
//     *
//     * @return
//     */
//    @Override
//    public List<Guest> selectAll() {
//        return mapper.selectList(null);
//    }


}
