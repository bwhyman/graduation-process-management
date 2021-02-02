package com.nefu.se.graduationprocessmanagement.vo;

import lombok.Builder;
import lombok.Data;

import java.util.Map;

@Data
@Builder
public class ResultVO {
    private int code;
    private String message;
    private Map<String, Object> data;

    public static ResultVO unauthorized() {
        return ResultVO.builder().code(401).message("未登录").build();
    }
}
