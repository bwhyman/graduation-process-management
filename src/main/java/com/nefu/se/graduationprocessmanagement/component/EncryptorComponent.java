package com.nefu.se.graduationprocessmanagement.component;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.crypto.encrypt.Encryptors;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
@Slf4j
public class EncryptorComponent {
    @Value("${my.secretkey}")
    private String secretKey;
    @Value("${my.salt}")
    private String salt;
    @Autowired
    private ObjectMapperComponent oComponent;

    public String encrypt(Map payload) {
        String json = oComponent.writeValueAsString(payload);
        return Encryptors.text(secretKey, salt).encrypt(json);
    }

    public Map<String, Object> decrypt(String encryptString) {
        try {
            String json = Encryptors.text(secretKey, salt).decrypt(encryptString);
            return oComponent.readValue(json);
        } catch (Exception e) {
            throw new RuntimeException();
        }
    }
}
