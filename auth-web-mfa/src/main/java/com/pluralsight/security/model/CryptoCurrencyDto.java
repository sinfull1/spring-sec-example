package com.pluralsight.security.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@RequiredArgsConstructor
@Getter
@ToString
@EqualsAndHashCode
public class CryptoCurrencyDto {

	public CryptoCurrencyDto(String name, String symbol) {
		this.name = name;
		this.symbol = symbol;
	}
	private  String symbol;
	private String name;
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
	
}
