package com.xdclass.userapp.controller;

import com.xdclass.userapi.VO.UserVO;
import com.xdclass.userapp.domain.User;
import com.xdclass.userapp.service.dubbo.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 **/
@RequestMapping("api/v1/user/")
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("findUserById")
    public UserVO getUserById(Integer id) {
        if (id==null||id==0)
            return new UserVO();

        UserVO user = userService.getUserById(id);
        return user;
    }
}
