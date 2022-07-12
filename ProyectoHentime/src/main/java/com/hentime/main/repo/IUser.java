package com.hentime.main.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.hentime.main.model.User;

public interface IUser extends JpaRepository<User, Integer>{
	
	    @Query(value = "Select * FROM user WHERE user_name = :user_name ",nativeQuery=true)
	 	User findByName(@Param("user_name")String user_name);
	
}
