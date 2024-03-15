package com.atguigu.mvc.controller;

import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * Description:
 *
 * @Author QiQi Luo
 * @Create 2024/3/15 16:59
 * @Version 1.0
 */
public class ScopeController {
    //使用servletAPI向域对象发送数据
    @RequestMapping("/testRequestByServeltAPI")
    public String testRequestByServeltAPI(HttpServletRequest request){
        request.setAttribute("testRequestScope","hello,servletHello");
        return "success";
    }
}
