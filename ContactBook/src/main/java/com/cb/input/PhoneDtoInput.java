package com.cb.input;

import com.sun.istack.NotNull;

import lombok.Data;

@Data
public class PhoneDtoInput {

	private String type;
	private String ddd;
	
	@NotNull(message = "Number may not be null")
	private String number;

	
}
