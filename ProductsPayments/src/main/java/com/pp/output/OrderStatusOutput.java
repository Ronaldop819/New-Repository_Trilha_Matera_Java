package com.pp.output;

import com.pp.entity.OrderStatus;
import com.pp.entity.Payment_Status;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class OrderStatusOutput {
	
	public OrderStatusOutput(OrderStatus orderStatus) {
		this.setId(orderStatus.getId());
		this.setName(orderStatus.getName());
		this.setCode(orderStatus.getCode());
		this.setPayment_status(orderStatus.getPayment_status());
	}

	private String id;
	
	private String name;
	
	private String code;
	
	private Payment_Status payment_status;
	
}
