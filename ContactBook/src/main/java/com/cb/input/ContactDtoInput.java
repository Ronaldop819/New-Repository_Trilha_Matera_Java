package com.cb.input;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class ContactDtoInput {

	@Size(min=3, max=255, message="Name must be between 3 and 255 characters ")
	private String name;
	
	@NotNull
	@Positive
	private Long idAdress;
	
	@NotNull
	@Positive
	private Long idPhone;
	
}
