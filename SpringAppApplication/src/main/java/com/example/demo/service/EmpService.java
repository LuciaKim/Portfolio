package com.example.demo.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.EmpDAO;


@Service("empService")
public class EmpService {
   
	@Autowired 
	EmpDAO emp;
	 
	
	public List<Map<String, Object>> getEmpAll() {
		return emp.getEmpAll();
	}
	
	public List<Map<String, Object>> getEmpByName( String name){
		return emp.getEmpByName( name);
	}
}
