package com.nefu.se.graduationprocessmanagement.vo;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;

@Data
@NoArgsConstructor
public class ResultVO {
    private int code;
    private String message;
    private Map<String, Object> data;


}
