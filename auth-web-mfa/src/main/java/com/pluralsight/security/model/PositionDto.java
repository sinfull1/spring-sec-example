package com.pluralsight.security.model;

import java.math.BigDecimal;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
@EqualsAndHashCode
public class PositionDto {
	
	public PositionDto(CryptoCurrencyDto cryptoCurrency, BigDecimal quantity, BigDecimal value) {
		super();
		this.cryptoCurrency = cryptoCurrency;
		this.quantity = quantity;
		this.value = value;
	}
	private CryptoCurrencyDto cryptoCurrency;
	private  BigDecimal quantity;
	private  BigDecimal value;
	public CryptoCurrencyDto getCryptoCurrency() {
		return cryptoCurrency;
	}
	public void setCryptoCurrency(CryptoCurrencyDto cryptoCurrency) {
		this.cryptoCurrency = cryptoCurrency;
	}
	public BigDecimal getQuantity() {
		return quantity;
	}
	public void setQuantity(BigDecimal quantity) {
		this.quantity = quantity;
	}
	public BigDecimal getValue() {
		return value;
	}
	public void setValue(BigDecimal value) {
		this.value = value;
	}
	

}
