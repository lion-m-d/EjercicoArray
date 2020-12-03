package com.array.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.array.app.service.ServiceArray;
import com.array.app.util.ErrorHandler;


@RestController
@RequestMapping("${application.url}")
public class RestControllerArray {
	
	@Autowired
	ServiceArray array;

	@PostMapping("/matriz")
	public int[][] get(@RequestBody int[][] dato) throws ErrorHandler {
		
		return array.array(dato);
	}
	

}
