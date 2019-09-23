package com.qin.guli.service;

import com.qin.guli.bean.UmsMember;
import com.qin.guli.bean.UmsMemberReceiveAddress;

import java.util.List;

/**
 * @Title:com.qin.guli.user.service
 * @Description:
 * @Author:18883
 * @Date:2019/9/722:43
 * @Version:1.0
 */
public interface UserService {
    List<UmsMember> getAllUser();

    List<UmsMemberReceiveAddress> getUmsMemberReceiveAddressByMemberId(String memberId);
}
