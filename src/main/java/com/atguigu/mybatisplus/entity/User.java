package com.atguigu.mybatisplus.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.Version;

import java.util.Date;

import lombok.Data;

/**
 * @ClassName User
 * @Author 25159
 * @Date 2022/10/16 21:31
 * @Version 1.0
 */
@Data
public class User {
    @TableId(type = IdType.ID_WORKER)
    private Long id;

    private String name;

    private Integer age;

    private String email;
    
    @TableField(fill = FieldFill.INSERT)
    private Date createTime;

    @TableField(fill = FieldFill.UPDATE)
    private Date updateTime;

    @Version
    private Integer version;

    @TableLogic
    private Integer deleted;
}
