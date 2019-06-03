package com.pluralsight.security.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@RequiredArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class AddTransactionToPortfolioDto {

	public String getCryptoSymbol() {
		return cryptoSymbol;
	}
	public void setCryptoSymbol(String cryptoSymbol) {
		this.cryptoSymbol = cryptoSymbol;
	}
	public String getQuantity() {
		return quantity;
	}
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	@NonNull
	private String cryptoSymbol;
	@NonNull
	private String quantity;
	@NonNull
	private String price;
	@NonNull
	private String type;
	private String username;
	
}
