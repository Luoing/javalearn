package com.atguigu.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Description:
 *
 * @Author QiQi Luo
 * @Create 2024/3/15 16:24
 * @Version 1.0
 */
@Controller
public class TestController {
    @RequestMapping("/index")
    public String index(){
        return "index";
    }
}
