package com.nefu.se.graduationprocessmanagement;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.codec.Hex;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigInteger;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.*;
import java.util.Base64;
import java.util.Random;

//@SpringBootTest
//@Transactional
@Slf4j
//@Rollback(value = false)
class GraduationProcessManagementApplicationTests {

    @Test
    public void sc_test() {
        byte[] array = new byte[8]; // length is bounded by 7
        new SecureRandom().nextBytes(array);
        String generatedString = new String(array, Charset.defaultCharset());
        String a = Base64.getEncoder().encodeToString(array);
        log.debug(generatedString);
        log.debug(a);
    }
    @Test
    public void sc_test2() throws NoSuchAlgorithmException {
        KeyPairGenerator keyPairGen = KeyPairGenerator.getInstance("DiffieHellman");
        // 初始化密钥对生成器，密钥大小为96-1024位
        keyPairGen.initialize(1024, new SecureRandom());
        // 生成一个密钥对，保存在keyPair中
        KeyPair keyPair = keyPairGen.generateKeyPair();

        byte[] bytes = keyPair.getPrivate().getEncoded();
        String a = Base64.getEncoder().encodeToString(bytes);
        log.debug(a);
    }
    @Test
    public void sc_test3() {
        byte[] array = new byte[5];
        new SecureRandom().nextBytes(array);
        char[] encode = Hex.encode(array);
        String hex = new String(encode);
        log.debug(hex);
    }
}
