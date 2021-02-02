package com.nefu.se.graduationprocessmanagement.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class TeacherDTO {
    private Long id;
    private String name;
    private String number;
    private int role;
    private String title;

}
