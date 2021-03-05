package com.cb.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cb.converter.AdressConverter;
import com.cb.entity.Adress;
import com.cb.input.AdressDtoInput;
import com.cb.output.AdressDtoOutput;
import com.cb.repository.AdressRepository;

@Service
public class AdressService {

	@Autowired
	private AdressRepository adressRepository;
	
	@Autowired
	private AdressConverter adressConverter;
	
	
	public AdressDtoOutput create(AdressDtoInput adressDtoInput) {
		Adress adress = adressConverter.dtoToModel(adressDtoInput);
		this.adressRepository.save(adress);
		return this.adressConverter.modelToDto(adress);
	}
	
	public AdressDtoOutput update(AdressDtoInput adressDtoInput, long id) {
		Optional<Adress> adressOptional = this.adressRepository.findById(id);
		Adress adress = adressOptional.get();
		
		this.adressConverter.dtoToModel(adressDtoInput, adress);
		this.adressRepository.save(adress);
		return this.adressConverter.modelToDto(adress);
	}
	
	public List<AdressDtoOutput> getAll(){
		return this.adressConverter.modelToDto(this.adressRepository.findAll());
	}
	
	public AdressDtoOutput get(Long id) {
		Optional<Adress> adressOptional = this.adressRepository.findById(id);
		Adress adress = adressOptional.get();
		return this.adressConverter.modelToDto(adress);
	}
	
	public void delete(Long id) {
		this.adressRepository.deleteById(id);
	}
	
}
