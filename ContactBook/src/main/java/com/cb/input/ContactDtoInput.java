package com.cb.input;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

import lombok.Data;

@Data
public class ContactDtoInput {

	private String name;
	
	@NotNull
	@Positive
	private Long idAdress;
	
	@NotNull
	@Positive
	private Long idPhone;
	
}
