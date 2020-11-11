package com.qingan.dao;

import com.qingan.bean.Guest;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class GuestDao {

    private static List<Guest> list = new ArrayList<>();

    static{
        list.add(new Guest("黄晓明","店长"));
        list.add(new Guest("秦海璐","财务"));
        list.add(new Guest("林述巍","总厨"));
        list.add(new Guest("王俊凯","经理"));
        list.add(new Guest("杨紫","前台"));
    }

    /**
     *  查询所有人物信息
     * @return   list
     *
     */
    public List<Guest> selectAll(){
        return list;
    }

    /**
     *  添加人物
     * @param guest 对象
     */
    public void add(Guest guest){
        list.add(guest);
    }


    /**
     *  删除人物
     * @param name  人物名字
     */
    public void delete(String name){
        Guest guest = get(name);
        list.remove(guest);
    }

    /**
     *      编辑人物
     * @param guest  人物对象
     */
    public void update(Guest guest){
        Guest newGuest = get(guest.getName());
        newGuest.setRole(guest.getRole());
    }

    /**
     *     根据姓名查询人物
     * @param name  姓名
     * @return  Guest   人物
     */
    public Guest get(String name){

        Guest person = null;

        for(int i = 0; i < list.size(); i++){

            if(list.get(i).getName().equals(name)){
                person = list.get(i);
                break;
            }
        }
        return person;
    }

}
