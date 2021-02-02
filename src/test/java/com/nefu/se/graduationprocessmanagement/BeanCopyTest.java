package com.nefu.se.graduationprocessmanagement;

import com.nefu.se.graduationprocessmanagement.dto.TeacherDTO;
import com.nefu.se.graduationprocessmanagement.entity.Teacher;
import com.nefu.se.graduationprocessmanagement.entity.User;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.BeanUtils;

@Slf4j
public class BeanCopyTest {

    @Test
    public void copy_test() {
        TeacherDTO teacherDTO = new TeacherDTO();
        teacherDTO.setName("BO");
        teacherDTO.setRole(1);
        teacherDTO.setTitle("test");
        User user = new User();
        BeanUtils.copyProperties(teacherDTO, user);
        log.debug(user.getName());
        Teacher teacher = new Teacher();
        BeanUtils.copyProperties(teacherDTO, teacher);
        log.debug(teacher.getTitle());
    }
}
