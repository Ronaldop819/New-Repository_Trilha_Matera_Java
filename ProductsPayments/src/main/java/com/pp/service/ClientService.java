package com.pp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pp.repository.CategoryRepository;
import com.pp.repository.ClientRepository;
import com.pp.repository.OrderRepository;
import com.pp.repository.OrderStatusRepository;

@Service
public class ClientService {

	@Autowired
	private ClientRepository clientRepository;
	
	@Autowired
	private CategoryRepository categoryRepository;
	
	@Autowired
	private OrderRepository orderRepository;
	
	@Autowired
	private OrderStatusRepository orderStatusRepository;
	
	
	
	
}
