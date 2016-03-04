package com.zhiqin.SpringMVC.dao.impl;

import com.zhiqin.SpringMVC.model.User;

public interface UserMapperExt extends UserMapper {
	String getPasswordByUsername(String username);

	User getUserByUsername(String username);
}
