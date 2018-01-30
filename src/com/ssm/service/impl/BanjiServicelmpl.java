package com.ssm.service.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.ssm.Utils.MyBatisUtil;
import com.ssm.entity.Banji;
import com.ssm.entity.Student;
import com.ssm.mapper.BanjiMapper;
import com.ssm.service.IBanjiServive;

public class BanjiServicelmpl implements IBanjiServive{
	private BanjiMapper banjiMapper;
	 	
	public BanjiServicelmpl() {
			SqlSession session = MyBatisUtil.getSqlSession();
	 		banjiMapper = session.getMapper(BanjiMapper.class);
	 	}
	@Override
	public List<Banji> findAll() {
		return banjiMapper.findAll();
	}
	@Override
	public void add(Student student) {
		// TODO Auto-generated method stub
		
	}

	

}
