package com.xdclass.userapi.service;

import com.xdclass.userapi.VO.UserVO;

public interface IUserService {
    /**
     * 通过用户ID获取用户信息接口
     **/
    public UserVO getUserById(Integer id);
}
