package com.cb.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(of = { "id" })
@Entity
public class Adress {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable = false)
	private String street;
	
	private String number;
	
	private String complement;
	
	@Column(nullable = false)
	private String city;
	
	@Column(nullable = false, length = 2)
	private String state;
	
	@Column(nullable = false, length = 9)
	private String zipCode;
	
}
