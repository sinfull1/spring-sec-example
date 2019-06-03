package com.pluralsight.security.entity;

import javax.validation.constraints.Email;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Document
@RequiredArgsConstructor
@Getter
@ToString
public class CryptoUser {
	
	@Id
	private String id;
	@NonNull
	@Indexed(unique=true)
	private  String username;
	@NonNull
	private String firstName;
	@NonNull
	private String lastName;
	@Email
	@NonNull
	private String email;
	public CryptoUser(String username, String firstName, String lastName, @Email String email, String password,
			String securityPin, boolean totpEnabled) {
		super();
		this.username = username;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.verified = verified;
		this.securityPin = securityPin;
		this.totpEnabled = totpEnabled;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getSecurityPin() {
		return securityPin;
	}
	public void setSecurityPin(String securityPin) {
		this.securityPin = securityPin;
	}
	public boolean isTotpEnabled() {
		return totpEnabled;
	}
	public void setTotpEnabled(boolean totpEnabled) {
		this.totpEnabled = totpEnabled;
	}
	public boolean isVerified() {
		return verified;
	}
	@NonNull
	private String password;
	@Setter
	private boolean verified;
	@NonNull
	private String securityPin;
	@NonNull
	@Setter
	private boolean totpEnabled;
	
	public void setVerified(boolean disableEmailVerification) {
		this.verified= disableEmailVerification;
		
	}
	
}
