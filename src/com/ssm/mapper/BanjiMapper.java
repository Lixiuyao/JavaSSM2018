package com.ssm.mapper;

import java.util.List;

import com.ssm.entity.Banji;
import com.ssm.vo.StudentSearchCondition;

public interface BanjiMapper {

	List<Banji> findAll();

	

	int add(Banji banji);



	boolean checkName(String name);



	int delete(int id);



	Boolean update(Banji banji);



	int getTotalCount();



	List<Banji> findByList(int offset, int pageSize);



	int getTotalCount(StudentSearchCondition sCondition);



	List<Banji> findPageBeanList(StudentSearchCondition sCondition);
	
}
