package com.ApiThirdparty.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.ApiThirdparty.entity.User;
import com.ApiThirdparty.service.ServiceImpl;



@RestController
public class ApiController {

	@Autowired
	private ServiceImpl serviceImpl;

	@GetMapping("/api")
	public String hello() {
		return "hello";
	}
	@GetMapping(value ="/acc")
	private String getHelloAccess(User user) {
		String url="http://localhost:9090/api";
		RestTemplate restTemplate = new RestTemplate();
		String result=restTemplate.getForObject(url,String.class);
	return result;
	} 
	@PostMapping("/id")
	private User getUser(@RequestBody User user)
	{
		return serviceImpl.getData(user);
}
}
