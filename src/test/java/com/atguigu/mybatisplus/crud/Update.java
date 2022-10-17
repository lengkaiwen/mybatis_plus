package com.atguigu.mybatisplus.crud;

import com.atguigu.mybatisplus.entity.User;
import com.atguigu.mybatisplus.mapper.UserMapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @ClassName update
 * @Description TODO
 * @Author 25159
 * @Date 2022/10/16 23:52
 * @Version 1.0
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class Update {
    @Autowired
    private UserMapper userMapper;

    @Test
    public void updateDate() {
        User user = new User();
        user.setId(1581700948707672065L);
        user.setAge(58);

        int result = userMapper.updateById(user);
        System.out.println(result);
    }
}
