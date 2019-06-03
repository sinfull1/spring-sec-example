package com.pluralsight.security.userdetails;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;

import lombok.Getter;
import lombok.Setter;

public class MFAUser extends User{

	public MFAUser(String username, String password, boolean enabled, boolean accountNonExpired,
			boolean credentialsNonExpired, boolean accountNonLocked,
			Collection<? extends GrantedAuthority> authorities) {
		super(username, password, enabled, accountNonExpired, credentialsNonExpired, accountNonLocked, authorities);
	}


	private String securityPin;

	public String getSecurityPin() {
		// TODO Auto-generated method stub
		 return securityPin;
	}

	public void setSecurityPin(String object) {
		this.securityPin= object;
		
	}
	
	
}
