package com.abhirup.pradhan.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.abhirup.pradhan.model.User;
import com.abhirup.pradhan.repository.UserRepository;


@RestController
@CrossOrigin("http://localhost:3000")
public class UserController {

	@Autowired
	private UserRepository uR;
	@GetMapping("user/get/{email}")
	public Optional<User> getUser(@PathVariable("email") String email) {
		return uR.findById(email);
	}
	@GetMapping("user/getall")
	public List<User> getAllUser() {
		return uR.findAll();
	}
	@PostMapping("user/add")
	public void addUser(@RequestBody User user) {
		uR.save(user);
	}
	@PutMapping("user/update")
	public void updateUser(@RequestBody User user) {
		uR.save(user);
	}
	@DeleteMapping("user/delete/{email}")
	public void deleteUser(@PathVariable("email") String email) {
		uR.deleteById(email);
	}
}
