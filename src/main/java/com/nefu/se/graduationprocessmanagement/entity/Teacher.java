package com.nefu.se.graduationprocessmanagement.entity;

import com.baomidou.mybatisplus.annotation.FieldStrategy;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import java.time.LocalDateTime;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@TableName("teacher")
public class Teacher {
    private Long id;

    private Integer group;

    private String title;

    private Integer quantity;

    private String description;

    @TableField(updateStrategy = FieldStrategy.NEVER)
    private LocalDateTime updateTime;
}