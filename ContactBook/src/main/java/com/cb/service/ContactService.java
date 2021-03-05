package com.cb.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cb.converter.ContactConverter;
import com.cb.entity.Contact;
import com.cb.input.ContactDtoInput;
import com.cb.output.ContactDtoOutput;
import com.cb.repository.ContactRepository;

@Service
public class ContactService {

	@Autowired
	private ContactConverter contactConverter;

	@Autowired
	private ContactRepository contactRepository;

	public ContactDtoOutput create(ContactDtoInput contactDtoInput) {
		Contact contact = this.contactConverter.dtoToModel(contactDtoInput);
		this.contactRepository.save(contact);
		return this.contactConverter.modelToDto(contact);
	}

	public ContactDtoOutput update(ContactDtoInput contactDtoInput, Long id) {
		Contact contact = this.contactRepository.findById(id).get();
		contact.setName(contactDtoInput.getName());
		this.contactRepository.save(contact);
		return this.contactConverter.modelToDto(contact);
	}

	public List<ContactDtoOutput> getALL() {
		return this.contactConverter.modelToDto(this.contactRepository.findAll());
	}

	public ContactDtoOutput get(Long id) {
		Optional<Contact> contactOptional = this.contactRepository.findById(id);
		Contact contact = contactOptional.get();
		return this.contactConverter.modelToDto(contact);
	}

	public void delete(Long id) {
		this.contactRepository.deleteById(id);
	}

}
