package com.cb.output;

import com.cb.entity.Adress;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class AdressDtoOutput {

	public AdressDtoOutput(Adress adress) {
		this.setStreet(adress.getStreet());
		this.setNumber(adress.getNumber());
		this.setComplement(adress.getComplement());
		this.setCity(adress.getCity());
		this.setState(adress.getState());
		this.setZipCode(adress.getZipCode());
		this.setId(adress.getId());
	}
	
	private Long id;
	private String street;
	private String number;
	private String complement;
	private String city;
	private String state;
	private String zipCode;
}
