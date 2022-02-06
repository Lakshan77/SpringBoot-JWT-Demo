package com.lakshan.jwt.api;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.lakshan.jwt.api.entity.User;
import com.lakshan.jwt.api.repository.UserRepository;

@SpringBootApplication
public class SpringJwtDemoApplication {

	@Autowired
	private UserRepository repository;

	@PostConstruct
	public void initUser() {
		List<User> users = Stream.of(

				new User(101,"Hashan","pwd1","hashan@gmal.com"),
				new User(102,"Ashan","pwd2","ashan@gmal.com"),
				new User(103,"Vinod","pwd3","vinod@gmal.com"),
				new User(104,"Achala","pwd4","achala@gmal.com")

		).collect(Collectors.toList());
		
		repository.saveAll(users);
	}
	public static void main(String[] args) {
		SpringApplication.run(SpringJwtDemoApplication.class, args);
	}



}
