package com.cb.converter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.cb.entity.Adress;
import com.cb.input.AdressDtoInput;
import com.cb.output.AdressDtoOutput;

@Service
public class AdressConverter {

	public Adress dtoToModel(AdressDtoInput adressDtoInput) {
		Adress adress = new Adress();
		return this.dtoToModel(adressDtoInput, adress);
	}
	
	public Adress dtoToModel(AdressDtoInput adressDtoInput, Adress adress) {
		adress.setStreet(adressDtoInput.getStreet());
		adress.setNumber(adressDtoInput.getNumber());
		adress.setComplement(adressDtoInput.getComplement());
		adress.setCity(adressDtoInput.getCity());
		adress.setState(adressDtoInput.getState());
		adress.setZipCode(adressDtoInput.getZipCode());
		
		return adress;
	}
	
	public AdressDtoOutput modelToDto(Adress adress) {
		AdressDtoOutput adressDtoOutput = new AdressDtoOutput();
		adressDtoOutput.setStreet(adress.getStreet());
		adressDtoOutput.setNumber(adress.getNumber());
		adressDtoOutput.setComplement(adress.getComplement());
		adressDtoOutput.setCity(adress.getCity());
		adressDtoOutput.setState(adress.getState());
		adressDtoOutput.setZipCode(adress.getZipCode());
		adressDtoOutput.setId(adress.getId());
		
		return adressDtoOutput;
	}
	
	public List<AdressDtoOutput> modelToDto(List<Adress> adresses) {
		List<AdressDtoOutput> adressesDtos = new ArrayList<AdressDtoOutput>();
		for (Adress adress : adresses) {
			adressesDtos.add(this.modelToDto(adress));
		}
		return adressesDtos;
	}
	
}
