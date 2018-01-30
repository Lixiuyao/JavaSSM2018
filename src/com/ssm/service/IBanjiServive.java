package com.ssm.service;

import java.util.List;

import com.ssm.entity.Banji;
import com.ssm.entity.Student;

public interface IBanjiServive {
	List<Banji> findAll();

	void add(Student student);
}
