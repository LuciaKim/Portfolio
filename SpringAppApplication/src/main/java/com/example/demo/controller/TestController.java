package com.example.demo.controller;

import java.util.Map;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/test")
@CrossOrigin
@RestController
public class TestController {

	@RequestMapping(value ="/t1",method = RequestMethod.POST)
	public String test( @RequestBody Map map) {
		return "test";
	}
}
