package com.cb.input;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class AdressDtoInput {

	@Size(max=255, message="Street cannot be longer than 255")
	@NotBlank
	private String street;
	
	@Size(max=255, message="Number cannot be longer than 255")
	@NotBlank
	private String number;
	
	@Size(max=255, message="Complement cannot be longer than 255")
	@NotBlank
	private String complement;
	
	@Size(max=255, message="City cannot be longer than 255")
	@NotBlank
	private String city;
	
	@Size(max=2, message="Street cannot be longer than 255")
	@NotBlank
	private String state;
	
	@Size(max=9, message="Street cannot be longer than 255")
	@NotBlank
	private String zipCode;
	
	
}
