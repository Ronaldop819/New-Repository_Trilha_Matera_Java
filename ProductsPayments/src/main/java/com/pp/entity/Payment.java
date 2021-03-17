package com.pp.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
public class Payment {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String id;
	
	private PaymentType type;
	
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Payment_Status paymentStatus;
	
	private String paymentProcessdAdress;
	
}
