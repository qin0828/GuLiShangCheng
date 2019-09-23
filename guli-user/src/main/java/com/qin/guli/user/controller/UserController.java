package com.qin.guli.user.controller;

import com.qin.guli.bean.UmsMember;
import com.qin.guli.bean.UmsMemberReceiveAddress;
import com.qin.guli.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @Title:com.qin.guli.user.controller
 * @Description:
 * @Author:18883
 * @Date:2019/9/722:56
 * @Version:1.0
 */
@Controller
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("getUmsMemberReceiveAddressByMemberId")
    @ResponseBody
    public List<UmsMemberReceiveAddress> getUmsMemberReceiveAddressByMemberId(String memberId){

        List<UmsMemberReceiveAddress> umsMemberReceiveAddressList=userService.getUmsMemberReceiveAddressByMemberId(memberId);

        return umsMemberReceiveAddressList;
    }


    @RequestMapping("getAllUser")
    @ResponseBody
    public List<UmsMember> getAllUser(){
        List<UmsMember> umsMembers=userService.getAllUser();
        return umsMembers;
    }


    @RequestMapping("index")
    @ResponseBody
    public String index(){
        return "hello user";
    }
}
