package com.nefu.se.graduationprocessmanagement.interceptor;

import com.nefu.se.graduationprocessmanagement.vo.ResultVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Component
@Slf4j
public class LoginInterceptor extends HandlerInterceptorAdapter {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String auth = request.getHeader("authorization");
        if (auth == null) {
            log.debug("LoginInterceptor");
            request.setAttribute("exception", ResultVO.unauthorized());
            request.getRequestDispatcher("/api/exception").forward(request, response);
            return false;
        }
        return true;
    }
}
