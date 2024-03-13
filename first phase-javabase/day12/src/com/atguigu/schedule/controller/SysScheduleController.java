package com.atguigu.schedule.controller;

import com.sun.deploy.net.HttpRequest;
import com.sun.deploy.net.HttpResponse;
import com.sun.org.apache.xerces.internal.util.HTTPInputSource;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.Method;

/**
 * Description:
 *
 * @Author QiQi Luo
 * @Create 2024/3/13 09:25
 * @Version 1.0
 */

/**
 * 增加日程请求 /schdeule/add
 * 查询日程请求 /schedule/find
 * 修改日程请求 /schedule/update
 * 删除日程请求 /schedule/remove
 */
@WebServlet("/schedule/*")
public class SysScheduleController extends BaseController {
//    @Override
//    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        String requestURI = req.getRequestURI();
//        String[] split = requestURI.split("/");
//        String methodName = split[split.length - 1];
//
//        //使用反射来通过方法名来获取下面方法
//        Class aclass = this.getClass();
//        try {
//            Method method = aclass.getDeclaredMethod(methodName, HttpServletRequest.class, HttpServletResponse.class);
//            //暴力破解方法访问修饰权限
//            method.setAccessible(true);
//            //执行方法
//            method.invoke(this,req,resp);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

//        if (methodName.equals("add")){
//            add(req,resp);
//        }else if(methodName.equals("find")){
//            find(req,resp);
//
//        } else if (methodName.equals("update")) {
//            update(req,resp);
//
//        } else if (methodName.equals("remove")) {
//            remove(req,resp);
//        }

//    }

    protected void add(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        System.out.println("add");

    }
    protected void find(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        System.out.println("find");
    }
    protected void update(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        System.out.println("update");
    }
    protected void remove(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        System.out.println("remove");
    }
}
