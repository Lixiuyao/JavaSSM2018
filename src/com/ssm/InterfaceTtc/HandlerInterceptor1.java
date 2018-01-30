package com.ssm.InterfaceTtc;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class HandlerInterceptor1 implements HandlerInterceptor{
    /*
     * Controller调用前调用这个方法
     * 返回true表示继续执行，返回false终止执行
     * 用户权限的验证，登录验证都可以放在这里
     */

	@Override
	public boolean preHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2) throws Exception {
		System.out.println("HandlerInterceptor1.preHandle()");
		//是false的情况下,停止程序向下进行
		return true;
	}
	  /*
     * Controller执行后调用这个方法，但是是在返回ModelAndView之前
     */

	@Override
	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, ModelAndView arg3)
			throws Exception {
		System.out.println("HandlerInterceptor1.postHandle()");
	}
	 
	/*
     * Controller执行完后且ModelAndView视图已经返回
     */
	@Override
	public void afterCompletion(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
		System.out.println("HandlerInterceptor1.afterCompletion()");
	}
}
