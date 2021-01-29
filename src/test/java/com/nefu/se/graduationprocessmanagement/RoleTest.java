package com.nefu.se.graduationprocessmanagement;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.security.crypto.codec.Hex;

import java.security.SecureRandom;

@Slf4j
public class RoleTest {
    @Test
    public void role_hash_test() {
        byte[] bytes = new byte[5];
        new SecureRandom().nextBytes(bytes);
        String role =new String(Hex.encode(bytes));
        log.debug(role);
    }
}
