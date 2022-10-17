package com.atguigu.mybatisplus.crud;

import com.atguigu.mybatisplus.entity.User;
import com.atguigu.mybatisplus.mapper.UserMapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @ClassName OptimisticLocker
 * @Description 乐观锁测试
 * @Author 25159
 * @Date 2022/10/17 13:40
 * @Version 1.0
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class OptimisticLocker {
    @Autowired
    private UserMapper userMapper;
    /**
     * 测试 乐观锁插件
     */
    @Test
    public void testOptimisticLocker() {

        //查询
        User user = userMapper.selectById(1L);
        //修改数据
        user.setName("Helen Yao");
        user.setEmail("helen@qq.com");
        //执行更新
        userMapper.updateById(user);
    }

    /**
     * 测试乐观锁插件 失败
     */
    @Test
    public void testOptimisticLockerFail() {

        //查询
        User user = userMapper.selectById(1L);
        //修改数据
        user.setName("Helen Yao1");
        user.setEmail("helen1@qq.com");

        //模拟另一个线程中间更新了数据
        //查询
        User user2 = userMapper.selectById(1L);
        //修改数据
        user2.setName("Helen Yao2");
        user2.setEmail("helen2@qq.com");
        userMapper.updateById(user2);


        //执行更新
        userMapper.updateById(user);
    }
}
