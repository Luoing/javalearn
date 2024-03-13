package com.atguigu.schedule.controller;

import com.atguigu.schedule.pojo.SysUser;
import com.atguigu.schedule.service.SysUserService;
import com.atguigu.schedule.service.impl.SysUserServiceImpl;
import com.atguigu.schedule.util.MD5Util;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
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
 * @Create 2024/3/13 09:22
 * @Version 1.0
 */
@WebServlet("/user/*")
public class SysUserController extends BaseController {
    private SysUserService userService = new SysUserServiceImpl();
    /**
     * 接受客户端提交的参数
     * @param req
     * @param resp
     * @throws ServletException
     * @throws IOException
     */
    protected void regist(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //1、接收客户端提交的参数
        String username = req.getParameter("username");
        String userPwd = req.getParameter("userPwd");
        //2、调用服务层，完成注册功能
        SysUser sysUser = new SysUser(null,username,userPwd);
        int rows = userService.regist(sysUser);
        //3、根据注册结果（成功 失败）做页面跳转
        if (rows>0){
            resp.sendRedirect("/registSuccess.html");
        }else {
            resp.sendRedirect("/registFail.html");
        }
    }

    protected void login(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //1、接收用户名和密码
        String username = req.getParameter("username");
        String userPwd = req.getParameter("userPwd");
        //2、调用服务层方法，根据用户名查询用户信息
        SysUser loginUser = userService.findByUsername(username);
        if (null == loginUser){
            resp.sendRedirect("/loginUsernameError.html");
        }else if (! MD5Util.encrypt(userPwd).equals(loginUser.getUserPwd())){
            //3、判断密码匹配
            resp.sendRedirect("/loginUserPwdError.html");
        }else {
            //4、跳转到首页
            resp.sendRedirect("/showSchedule.html");
        }

    }
}
