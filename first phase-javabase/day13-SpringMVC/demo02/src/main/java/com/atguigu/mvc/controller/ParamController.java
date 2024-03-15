package com.atguigu.mvc.controller;

import com.atguigu.mvc.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;

/**
 * Description:
 *
 * @Author QiQi Luo
 * @Create 2024/3/15 10:35
 * @Version 1.0
 */
@Controller
public class ParamController {
    @RequestMapping("/testServeltAPI")
    public String testerveltAPI(HttpServletRequest request){
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        System.out.println(username+"  "+password);
        return "success";

    }
    @RequestMapping("/testParam")
    public String testParam(
            @RequestParam(value = "user_name", required = false) String username,
            String password,
            String[] hobby,
            @RequestHeader("Host") String host
    ){
        System.out.println(username+"  "+password+" "+ Arrays.toString(hobby));
        System.out.println("host"+host);
        return "success";
    }
    @RequestMapping("/testbean")
    public String testBean(User user){
        System.out.println(user);
        return "success";
    }

}
