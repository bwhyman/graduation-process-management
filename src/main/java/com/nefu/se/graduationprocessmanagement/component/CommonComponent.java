package com.nefu.se.graduationprocessmanagement.component;

import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@Component
@Slf4j
public class CommonComponent {

    public HttpServletRequest getCurrentRequest() {
        return ((ServletRequestAttributes) Objects
                .requireNonNull(RequestContextHolder.getRequestAttributes()))
                .getRequest();
    }

    public HttpServletResponse getCurrentResponse() {
        return ((ServletRequestAttributes) Objects
                .requireNonNull(RequestContextHolder.getRequestAttributes()))
                .getResponse();
    }

    public long getUserId() {
        return (long) getCurrentRequest().getAttribute("uId");
    }

    public long getRole() {
        return (long) getCurrentRequest().getAttribute("role");
    }

}
