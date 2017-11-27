package com.hongao.ac.ums.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.hongao.ac.ums.dao.UserRepository;
import com.hongao.ac.ums.model.User;

/**
 * 用户控制器
 * @author iTeller_zc
 *
 */
@RestController
public class UserController {
	
	@Autowired
	private UserRepository userRepository;
	
	@GetMapping(value="/{id}")
	public User findById(@PathVariable Long id) {
		return userRepository.findOne(id);
	}
}
