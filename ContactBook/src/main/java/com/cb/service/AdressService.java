package com.cb.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cb.entity.Adress;
import com.cb.input.AdressDtoInput;
import com.cb.output.AdressDtoOutput;
import com.cb.repository.AdressRepository;

@Service
public class AdressService {

	@Autowired
	private AdressRepository adressRepository;

	
	public AdressDtoOutput create(AdressDtoInput adressDtoInput) {
		Adress adress = new Adress(adressDtoInput);
		this.adressRepository.save(adress);
		return new AdressDtoOutput(adress);
	}
	
	public AdressDtoOutput update(AdressDtoInput adressDtoInput, long id) {
		Optional<Adress> adressOptional = this.adressRepository.findById(id);
		Adress adress = adressOptional.get();
		
		adress.fillAdressFromDto(adressDtoInput);
		
		this.adressRepository.save(adress);
		return new AdressDtoOutput(adress);
	}
	
	public List<AdressDtoOutput> getAll(){
		return this.adressRepository.findAll().stream().map(AdressDtoOutput::new).collect(Collectors.toList());
	}
	
	public AdressDtoOutput get(Long id) {
		Optional<Adress> adressOptional = this.adressRepository.findById(id);
		Adress adress = adressOptional.get();
		return new AdressDtoOutput(adress);
	}
	
	public void delete(Long id) {
		this.adressRepository.deleteById(id);
	}
	
}
