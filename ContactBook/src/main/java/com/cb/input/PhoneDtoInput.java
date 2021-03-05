package com.cb.input;



import javax.validation.constraints.NotNull;

import lombok.Data;

@Data
public class PhoneDtoInput {

	private String type;
	private String ddd;
	
	@NotNull(message = "Number may not be null")
	private String number;

	
}
