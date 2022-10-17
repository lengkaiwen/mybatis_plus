package com.atguigu.mybatisplus.crud;

import com.atguigu.mybatisplus.entity.User;
import com.atguigu.mybatisplus.mapper.UserMapper;
import com.baomidou.mybatisplus.core.conditions.Wrapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName add
 * @Author 25159
 * @Date 2022/10/16 23:52
 * @Version 1.0
 */
@SpringBootTest
@RunWith(SpringRunner.class)

public class Add {
    @Autowired
    private UserMapper userMapper;

    @Test
    public void addDate() {
        int result = 0;
        User user = new User();
        user.setName("Helen");
        user.setAge(15);
        user.setEmail("55317332@qq.com");
        for (int i = 110; i < 120; i++) {
            user.setId((long) i);
            userMapper.insert(user);
            result++;
        }
        System.out.println(result); //影响的行数
        System.out.println(user); //id自动回填
    }
}
