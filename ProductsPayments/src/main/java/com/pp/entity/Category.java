package com.pp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.pp.input.CategoryInput;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode(of = { "id" })
@NoArgsConstructor
@Entity
public class Category {
	
	public Category(CategoryInput categoryInput) {
		fillCategoryFromDto(categoryInput);
	}

	public void fillCategoryFromDto(CategoryInput categoryInput) {
		this.setName(categoryInput.getName());
		this.setCode(categoryInput.getCode());
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String id;
	
	@Column(nullable = false)
	private String name;
	
	private String code;
	
}
