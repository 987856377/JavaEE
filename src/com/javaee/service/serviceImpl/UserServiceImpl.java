package com.javaee.service.serviceImpl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.javaee.mapper.UserMapper;
import com.javaee.service.UserService;

@Service("userService")
@Transactional
public class UserServiceImpl implements UserService {

	@Resource
	private UserMapper userMapper;
	
	@Override
	public String getIdByAge(String age) {
		// TODO Auto-generated method stub
		return userMapper.getIdByAge(age);
	}

}
