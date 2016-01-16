package com.zhiqin.SpringMVC.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhiqin.SpringMVC.dao.impl.UserMapperExt;
import com.zhiqin.SpringMVC.model.User;
import com.zhiqin.SpringMVC.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {
	@Autowired
	private UserMapperExt userMapperExt;

	@Override
	public User getUserById(int id) {
		return userMapperExt.selectByPrimaryKey(id);
	}

	@Override
	public boolean loginVerify(String username, String password) {
		if (userMapperExt.getPasswordByUsername(username).equals(password))
			return true;
		else
			return false;
	}
}
