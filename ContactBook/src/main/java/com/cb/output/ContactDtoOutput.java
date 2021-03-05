package com.cb.output;

import lombok.Data;

@Data
public class ContactDtoOutput {
	
	private Long id;
	private String name;
	private AdressDtoOutput adress;
	private PhoneDtoOutput phone;
	
}
