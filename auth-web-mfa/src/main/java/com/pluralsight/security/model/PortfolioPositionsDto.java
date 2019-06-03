package com.pluralsight.security.model;

import java.util.List;
import java.util.Map;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public class PortfolioPositionsDto {

	private String firstName;
	private  String lastname;
	private  List<PositionDto> positions;


	public PortfolioPositionsDto(String firstName, String lastname, List<PositionDto> positions,
			Map<String, String> cryptoCurrencies) {
		super();
		this.firstName = firstName;
		this.lastname = lastname;
		this.positions = positions;
		this.cryptoCurrencies = cryptoCurrencies;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public List<PositionDto> getPositions() {
		return positions;
	}

	public void setPositions(List<PositionDto> positions) {
		this.positions = positions;
	}

	public Map<String, String> getCryptoCurrencies() {
		return cryptoCurrencies;
	}

	public void setCryptoCurrencies(Map<String, String> cryptoCurrencies) {
		this.cryptoCurrencies = cryptoCurrencies;
	}

	private  Map<String, String> cryptoCurrencies;
	
	public PositionDto getPositionForCrypto(CryptoCurrencyDto crypto) {
		PositionDto position = null;
		for(PositionDto pos : positions) {
			if(pos.getCryptoCurrency().equals(crypto)) {
				position = pos;
				break;
			}
		}
		return position;
	}
	
}
