package com.atguigu.mybatisplus.crud;

import com.atguigu.mybatisplus.mapper.UserMapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.HashMap;

/**
 * @ClassName delete
 * @Description TODO
 * @Author 25159
 * @Date 2022/10/16 23:52
 * @Version 1.0
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class Delete {
    @Autowired
    private UserMapper userMapper;

    @Test
    public void delete() {
        int delete = userMapper.deleteById(1L);
        System.out.println("完成删除");
    }

    @Test
    public void testDeleteBatchIds() {

        int result = userMapper.deleteBatchIds(Arrays.asList(88, 89, 90));
        System.out.println(result);
    }@Test
    public void testDeleteByMap() {

        HashMap<String, Object> map = new HashMap<>();
        map.put("name", "Helen");
        map.put("age", 15);

        int result = userMapper.deleteByMap(map);
        System.out.println(result);
    }

}
