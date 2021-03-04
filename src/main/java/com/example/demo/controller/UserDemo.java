package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.model.Response;
import com.example.demo.model.User;
import com.example.demo.service.UserService;

@RestController
@RequestMapping("/user")
public class UserDemo {

	@Autowired
	private UserService serivce;

	@PostMapping("/addUser")
	public Response save(@RequestBody User user) {
		return serivce.saveUSer(user);
	}

	@GetMapping("/getUsers")
	public Response getAllUsers() {
		return serivce.getAllUsers();
	}

	@PutMapping("/updatUser")
	private User updateflight(@RequestBody User updatUser) {

		return serivce.updateUser(updatUser);

	}

	@DeleteMapping("/deleteUser/{user_id}")
	public User deletedata(@PathVariable("user_id") Integer user_id) {

		return serivce.deleteById(user_id);

	}
}
