package com.huayu.dao;

import com.huayu.model.Users;

public interface UsersDao {

	public Users selectBy(String username, String password);

}
