package com.again.jwt2.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.again.jwt2.models.Role;

public interface RoleRepository extends JpaRepository<Role, Integer> {
	
	Optional<Role> findByName(String name);

}
