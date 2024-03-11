package com.atguigu.servlet;

import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Description:
 * servLet开发流程
 * 1 创建javaWEB项目，同时将tomcat添加为当前项日的依赖
 * 2 重写service方法 service(HttpServletRequest req, HttpServLetResponse resp)
 * 3 在service方法中，定义业务处理代码
 * 4 在web.xml中，配置servlet对应的请求路径
 * @Author QiQi Luo
 * @Create 2024/3/11 13:49
 * @Version 1.0
 */
public class UserServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //1 从request对象中请求到处理的任何信息（username）
        String username = req.getParameter("username");//根据参数名获取参数值，无论参数是在URL？后还是请求体中
        //2 处理业务代码
        String info = "Yes";
        if ("atguigu".equals(username))
            info = "No";

        //设置响应头
        resp.setHeader("Content-type","text/html");
        //3 将要响应的数据放入到respon中
        PrintWriter writer = resp.getWriter();//该方法返回的是一个向响应体中打印字符串的打印流
        writer.write(info);

    }
}
