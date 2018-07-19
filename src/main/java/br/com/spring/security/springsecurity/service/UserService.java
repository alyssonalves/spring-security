package br.com.spring.security.springsecurity.service;

import br.com.spring.security.springsecurity.model.User;

public interface UserService {

	public User findUserByEmail(String email);
	public void saveUser(User user);
}
