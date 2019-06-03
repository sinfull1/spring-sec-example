package com.pluralsight.security.repository;

import org.springframework.stereotype.Repository;

import com.pluralsight.security.entity.CryptoUser;

@Repository
public class UserRepository {

	public CryptoUser findByUsername(String username) {
		return new  CryptoUser("sss", "sss", "sss", "w@.com","sss","1234", false);
	}
	public CryptoUser findByEmail(String email) {
		return null;
	}
	public void save(CryptoUser cryptUser)
	{
	
	}
}
