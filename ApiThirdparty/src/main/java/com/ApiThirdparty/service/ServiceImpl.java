package com.ApiThirdparty.service;


import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.ApiThirdparty.entity.User;
@Service
public class ServiceImpl {

	RestTemplate restTemp;
	
	public User  getData(User user) {
	String url="https://reqres.in/api/users";
	restTemp = new RestTemplate();
	 ResponseEntity<User> responseEntity = restTemp.postForEntity(url,user,User.class);
			

			System.out.println(responseEntity);
				
			return responseEntity.getBody();
	}
}

