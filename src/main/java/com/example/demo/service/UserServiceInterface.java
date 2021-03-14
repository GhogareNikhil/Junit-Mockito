package com.example.demo.service;

import com.example.demo.entity.User;
import com.example.demo.model.Response;

public interface UserServiceInterface {
	public Response saveUSer(User user);
	public Response getAllUsers();
	public User updateUser(User updatUser);
	public User deleteById(Integer user_id);

}
