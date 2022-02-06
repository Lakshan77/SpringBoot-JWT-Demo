package com.lakshan.jwt.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.lakshan.jwt.api.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {

	User findByUserName(String username);

}
