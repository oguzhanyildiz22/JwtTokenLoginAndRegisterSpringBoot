package com.again.jwt2.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.again.jwt2.models.UserEntitiy;

public interface UserRepository extends JpaRepository<UserEntitiy, Integer> {

	Optional<UserEntitiy> findByUsername(String username);
	
	boolean existsByUsername(String username);
}
