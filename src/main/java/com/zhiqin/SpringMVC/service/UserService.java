package com.zhiqin.SpringMVC.service;

import com.zhiqin.SpringMVC.model.User;

public interface UserService {
	public boolean loginVerify(String username, String password);

	public User getUserById(int id);
}
