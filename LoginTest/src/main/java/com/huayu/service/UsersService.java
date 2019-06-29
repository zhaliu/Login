package com.huayu.service;

import com.huayu.model.Users;

public interface UsersService {

	public Users findBy(String username, String password);
}
