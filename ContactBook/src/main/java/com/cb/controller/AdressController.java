package com.cb.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.cb.input.AdressDtoInput;
import com.cb.output.AdressDtoOutput;
import com.cb.service.AdressService;

@RestController
@RequestMapping("/adress")
public class AdressController {

	@Autowired
	private AdressService adressService;
	
	@GetMapping(produces = "application/json")
	public List<AdressDtoOutput> get() {
		return this.adressService.getAll();
	}
	
	@GetMapping(path = "/{id}", produces = "application/json")
	public AdressDtoOutput get(@PathVariable Long id) {
		return this.adressService.get(id);
	}
	
	@PostMapping(consumes = "application/json", produces = "application/json")
	@ResponseStatus(HttpStatus.CREATED)
	public AdressDtoOutput post(@RequestBody AdressDtoInput adressDtoInput) {
		return this.adressService.create(adressDtoInput);
	}
	
	@PutMapping(path = "/{id}", consumes = "application/json", produces = "application/json")
		public AdressDtoOutput put(@Valid @RequestBody AdressDtoInput adressDtoInput, @PathVariable Long id ) {
			return this.adressService.update(adressDtoInput, id);
		}

	
	@DeleteMapping(path = "/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		this.adressService.delete(id);
	}
	
}
