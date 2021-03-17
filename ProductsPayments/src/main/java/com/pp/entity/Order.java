package com.pp.entity;

import java.util.ArrayList;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import com.pp.input.OrderInput;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode(of = { "id" })
@NoArgsConstructor
@Entity
public class Order {
	
	public Order(OrderInput orderInput) {
		fillOrderFromDto(orderInput);
	}

	public void fillOrderFromDto(OrderInput orderInput) {
		this.setProduct(orderInput.getProduct());
		this.setClient(orderInput.getClient());
		this.setOrderStatus(orderInput.getOrderStatus());
		this.setPayment(orderInput.getPayment());
		this.setDate(orderInput.getDate());
		this.setCode(orderInput.getCode());
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String id;
	
	private ArrayList<Product> product;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "client_id", referencedColumnName = "id")
	private Client client;
	
	@JoinColumn(name = "orderStatus_id", referencedColumnName = "id")
	private OrderStatus orderStatus;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "payment_id", referencedColumnName = "id")
	private Payment payment;
	
	@Column(name = "local_date_time", columnDefinition = "TIMESTAMP")
	private Date date;
	
	@Column(nullable = false)
	private String code;
	
	
}
