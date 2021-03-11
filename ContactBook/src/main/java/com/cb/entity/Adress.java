package com.cb.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.cb.input.AdressDtoInput;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode(of = { "id" })
@NoArgsConstructor
@Entity
public class Adress {
	
	public Adress(AdressDtoInput adressDtoInput) {
		fillAdressFromDto(adressDtoInput);	
	}
	
	public void fillAdressFromDto(AdressDtoInput adressDtoInput) {
		this.setStreet(adressDtoInput.getStreet());
		this.setNumber(adressDtoInput.getNumber());
		this.setComplement(adressDtoInput.getComplement());
		this.setCity(adressDtoInput.getCity());
		this.setState(adressDtoInput.getState());
		this.setZipCode(adressDtoInput.getZipCode());
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable = false)
	private String street;
	
	private String number;
	
	private String complement;
	
	@Column(nullable = false)
	private String city;
	
	@Column(nullable = false, length = 2)
	private String state;
	
	@Column(nullable = false, length = 9)
	private String zipCode;
	
}
