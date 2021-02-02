package com.nefu.se.graduationprocessmanagement.service;

import com.nefu.se.graduationprocessmanagement.dto.TeacherDTO;
import com.nefu.se.graduationprocessmanagement.entity.Teacher;
import com.nefu.se.graduationprocessmanagement.entity.User;
import com.nefu.se.graduationprocessmanagement.mapper.TeacherMapper;
import com.nefu.se.graduationprocessmanagement.mapper.UserMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
@Slf4j
public class AdminService {
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private TeacherMapper teacherMapper;

    public void addTeachers(List<TeacherDTO> teachers) {
        for (TeacherDTO t : teachers) {
            User u = new User();
            u.setPassword(t.getNumber());
            u.setNumber(t.getNumber());
            u.setName(t.getName());
            u.setRole(t.getRole());
            userMapper.insert(u);
            Teacher teacher = new Teacher();
            t.setId(u.getId());
            teacher.setTitle(t.getTitle());
            teacherMapper.insert(teacher);
        }
    }
}
