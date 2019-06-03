package com.pluralsight.security.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Document
@RequiredArgsConstructor
@Getter
public class TOTPDetails {
	public TOTPDetails(String username2, String secret2) {
		this.username=username2;
		this.secret = secret2;
	}
	@Id String id;
	@Indexed(unique=true)
	private  String username;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getSecret() {
		return secret;
	}
	public void setSecret(String secret) {
		this.secret = secret;
	}
	private String secret;
	
}
