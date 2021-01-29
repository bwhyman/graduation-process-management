package com.nefu.se.graduationprocessmanagement;

import com.nefu.se.graduationprocessmanagement.service.AdminService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
public class UserServiceTest {
    @Autowired
    private AdminService adminService;

    @Test
    public void add_test() {
        // adminService.addUser();
        log.debug("test");
    }
}
