package com.hentime.main.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.hentime.main.model.User;
import com.hentime.main.repo.IUser;

@Service
public class UserService extends CRUD<User, Integer>{

	@Autowired
	private IUser repo;

	@Override
	protected JpaRepository<User, Integer> getRepo() {
		return repo;
	}
	
	public User findByName(User u) {
		return repo.findByName(u.getUserName());
	}

}
