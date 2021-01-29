package com.nefu.se.graduationprocessmanagement.service;

import com.nefu.se.graduationprocessmanagement.entity.Teacher;
import com.nefu.se.graduationprocessmanagement.entity.User;
import com.nefu.se.graduationprocessmanagement.mapper.TeacherMapper;
import com.nefu.se.graduationprocessmanagement.mapper.UserMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@Slf4j
public class AdminService {
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private TeacherMapper teacherMapper;

    public void addUser() {
        User u = new User();
        u.setRole(1);
        u.setName("BO");
        u.setNumber("1001");
        u.setPassword("1001");
       userMapper.insert(u);
        Teacher t = new Teacher();
        t.setId(u.getId());
        teacherMapper.insert(t);
    }
}
