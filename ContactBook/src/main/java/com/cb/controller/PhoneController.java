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

import com.cb.output.PhoneDtoOutput;

@RestController
@RequestMapping("/telefone")
public class PhoneController {

	@Autowired
	private PhoneService phoneService;

	@GetMapping(produces = "application/json")
	public List<PhoneDtoOutput> get() {
		return this.phoneService.getAll();
	}

	@GetMapping(path = "/{id}", produces = "application/json")
	public PhoneDtoOutput get(@PathVariable Long id) {
		return this.phoneService.get(id);
	}

	@PostMapping(consumes = "application/json", produces = "application/json")
	@ResponseStatus(HttpStatus.CREATED)
	public PhoneDtoOutput post(@Valid @RequestBody TelefoneDtoInput telefoneDtoInput) {
		return this.phoneService.create(telefoneDtoInput);
	}

	@PutMapping(path = "/{id}", consumes = "application/json", produces = "application/json")
	public PhoneDtoOutput put(@Valid @RequestBody TelefoneDtoInput telefoneDtoInput, @PathVariable Long id) {
		return this.phoneService.update(telefoneDtoInput, id);
	}

	@DeleteMapping(path = "/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		this.phoneService.delete(id);
	}

}