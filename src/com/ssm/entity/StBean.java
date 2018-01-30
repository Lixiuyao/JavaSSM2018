package com.ssm.entity;

public class StBean {
	private Student student;
	private Teacher teacher;
	
	
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public Teacher getTeacher() {
		return teacher;
	}
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
	@Override
	public String toString() {
		return "StBean [student=" + student + ", teacher=" + teacher + "]";
	}
	
	
}
