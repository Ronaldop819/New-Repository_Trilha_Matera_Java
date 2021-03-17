package com.pp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Client")
public class ClientController {

//	private ClientService clientService;
	
	@GetMapping(produces = "applicaton/json")
	public List<ClientOutput> get(){
		return this.clientService.getAll();
	}
	
}
