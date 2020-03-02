package com.techdenovo.DAO;

import com.techdenovo.model.User;

public interface UserDao {

	public User findUserByUsername(String username);
}
