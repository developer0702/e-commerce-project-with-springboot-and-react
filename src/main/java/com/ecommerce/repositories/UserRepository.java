package com.ecommerce.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
        public User findByEmail(String email);
}
