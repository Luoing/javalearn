package com.atguigu.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Description:
 *
 * @Author QiQi Luo
 * @Create 2024/3/14 14:25
 * @Version 1.0
 */
@Controller
//@RequestMapping("/hello")
public class RequestMappingController {
    @RequestMapping(
           value = {"/testRequestMapping","/test"},
            method = {RequestMethod.GET,RequestMethod.POST}
    )
    public String success(){
        return "success";
    }

    @GetMapping("/testMapping")
    public String testMapping(){
        return "success";
    }
    @RequestMapping(value = "/testPut",method = RequestMethod.PUT)
    public String testPut(){
        return "success";
    }

    @RequestMapping(
            value = "/testParamsAndHeaders",
            params = {"username","password"},
            headers = {"Host=localhost:8080"}
    )
    public String testParamsAndHeader(){
        return "success";
    }

    @RequestMapping("/a?a/testAnt")
    public String testAnt(){
        return "success";
    }
}
