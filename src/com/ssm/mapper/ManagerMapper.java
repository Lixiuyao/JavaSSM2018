package com.ssm.mapper;

import java.util.List;
import java.util.Map;

public interface ManagerMapper {

	List<Map<String, Object>> findAll();

	List<Map<String, Object>> findAllDButil();

	int getTotalCount();

	List<List<Map<String, Object>>> findPageBeanList(int offset, int pageSize);

}
