package com.cb.output;

import com.cb.entity.Contact;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ContactDtoOutput {
	
	public ContactDtoOutput(Contact contact) {
		this.setId(contact.getId());
		this.setName(contact.getName());

		PhoneDtoOutput phoneDtoOutput = new PhoneDtoOutput(contact.getPhone());
		AdressDtoOutput adressDtoOutput = new AdressDtoOutput(contact.getAdress());

		this.setPhone(phoneDtoOutput);
		this.setAdress(adressDtoOutput);
	}
	
	private Long id;
	private String name;
	private AdressDtoOutput adress;
	private PhoneDtoOutput phone;
	
}
