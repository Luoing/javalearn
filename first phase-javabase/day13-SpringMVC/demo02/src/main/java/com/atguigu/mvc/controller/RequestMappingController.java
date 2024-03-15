package com.atguigu.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
    )//get 查询, put 修改, post 添加, delete 删除
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

    @RequestMapping("/testPath/{id}/{admin}")
    public String testPast(@PathVariable("id")Integer id){
        System.out.println(id);
        return "success";
    }
}
