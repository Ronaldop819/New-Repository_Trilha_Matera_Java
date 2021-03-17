package com.pp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pp.entity.Client;
import com.pp.input.ClientInput;
import com.pp.input.OrderInput;
import com.pp.output.OrderOutput;
import com.pp.repository.ClientRepository;



@Service
public class OrderService {

	@Autowired
	private ClientRepository clientRepository;
	
	public OrderOutput create(OrderInput orderInput) {
		Client client = clientRepository.findById(ClientInput.getIdClient());
	}
	
}
