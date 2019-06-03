package com.pluralsight.security.entity;

import java.math.BigDecimal;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter
@EqualsAndHashCode
@ToString
public class Transaction {

	@Id
	private String id;
	@DBRef
	private  CryptoCurrency cryptoCurrency;
	private  Type type;
	private  BigDecimal quantity;
	private  BigDecimal price;
	private  long timestamp;
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public CryptoCurrency getCryptoCurrency() {
		return cryptoCurrency;
	}

	public void setCryptoCurrency(CryptoCurrency cryptoCurrency) {
		this.cryptoCurrency = cryptoCurrency;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public BigDecimal getQuantity() {
		return quantity;
	}

	public void setQuantity(BigDecimal quantity) {
		this.quantity = quantity;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public long getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(long timestamp) {
		this.timestamp = timestamp;
	}

	public Transaction(CryptoCurrency cryptoCurrency, Type type, BigDecimal quantity, BigDecimal price, long timestamp) {
		this.cryptoCurrency=cryptoCurrency;
		this.type=type;
		this.quantity=quantity;
		this.price=price;
		this.timestamp=timestamp;
		this.id = new ObjectId().toHexString();
	}
	
}
