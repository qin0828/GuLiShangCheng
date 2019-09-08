package com.qin.guli.user.mapper;

import com.qin.guli.user.bean.Umsmember;

import java.util.List;

/**
 * @Title:com.qin.guli.user.mapper
 * @Description:
 * @Author:18883
 * @Date:2019/9/722:53
 * @Version:1.0
 */
public interface UserMapper {

    List<Umsmember> selectAllUser();

}
