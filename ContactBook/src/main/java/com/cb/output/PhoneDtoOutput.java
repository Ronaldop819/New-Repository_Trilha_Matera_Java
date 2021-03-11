package com.cb.output;

import com.cb.entity.Phone;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class PhoneDtoOutput {

	public PhoneDtoOutput(Phone phone) {
		this.setDdd(phone.getDdd());
		this.setId(phone.getId());
		this.setNumber(phone.getNumber());
		this.setType(phone.getType());
		
	}
	
	private Long id;
	private String type;
	private String ddd;
	private String number;
	
}
