package com.cb.converter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cb.entity.Adress;
import com.cb.entity.Contact;
import com.cb.entity.Phone;
import com.cb.input.ContactDtoInput;
import com.cb.output.AdressDtoOutput;
import com.cb.output.ContactDtoOutput;
import com.cb.output.PhoneDtoOutput;
import com.cb.repository.AdressRepository;
import com.cb.repository.PhoneRepository;

@Service
public class ContactConverter {

	@Autowired
	private AdressConverter adressConverter;
	
	@Autowired
	private PhoneConverter phoneConverter;
	
	@Autowired
	private PhoneRepository phoneRepository;
	
	@Autowired
	private AdressRepository adressRepository;
	
	public Contact dtoToModel(ContactDtoInput contactDtoInput) {
		Contact contact = new Contact();
		return this.dtoToModel(contactDtoInput, contact);
	}
	
	public Contact dtoToModel(ContactDtoInput contactDtoInput, Contact contact) {
		contact.setName(contactDtoInput.getName());
		Phone phone = phoneRepository.findById(contactDtoInput.getIdPhone()).get();
		Adress adress = adressRepository.findById(contactDtoInput.getIdAdress()).get();
		contact.setPhone(phone);
		contact.setAdress(adress);
		return contact;
	}
	
	public ContactDtoOutput modelToDto(Contact contact) {
		ContactDtoOutput contactDtoOutput = new ContactDtoOutput();
		contactDtoOutput.setId(contact.getId());
		contactDtoOutput.setName(contact.getName());

		Phone phone = contact.getPhone();
		Adress adress = contact.getAdress();

		PhoneDtoOutput phoneDtoOutput = this.phoneConverter.modelToDto(phone);
		AdressDtoOutput adressDtoOutput = this.adressConverter.modelToDto(adress);

		contactDtoOutput.setPhone(phoneDtoOutput);
		contactDtoOutput.setAdress(adressDtoOutput);

		return contactDtoOutput;
	}

	public List<ContactDtoOutput> modelToDto(List<Contact> contacts) {
		List<ContactDtoOutput> contactsDtos = new ArrayList<ContactDtoOutput>();
		for (Contact contact : contacts) {
			contactsDtos.add(this.modelToDto(contact));
		}
		return contactsDtos;
	}
	
}
