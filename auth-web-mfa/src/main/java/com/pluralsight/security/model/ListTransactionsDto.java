package com.pluralsight.security.model;

import java.util.Collection;
import java.util.List;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public class ListTransactionsDto {

	public ListTransactionsDto(String username, List<TransactionDetailsDto> transactions) {
		super();
		this.username = username;
		this.transactions = transactions;
	}

	private String username;
	private List<TransactionDetailsDto> transactions;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public List<TransactionDetailsDto> getTransactions() {
		return transactions;
	}

	public void setTransactions(List<TransactionDetailsDto> transactions) {
		this.transactions = transactions;
	}

}
