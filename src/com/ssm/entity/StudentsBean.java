package com.ssm.entity;

import java.util.List;

public class StudentsBean {
	private List<Student> list;

	public List<Student> getList() {
		return list;
	}

	public void setList(List<Student> list) {
		this.list = list;
	}

	@Override
	public String toString() {
		return "StudentsBean [list=" + list + "]";
	}
	
}
