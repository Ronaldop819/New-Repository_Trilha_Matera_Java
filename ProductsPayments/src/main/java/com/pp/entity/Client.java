package com.pp.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.pp.input.ClientInput;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode(of = { "id" })
@NoArgsConstructor
@Entity
public class Client {
	
	public Client(ClientInput clientInput) {
		fillClientFromDto(clientInput);
	}

	public void fillClientFromDto(ClientInput clientInput) {
		this.setEmail(clientInput.getEmail());
		this.setAddress(clientInput.getAddress());
		this.setOrders(clientInput.getOrders());
	}


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String id;
	
	private String email;
	
	@Column(nullable = false)
	private String address;
	
	@ElementCollection
	private List<String> orders = new ArrayList<>();
	
	
}
