package com.accenture.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.accenture.vo.User;

@RestController
public class UserServiceController {

	@RequestMapping("/userregistry/user")
	public User user(@RequestParam(value="id") int id){
		User user = new User();
		user.setId(id);
		user.setName("Victor");
		user.setAddress("Road trip");

		return user ;
	}


}
