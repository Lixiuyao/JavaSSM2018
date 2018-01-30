package com.ssm.service.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import com.ssm.Utils.MyBatisUtil;
import com.ssm.entity.Student;
import com.ssm.mapper.StudentMapper;

import com.ssm.service.IStudentService;

public class StudentServiceImpl implements IStudentService {
	
	
	private SqlSession session = MyBatisUtil.getSqlSession();
	private StudentMapper studentMapper =  session.getMapper(StudentMapper.class);
//	public StudentServiceImpl() {
//		 session =
//		 studentMapper =;
//		
//	 }

	@Override
	public int add(Student student) {
		int count = studentMapper.add(student);
		return count;
	}
	
	
	@Test
	public void addd(){
		 SqlSession sqlSession = MyBatisUtil.getSqlSession();
		 System.out.println(sqlSession);
		 StudentMapper studentDao = sqlSession.getMapper(StudentMapper.class);
		 List<Student> list = studentDao.findAll();
		 for (Student student : list) {
			System.out.println(student);
		}
	}
	
	
	
	

}
