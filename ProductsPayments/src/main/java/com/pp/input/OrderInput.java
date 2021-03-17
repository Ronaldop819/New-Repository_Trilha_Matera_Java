package com.pp.input;

import java.util.ArrayList;
import java.util.Date;

import com.pp.entity.Client;
import com.pp.entity.OrderStatus;
import com.pp.entity.Payment;
import com.pp.entity.Product;

import lombok.Data;

@Data
public class OrderInput {

	private ArrayList<Product> product;
	
	private Client client;
	
	private OrderStatus orderStatus;
	
	private Payment payment;
	
	private Date date;
	
	private String code;

	
	
}
