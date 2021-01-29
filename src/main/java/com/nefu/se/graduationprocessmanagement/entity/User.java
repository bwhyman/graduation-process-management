package com.nefu.se.graduationprocessmanagement.entity;

import com.baomidou.mybatisplus.annotation.FieldStrategy;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import java.time.LocalDateTime;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@TableName("user")
public class User {
    private Long id;

    private String number;

    private String name;

    private Integer role;

    @TableField(updateStrategy = FieldStrategy.NEVER)
    private LocalDateTime updateTime;

    private String password;
}