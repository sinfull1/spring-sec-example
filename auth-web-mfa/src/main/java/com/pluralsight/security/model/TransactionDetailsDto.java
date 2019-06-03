package com.pluralsight.security.model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public class TransactionDetailsDto {

	private  String id;
	private  String symbol;
	private  String type;
	private  String quantity;
	private  String price;
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
	public String getType() {
		return type;
	}
	public TransactionDetailsDto(String id, String symbol, String type, String quantity, String price) {
		super();
		this.id = id;
		this.symbol = symbol;
		this.type = type;
		this.quantity = quantity;
		this.price = price;
	}
	public void setType(String type) {
		this.type = type;
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
	
	
	
}
