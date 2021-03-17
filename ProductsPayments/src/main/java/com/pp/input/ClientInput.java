package com.pp.input;

import java.util.ArrayList;
import java.util.List;

import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class ClientInput {

	@Size(max=255, message="Cannot be greater than 255 cannot be greater than")
	private String email;
	
	private String address;
	
	private List<String> orders = new ArrayList<>();
	
}
