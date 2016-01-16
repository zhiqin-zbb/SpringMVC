package com.zhiqin.SpringMVC.dao.impl;

public interface UserMapperExt extends UserMapper {
	String getPasswordByUsername(String username);
}
