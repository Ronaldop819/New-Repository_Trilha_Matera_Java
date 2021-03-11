package com.cb.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import com.cb.input.ContactDtoInput;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode(of = { "id" })
@NoArgsConstructor
@Entity
public class Contact {

	public Contact(ContactDtoInput ContactDtoInput, Adress adress, Phone phone) {
		this.fillContactFromDto(ContactDtoInput);
		this.setPhone(phone);
		this.setAdress(adress);
	}
	
	public void fillContactFromDto(ContactDtoInput contactDtoInput) {
		this.setName(contactDtoInput.getName());
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(nullable = false)
	private String name;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "adress_id", referencedColumnName = "id")
	private Adress adress;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "phone_id", referencedColumnName = "id")
	private Phone phone;

}