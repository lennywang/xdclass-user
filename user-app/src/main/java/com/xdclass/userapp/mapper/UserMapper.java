package com.xdclass.userapp.mapper;

import com.xdclass.userapp.domain.User;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.type.JdbcType;

/**
 *
 **/
public interface UserMapper {

    @Results(id = "userMap", value = {
            @Result(column = "id", property = "id", jdbcType = JdbcType.INTEGER, id = true),
            @Result(column = "account", property = "account", jdbcType = JdbcType.VARCHAR),
            @Result(column = "address", property = "address", jdbcType = JdbcType.VARCHAR),
            @Result(column = "password", property = "password", jdbcType = JdbcType.VARCHAR),
            @Result(column = "phone", property = "phone", jdbcType = JdbcType.CHAR),
            @Result(column = "point", property = "point", jdbcType = JdbcType.INTEGER),
            @Result(column = "remark", property = "remark", jdbcType = JdbcType.VARCHAR),
            @Result(column = "tel_phone", property = "telPhone", jdbcType = JdbcType.CHAR),
            @Result(column = "username", property = "username", jdbcType = JdbcType.VARCHAR),
            @Result(column = "zip_code", property = "zipCode", jdbcType = JdbcType.VARCHAR),
            @Result(column = "balance", property = "balance", jdbcType = JdbcType.BIGINT)
    })
    @Select("SELECT id,account,address,password,phone,point,remark,tel_phone,username,zip_code,balance FROM t_user where id=#{id}")
    public User getUserById(Integer id);


}
