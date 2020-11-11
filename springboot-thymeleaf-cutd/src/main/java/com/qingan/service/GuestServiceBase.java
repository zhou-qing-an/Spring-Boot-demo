package com.qingan.service;

import com.qingan.bean.Guest;

import java.util.List;

public interface GuestServiceBase {

    /**
     *  查询所有人物
     * @return
     */
    List<Guest> selectAll();

    /**
     *  查询单个人物
     * @param name   人物名
     * @return   人物对象
     */
    Guest selectOne(String name);

    /**
     *  添加一个人物
     * @param guest
     */
    void add(Guest guest);


    /**
     *  删除一个人物
     * @param name
     */
    void delete(String name);

    /**
     *  编辑人物信息
     * @param guest
     */
    void update(Guest guest);

}
