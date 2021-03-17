package com.pp.output;

import java.util.ArrayList;
import java.util.List;

import com.pp.entity.Client;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class ClientOutput {
	
	public ClientOutput(Client client) {
		this.setId(client.getId());
		this.setEmail(client.getEmail());
		this.setAddress(client.getAddress());
		this.setOrders(client.getOrders());
	}

	private String id;
	
	private String email;
	
	private String address;
	
	private List<String> orders = new ArrayList<>();
	
}
