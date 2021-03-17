package com.pp.input;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import com.pp.entity.Payment_Status;

import lombok.Data;

@Data
public class OrderStatusInput {

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String name;
	
	private String code;
	
	private Payment_Status payment_status;
	
}
