package com.cb.converter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.cb.entity.Phone;
import com.cb.input.PhoneDtoInput;
import com.cb.output.PhoneDtoOutput;

@Service
public class PhoneConverter {

	public Phone dtoToModel(PhoneDtoInput phoneDtoInput) {
		Phone phone = new Phone();
		return this.dtoToModel(phoneDtoInput, phone);
	}
	
	public Phone dtoToModel(PhoneDtoInput phoneDtoInput, Phone phone) {
		phone.setDdd(phoneDtoInput.getDdd());
		phone.setNumber(phone.getNumber());
		phone.setType(phone.getType());
		
		return phone;
	}
	
	public PhoneDtoOutput modelToDto(Phone phone) {
		PhoneDtoOutput phoneDtoOutput = new PhoneDtoOutput();
		phoneDtoOutput.setDdd(phone.getDdd());
		phoneDtoOutput.setId(phone.getId());
		phoneDtoOutput.setNumber(phone.getNumber());
		phoneDtoOutput.setType(phone.getType());
		
		return phoneDtoOutput;
	}
	
	public List<PhoneDtoOutput> modelToDto(List<Phone> phones){
		List<PhoneDtoOutput> phonesDtos = new ArrayList<PhoneDtoOutput>();
		for (Phone phone : phones) {
			phonesDtos.add(this.modelToDto(phone));
		}
		return phonesDtos;
	}
	
}
