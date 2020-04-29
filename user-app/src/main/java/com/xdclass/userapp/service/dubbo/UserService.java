package com.xdclass.userapp.service.dubbo;

import com.xdclass.userapi.VO.UserVO;
import com.xdclass.userapi.service.IUserService;
import com.xdclass.userapp.domain.User;
import com.xdclass.userapp.mapper.UserMapper;
//import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.concurrent.atomic.AtomicInteger;

/**
 *
 **/
@Service
public class UserService implements IUserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public UserVO getUserById(Integer id) {
        User user = userMapper.getUserById(id);
        UserVO userVO = new UserVO();
        BeanUtils.copyProperties(user, userVO);

        return userVO;
    }
}
