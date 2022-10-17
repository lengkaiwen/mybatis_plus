package com.atguigu.mybatisplus.mapper;

import com.atguigu.mybatisplus.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import org.springframework.stereotype.Repository;

/**
 * @ClassName UserMapper
 * @Author 25159
 * @Date 2022/10/16 21:36
 * @Version 1.0
 */
@Repository
public interface UserMapper extends BaseMapper<User> {
}
