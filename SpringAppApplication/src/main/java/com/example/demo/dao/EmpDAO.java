package com.example.demo.dao;

import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface EmpDAO {

	public List<Map<String, Object>> getEmpAll();
	public List<Map<String, Object>> getEmpByName( String name);
}
