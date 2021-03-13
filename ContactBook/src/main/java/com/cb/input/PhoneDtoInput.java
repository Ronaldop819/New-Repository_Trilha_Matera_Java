package com.cb.input;


import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class PhoneDtoInput {

	private String type;

	@Size(min=2, max=2, message="DDD must contain 2 digits")
	private String ddd;

	@Size(min=8, max=9, message="Phone must contain at least 8 and at most 9")
	private String number;

	
}
