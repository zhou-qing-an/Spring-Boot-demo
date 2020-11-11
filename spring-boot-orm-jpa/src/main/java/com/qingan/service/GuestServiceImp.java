package com.qingan.service;

import com.qingan.bean.Guest;
import com.qingan.repository.GuestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GuestServiceImp implements GuestServiceBase{


    @Autowired
    private GuestRepository repository;

    /**
     * 查询所有人物
     *
     * @return
     */
    @Override
    public List<Guest> selectAll() {
        return repository.findAll();
    }


}
