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

import com.cb.input.ContactDtoInput;
import com.cb.output.ContactDtoOutput;
import com.cb.service.ContactService;

@RestController
@RequestMapping("/contato")
public class ContactController {

	@Autowired
	private ContactService contactService;
	
	@GetMapping(produces = "application/json")
	public List<ContactDtoOutput> get() {
		return this.contactService.getAll();
	}
	
	@GetMapping(path = "/{id}", produces = "application/json")
	public ContactDtoOutput get(@PathVariable Long id) {
		return this.contactService.get(id);
	}
	
	@PostMapping(consumes = "application/json", produces = "application/json")
	@ResponseStatus(HttpStatus.CREATED)
	public ContactDtoOutput post(@RequestBody ContactDtoInput contactDtoInput) {
		return this.contactService.create(contactDtoInput);
	}
	
	@PutMapping(path = "/{id}", consumes = "application/json", produces = "application/json")
		public ContactDtoOutput put(@Valid @RequestBody ContactDtoInput contactDtoInput, @PathVariable Long id) {
			return this.contactService.update(contactDtoInput, id);
		}

		@DeleteMapping(path = "/{id}")
		@ResponseStatus(HttpStatus.NO_CONTENT)
		public void delete(@PathVariable Long id) {
			this.contactService.delete(id);
		}
}
	

