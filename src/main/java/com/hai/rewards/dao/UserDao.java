package com.hai.rewards.dao;

import java.util.List;

import com.hai.rewards.model.User;

public interface UserDao {

	User getUser(String userId);
	Boolean addUser(User user);
	List<User> listUsers();
	Boolean deleteUser(String userId);
	Boolean updateUser();
}
