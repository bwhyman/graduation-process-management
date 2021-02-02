package com.nefu.se.graduationprocessmanagement.controller;

import com.nefu.se.graduationprocessmanagement.vo.ResultVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@Slf4j
@RequestMapping("/api/")
public class LoginController {


    @RequestMapping(value = "exception", method = {RequestMethod.GET, RequestMethod.POST})
    public ResultVO getExp(HttpServletRequest request) {
        log.debug("exp");
        return (ResultVO) request.getAttribute("exception");
    }
}
