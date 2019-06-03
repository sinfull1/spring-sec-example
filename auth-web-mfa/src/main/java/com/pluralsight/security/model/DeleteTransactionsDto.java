package com.pluralsight.security.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class DeleteTransactionsDto {

	public void setId(String[] id) {
		this.id = id;
	}

	private String[] id;

	public String[] getId() {
		// TODO Auto-generated method stub
		return id;
	}
	
}
