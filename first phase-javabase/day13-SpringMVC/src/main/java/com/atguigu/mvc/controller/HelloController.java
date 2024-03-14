package com.atguigu.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Description:
 *
 * @Author QiQi Luo
 * @Create 2024/3/14 11:02
 * @Version 1.0
 */
@Controller
public class HelloController {

    @RequestMapping("/")
    public String index(){
        return "index";
    }
    @RequestMapping("/target")
    public String toTarget(){
        return "target";
    }
}
