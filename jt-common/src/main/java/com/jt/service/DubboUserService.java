package com.jt.service;

import com.jt.pojo.User;

/**
 * 定义中立的接口
 * @author Administrator
 *
 */
public interface DubboUserService {

	void saveUser(User user);

	String findUserByUP(User user);



}
