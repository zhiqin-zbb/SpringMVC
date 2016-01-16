package com.zhiqin.SpringMVC.service;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;
import com.zhiqin.SpringMVC.model.User;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:com/zhiqin/SpringMVC/config/spring.xml",
		"classpath:com/zhiqin/SpringMVC/config/spring-mybatis.xml" })
public class TestUserService {
	private static final Logger LOGGER = Logger.getLogger(TestUserService.class);

	@Autowired
	private UserService userService;

	@Test
	public void testQueryById() {
		User user = userService.getUserById(1);
		LOGGER.info(JSON.toJSON(user));
	}
}
