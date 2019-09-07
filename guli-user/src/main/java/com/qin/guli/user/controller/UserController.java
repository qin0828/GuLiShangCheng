package com.qin.guli.user.controller;

import com.qin.guli.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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

    @RequestMapping("index")
    @ResponseBody
    private String index(){
        return "hello user";
    }
}
