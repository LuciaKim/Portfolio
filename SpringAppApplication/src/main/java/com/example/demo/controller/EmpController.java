package com.example.demo.controller;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.VO.Param;
import com.example.demo.service.EmpService;

@CrossOrigin
@RestController
@RequestMapping("/emp")
public class EmpController {
	
	private static Logger logger = LogManager.getLogger( EmpController.class);
	
    @Resource(name="empService")
    private EmpService empService;
    
    @RequestMapping(value ="/getEmpAll",method = RequestMethod.GET)
    public List<Map<String, Object>> getTest() {
    	
    	System.out.println(empService.getEmpAll().size());
        return empService.getEmpAll();
    }
    
    @RequestMapping(value ="/getEmpByName/name/{name}",method = RequestMethod.GET)
    public List<Map<String, Object>> getTest( @PathVariable String name) {
    	
        return empService.getEmpByName( name);
    }
    
    @PostMapping(value ="/getEmpByNamePost")
    public List<Map<String, Object>> getTestPost( @RequestBody Param param) {
    	return empService.getEmpByName( param.getName());
    }
}
