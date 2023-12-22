package com.security.demo.domain.user;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {

    Integer getA();
}