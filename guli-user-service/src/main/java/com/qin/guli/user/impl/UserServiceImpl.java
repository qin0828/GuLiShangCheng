package com.qin.guli.user.impl;

import com.qin.guli.bean.UmsMember;
import com.qin.guli.bean.UmsMemberReceiveAddress;
import com.qin.guli.service.UserService;
import com.qin.guli.user.mapper.UmsMemberReceiveAddressMapper;
import com.qin.guli.user.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Title:com.qin.guli.user.service.impl
 * @Description:
 * @Author:18883
 * @Date:2019/9/722:44
 * @Version:1.0
 */
@Service
public class UserServiceImpl implements UserService {

    //public static final Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

    @Autowired
    UserMapper userMapper;

    @Autowired
    UmsMemberReceiveAddressMapper umsMemberReceiveAddressMapper;


    @Override
    public List<UmsMember> getAllUser() {
       // List<UmsMember> umsMemberList = userMapper.selectAllUser();
        //使用tk.mapper提供的查询方法
        List<UmsMember> umsMemberList = userMapper.selectAll();
        return umsMemberList;
    }

    @Override
    public List<UmsMemberReceiveAddress> getUmsMemberReceiveAddressByMemberId(String memberId) {
        UmsMemberReceiveAddress umsMemberReceiveAddress=new UmsMemberReceiveAddress();
        umsMemberReceiveAddress.setMemberId(memberId);

        List<UmsMemberReceiveAddress> umsMemberReceiveAddresses = umsMemberReceiveAddressMapper.select(umsMemberReceiveAddress);
        //logger.info("返回个数====="+ String.valueOf(umsMemberReceiveAddresses.size()));
        return umsMemberReceiveAddresses;
    }
}
