package com.pp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.pp.input.OrderStatusInput;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode(of = { "id" })
@NoArgsConstructor
@Entity
public class OrderStatus {
	
	public OrderStatus(OrderStatusInput orderStatusInput) {
		fillOrderStatusFromDto(orderStatusInput);
	}

	public void fillOrderStatusFromDto(OrderStatusInput orderStatusInput) {
		this.setName(orderStatusInput.getName());
		this.setCode(orderStatusInput.getCode());
		this.setPayment_status(orderStatusInput.getPayment_status());
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String id;
	
	@Column(nullable = false)
	private String name;
	
	@Column(nullable = false)
	private String code;
	
	@Column(nullable = false)
	@Enumerated(EnumType.STRING)
	private Payment_Status payment_status;	
}
