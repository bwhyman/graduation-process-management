package com.nefu.se.graduationprocessmanagement.controller;

import com.nefu.se.graduationprocessmanagement.dto.TeacherDTO;
import com.nefu.se.graduationprocessmanagement.service.AdminService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
@RequestMapping("/api/admin/")
@Slf4j
public class AdminController {
    @Autowired
    private AdminService adminService;

    @PostMapping("teachers")
    public void addTeachers(@RequestBody List<TeacherDTO> teachers, HttpServletRequest r) {
        for (TeacherDTO t : teachers) {
            log.debug(t.getName());
        }
        adminService.addTeachers(teachers);
    }
}
