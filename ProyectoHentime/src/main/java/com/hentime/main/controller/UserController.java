package com.hentime.main.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hentime.main.exception.UserNotFoundException;
import com.hentime.main.model.User;
import com.hentime.main.service.UserService;

@RestController
@RequestMapping("/usuarios")
public class UserController {

	@Autowired
	private UserService service;
	
	@GetMapping("/{id}")
	public User listById(@PathVariable("id") Integer id) throws Exception {
		//System.out.println(id);
		System.out.println(service.findById(id).toString())	;
		return service.findById(id);
	}
	
	@GetMapping
	public List<User> listAll() throws Exception{
		return service.list();
	}
	
	@PostMapping
	public User save(@RequestBody User u) throws Exception {
		service.save(u);
		return service.findByName(u);
	}
	
	@PutMapping
	public User update(@RequestBody User u) throws Exception{
		service.update(u);
		return service.findById(u.getIdUser());
	}
	
	@DeleteMapping("{id}")
	public boolean delete(@PathVariable("id") Integer id) throws Exception {
		if (service.findById(id) == null) {
			throw new UserNotFoundException("ID NO ENCONTRADO " + id);
		}
		return service.delete(id);
		
	}
}
