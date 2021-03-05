package com.cb.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cb.converter.PhoneConverter;
import com.cb.entity.Phone;
import com.cb.input.PhoneDtoInput;
import com.cb.output.PhoneDtoOutput;
import com.cb.repository.PhoneRepository;


@Service
public class PhoneService {

	@Autowired
	private PhoneRepository phoneRepository;

	@Autowired
	private PhoneConverter phoneConverter;

	public PhoneDtoOutput create(PhoneDtoInput phoneDtoInput) {
		Phone phone = phoneConverter.dtoToModel(phoneDtoInput);
		this.phoneRepository.save(phone);
		return this.phoneConverter.modelToDto(phone);
	}

	public PhoneDtoOutput update(PhoneDtoInput phoneDtoInput, Long id) {
		Optional<Phone> phoneOptional = this.phoneRepository.findById(id);
		Phone phone = phoneOptional.get();

		this.phoneConverter.dtoToModel(phoneDtoInput, phone);
		this.phoneRepository.save(phone);
		return this.phoneConverter.modelToDto(phone);

	}

	public List<PhoneDtoOutput> getAll() {

		/*
		 * return this.telefoneRepository.findAll() .stream() .map(
		 * this.telefoneConverter::modelToDto ) .collect(Collectors.toList());
		 */

		return this.phoneConverter.modelToDto(this.phoneRepository.findAll());
	}

	public PhoneDtoOutput get(Long id) {
		Optional<Phone> phoneOptional = this.phoneRepository.findById(id);
		Phone phone = phoneOptional.get();
		return this.phoneConverter.modelToDto(phone);
	}

	public void delete(Long id) {
		this.phoneRepository.deleteById(id);
	}

}
