package com.qin.guli.user.mapper;

import com.qin.guli.bean.UmsMember;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * @Title:com.qin.guli.user.mapper
 * @Description:
 * @Author:18883
 * @Date:2019/9/722:53
 * @Version:1.0
 */
//继承Mapper 使用通用的增删改查
public interface UserMapper extends Mapper<UmsMember> {

    List<UmsMember> selectAllUser();

}
