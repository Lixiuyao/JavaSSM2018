package com.ssm.controller;

import java.util.Arrays;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.ssm.Utils.MyBatisUtil;
import com.ssm.entity.StBean;
import com.ssm.entity.Student;
import com.ssm.entity.StudentsBean;
import com.ssm.entity.Teacher;
import com.ssm.mapper.StudentMapper;
import com.ssm.service.IBanjiServive;
import com.ssm.service.IStudentService;
import com.ssm.service.impl.BanjiServicelmpl;
import com.ssm.service.impl.StudentServiceImpl;
@Controller
@RequestMapping(value="/student")
public class StudentController {
	private IBanjiServive banjiService = new BanjiServicelmpl();
	private IStudentService studentService = new StudentServiceImpl();
	
	@RequestMapping(value="/add")
	public ModelAndView add(Student student){
		System.out.println(student);
		studentService.add(student);
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("student",student);
		modelAndView.setViewName("student_info");
		return modelAndView;
	} 
	
	@RequestMapping(value="/getPage")
	public String getPage(){
		
		System.out.println("1111");
		return "student_add";
	} 
	
	@RequestMapping(value="/add2")
	public ModelAndView add2(Student student){
		System.out.println(student);
		studentService.add(student);
		ModelAndView modelAndView = new ModelAndView();
		
		modelAndView.addObject("student",student);
		modelAndView.setViewName("student_info");
		return modelAndView;
	} 
	@RequestMapping(value="/add3" ,method=RequestMethod.GET)
	public ModelAndView add3(String name,String age){
		System.out.println(name+"dasd"+age);
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("name",name);
		modelAndView.addObject("age",age);
		modelAndView.setViewName("student_info");
		return modelAndView;
	} 
	@RequestMapping(value="/delete")
	public String delete(int id,Model model){
		System.out.println(id);
		model.addAttribute("id",id);
		return "student_info";
	}	
	@RequestMapping(value="/addAll")
	public String addAll(StBean bean,Model model){
		Student student = bean.getStudent();
		Teacher teacher = bean.getTeacher();
		System.out.println(student);
		System.out.println(teacher);
		model.addAttribute("student",student);
		model.addAttribute("taeacher",teacher);
		
		return "student_info";
	}
	@RequestMapping(value="/deleteAll")
	public void deleteAll(int[] ids){
		for (int i : ids) {
			System.out.println(i);
		}
		System.out.println(Arrays.toString(ids));
			
	}
	@RequestMapping(value="/ccj")
	public void ccj1(StudentsBean bean){
		List<Student> list = bean.getList();
		for (Student student : list) {
			System.out.println(student);
		}		
	}
	
}
