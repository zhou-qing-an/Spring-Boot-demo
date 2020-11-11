package com.qingan.service;

import com.qingan.bean.Guest;

import java.util.List;

public interface GuestServiceBase {

    /**
     *  查询所有人物
     * @return
     */
    List<Guest> selectAll();


}
