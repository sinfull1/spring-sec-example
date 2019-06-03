package com.pluralsight.security.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@RequiredArgsConstructor
@Getter
@EqualsAndHashCode(exclude = { "id", "name" })
@ToString
@Document
public class CryptoCurrency {
	@Id
	private static int counter=0; 
	private String id;

	public CryptoCurrency(String id, String symbol, String name) {
		super();
		this.id = id;
		this.symbol = symbol;
		this.name = name;
	}

	private  String symbol;
	private  String name;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public CryptoCurrency(String symbol, String name) {
		this.id = String.valueOf(counter++);
		this.symbol = symbol;
		this.name = name;
	}


}
