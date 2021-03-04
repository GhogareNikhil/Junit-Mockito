package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Response;
import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository repository;

	public Response saveUSer(User user) {
		repository.save(user);
		return new Response("saved user with id" + user.getId(), Boolean.TRUE);
	}

	public Response getAllUsers() {
		List<User> users = repository.findAll();
		return new Response("number of User:" + users.size(), Boolean.TRUE);
	}

	public User updateUser(User updatUser) {
		Optional<User> updateEmployee = repository.findById(updatUser.getId());
		if (updateEmployee.isPresent()) {
			repository.save(updatUser);
			return updatUser;
		}
		return updatUser;
	}

	public User deleteById(Integer user_id) {
		repository.deleteById(user_id);
		return null;
	}

}
