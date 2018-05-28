package com.tsk.ehcache.example.loader;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.tsk.ehcache.example.model.Users;
import com.tsk.ehcache.example.repository.UsersRepository;

@Component
public class Loader {
	
	@Autowired
	UsersRepository usersRepository;

	@PostConstruct
	public void load() {
		List<Users> usersList = getList();
		usersRepository.saveAll(usersList);
		
	}
	
	public List<Users> getList(){
		List<Users> usersList = new ArrayList<>();
		usersList.add(new Users("Ajay", "Tech", 123L));
		usersList.add(new Users("Jaga", "Tech", 125L));
		return usersList;
	}
}
