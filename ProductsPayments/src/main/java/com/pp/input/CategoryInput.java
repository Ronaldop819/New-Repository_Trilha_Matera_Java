package com.pp.input;

import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class CategoryInput {

	@Size(min=3, max=255, message="Name must be between 3 and 255 characters ")
	private String name;
	
	private String code;
	
}
