package com.memorynotfound.dao;

import com.memorynotfound.model.User;

import java.util.List;

public interface UserDAO {

	List<User> getAll(int offset, int count);

	User findById(int id);

	User findByName(String name);

	void create(User user);

	void update(User user);

	void delete(int id);

	boolean exists(User user);
}
