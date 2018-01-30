package com.ssm.mapper;

import java.util.List;

import com.ssm.entity.Student;
import com.ssm.vo.StudentSearchCondition;


public interface StudentMapper {
	/**
	 * 
	 * @param 添加学生类
	 * @return 返回值是int类型的
	 */
	
	public abstract int add(Student Student);
	/**
	 * 查找所有的学生
	 * @return  学生的集合类
	 */
	
	 List<Student> findAll();
	 /**
	  * 
	  * 
	  * @param name
	  * @return  查询到的重复名字存不存在
	  */
	
	public abstract boolean checkName(String name);
	/**
	 * 
	 * @param Student
	 * @return 影响的行数
	 */
	public abstract boolean  upadte(Student Student);
	/**
	 * 通过id来查找
	 * @return 返回的是某个学生类
	 */
	public abstract Student findByid(int id);
	/**
	 *  通过name来查找
	 * @param name
	 * @return 返回的是某个学生类
	 */
	public abstract Student findByName(String name);
	
	public abstract int delete(int id);
	
	public abstract List<Student> search(StudentSearchCondition sCondition);
	
	public abstract List<Student> findPageBeanList(int offset, int pageSize);
	
	public abstract int getTotalCount();
	
	public abstract int getTotalCount(StudentSearchCondition sCondition);
	
	public abstract List<Student> findPageBeanList(StudentSearchCondition sCondition);
	
	public abstract boolean deleteAll(String[] values);
	
	public abstract boolean updateBanji(int stuId, int banId);
	
	
}
