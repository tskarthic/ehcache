package com.tsk.ehcache.example.cache;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

import com.tsk.ehcache.example.model.Users;
import com.tsk.ehcache.example.repository.UsersRepository;

@Component
public class UsersCache {
	
	@Autowired
	UsersRepository userRepository;

	@Cacheable(value = "usersCache", key = "#name")
	public Users getUser(String name) {
		System.out.println("Retriving from database for name: " + name);
		return userRepository.findByName(name);
	}

}
