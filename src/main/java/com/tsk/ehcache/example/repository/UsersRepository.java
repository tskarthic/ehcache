package com.tsk.ehcache.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tsk.ehcache.example.model.Users;

public interface UsersRepository extends JpaRepository<Users, Long	>{

	Users findByName(String name);

}
