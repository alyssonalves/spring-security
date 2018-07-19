package br.com.spring.security.springsecurity.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.spring.security.springsecurity.model.Role;

public interface RoleRepository extends JpaRepository<Role, Integer> {

	Role findByRole(String role);
}
