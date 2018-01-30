package com.login;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginApp extends HttpServlet {
	private static final long serialVersionUID = 1L;
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//获取参数
		String name = req.getParameter("name");
		System.out.println(name);
		String possword = req.getParameter("possword");
		System.out.println(possword);
		if ("zhangsan".equals(name) && "123".equals(possword)) {
			//登录成功
			//创建对象
			HttpSession session = req.getSession();
			//把数据保存到域对象中
			session.setAttribute("name",name);
			//跳转到列表页面
			resp.sendRedirect(req.getContextPath()+"/find.do");
		}else{
			//登录失败的情况
			resp.sendRedirect(req.getContextPath()+"/jsp/fail.jsp");
		}
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		this.doGet(req, resp);
	}
}
