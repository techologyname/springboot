package com.xj.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xj.mapper.UserMapper;
import com.xj.pojo.User;
import com.xj.service.UserService;
@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserMapper userMapper;
	@Override
	public User loginUser(User user) {
		return userMapper.selByUAndP(user);
	}

}
