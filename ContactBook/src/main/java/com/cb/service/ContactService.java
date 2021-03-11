package com.cb.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cb.entity.Adress;
import com.cb.entity.Contact;
import com.cb.entity.Phone;
import com.cb.input.ContactDtoInput;
import com.cb.output.ContactDtoOutput;
import com.cb.repository.AdressRepository;
import com.cb.repository.ContactRepository;
import com.cb.repository.PhoneRepository;

@Service
public class ContactService {

	@Autowired
	private ContactRepository contactRepository;

	@Autowired
	private PhoneRepository phoneRepository;

	@Autowired
	private AdressRepository adressRepository;
	

	public ContactDtoOutput create(ContactDtoInput contactDtoInput) {

		Phone phone = phoneRepository.findById(contactDtoInput.getIdPhone()).get();
		Adress adress = adressRepository.findById(contactDtoInput.getIdAdress()).get();

		Contact contact = new Contact(contactDtoInput, adress, phone);
		this.contactRepository.save(contact);
		return new ContactDtoOutput(contact);
	}

	public ContactDtoOutput update(ContactDtoInput contactDtoInput, Long id) {
		Contact contact = this.contactRepository.findById(id).get();
		contact.fillContactFromDto(contactDtoInput);
		this.contactRepository.save(contact);
		return new ContactDtoOutput(contact);

	}

	public List<ContactDtoOutput> getAll() {
		return this.contactRepository.findAll().stream().map(ContactDtoOutput::new).collect(Collectors.toList());
	}

	public ContactDtoOutput get(Long id) {
		Optional<Contact> contactOptional = this.contactRepository.findById(id);
		Contact contact = contactOptional.get();
		return new ContactDtoOutput(contact);
	}

	public void delete(Long id) {
		this.contactRepository.deleteById(id);
	}

}