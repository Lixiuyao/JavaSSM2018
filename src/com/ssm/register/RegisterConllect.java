package com.ssm.register;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class RegisterConllect {
//	@InitBinder
//	public void initBinder(WebDataBinder binder){
//		SimpleDateFormat sFormat = new SimpleDateFormat("yyyy-MM-dd");
//		sFormat.setLenient(false);
//		binder.registerCustomEditor(Date.class, new CustomDateEditor(sFormat, true));
//	}
	
	
	@RequestMapping(value="/register")
	public void register(String name,Date date){
		System.out.println(name);
		System.out.println(date);
	}
}
