package com.atguigu.mybatisplus.crud;

import com.atguigu.mybatisplus.entity.User;
import com.atguigu.mybatisplus.mapper.UserMapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @ClassName performance
 * @Description TODO
 * @Author 25159
 * @Date 2022/10/17 15:58
 * @Version 1.0
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class Performance {

    @Autowired
    private UserMapper userMapper;

    /**
     * 测试 性能分析插件
     */
    @Test
    public void testPerformance() {
        User user = new User();
        user.setName("我是Helen");
        user.setEmail("helen@sina.com");
        user.setAge(18);
        userMapper.insert(user);
    }
}
