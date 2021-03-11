package com.cb.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cb.entity.Phone;
import com.cb.input.PhoneDtoInput;
import com.cb.output.PhoneDtoOutput;
import com.cb.repository.PhoneRepository;

@Service
public class PhoneService {

	@Autowired
	private PhoneRepository phoneRepository;

	public PhoneDtoOutput create(PhoneDtoInput phoneDtoInput) {
		Phone phone = new Phone(phoneDtoInput);
		this.phoneRepository.save(phone);
		return new PhoneDtoOutput(phone);
	}

	public PhoneDtoOutput update(PhoneDtoInput phoneDtoInput, Long id) {
		Optional<Phone> phoneOptional = this.phoneRepository.findById(id);
		Phone phone = phoneOptional.get();
		
		phone.fillPhoneFromDto(phoneDtoInput);
		
		this.phoneRepository.save(phone);
		return new PhoneDtoOutput(phone);

	}

	public List<PhoneDtoOutput> getAll() {
		return this.phoneRepository.findAll().stream().map(PhoneDtoOutput::new).collect(Collectors.toList());
	}

	public PhoneDtoOutput get(Long id) {
		Optional<Phone> phoneOptional = this.phoneRepository.findById(id);
		Phone phone = phoneOptional.get();
		return new PhoneDtoOutput(phone);
	}

	public void delete(Long id) {
		this.phoneRepository.deleteById(id);
	}

}
