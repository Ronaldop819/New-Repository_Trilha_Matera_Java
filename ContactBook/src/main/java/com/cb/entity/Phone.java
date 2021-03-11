package com.cb.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.cb.input.PhoneDtoInput;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode(of = { "id" })
@NoArgsConstructor
@Entity
public class Phone {
	

	public Phone(PhoneDtoInput phoneDtoInput) {
		fillPhoneFromDto(phoneDtoInput);
	}

	public void fillPhoneFromDto(PhoneDtoInput phoneDtoInput) {
		this.setDdd(phoneDtoInput.getDdd());
		this.setNumber(phoneDtoInput.getNumber());
		this.setType(phoneDtoInput.getType());
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String type;
	
	@Column(nullable = false, length = 3)
	private String ddd;
	
	@Column(nullable = false)
	private String number;
	
}
