package com.nefu.se.graduationprocessmanagement.entity;

import com.baomidou.mybatisplus.annotation.FieldStrategy;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import java.time.LocalDateTime;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@TableName("student")
public class Student {
    private Long id;

    private String clazz;

    private Long teacherId;

    private Integer group;

    private String topic;

    @TableField(updateStrategy = FieldStrategy.NEVER)
    private LocalDateTime updateTime;
}