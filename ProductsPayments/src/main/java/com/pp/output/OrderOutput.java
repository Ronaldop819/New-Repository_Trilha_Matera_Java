package com.pp.output;

import java.util.ArrayList;
import java.util.Date;

import com.pp.entity.Client;
import com.pp.entity.Order;
import com.pp.entity.OrderStatus;
import com.pp.entity.Payment;
import com.pp.entity.Product;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@ToString
@NoArgsConstructor
public class OrderOutput {
	
	public OrderOutput(Order order) {
	
		this.setId(order.getId());
		this.setProduct(order.getProduct());
		this.setClient(order.getClient());
		this.setOrderStatus(order.getOrderStatus());
		this.setPayment(order.getPayment());
		this.setDate(order.getDate());
		this.setOrderStatus(order.getOrderStatus());
		
	}

	private String id;
	
	private ArrayList<Product> product;
	
	private Client client;
	
	private OrderStatus orderStatus;
	
	private Payment payment;
	
	private Date date;
	
	private String code;
	
}
