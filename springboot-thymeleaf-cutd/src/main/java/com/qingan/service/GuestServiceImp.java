package com.qingan.service;

import com.qingan.bean.Guest;
import com.qingan.dao.GuestDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GuestServiceImp implements GuestServiceBase{

    @Autowired
    private GuestDao dao;


    /**
     * 查询所有人物
     *
     * @return
     */
    @Override
    public List<Guest> selectAll() {
        return dao.selectAll() ;
    }

    /**
     * 查询单个人物
     *
     * @param name 人物名
     * @return 人物对象
     */
    @Override
    public Guest selectOne(String name) {
        return dao.get(name);
    }

    /**
     * 添加一个人物
     *
     * @param guest
     */
    @Override
    public void add(Guest guest) {
        dao.add(guest);
    }

    /**
     * 删除一个人物
     *
     * @param name
     */
    @Override
    public void delete(String name) {
        dao.delete(name);
    }

    /**
     * 编辑人物信息
     *
     * @param guest
     */
    @Override
    public void update(Guest guest) {
        dao.update(guest);
    }


}
