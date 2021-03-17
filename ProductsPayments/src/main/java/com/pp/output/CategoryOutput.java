package com.pp.output;

import com.pp.entity.Category;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class CategoryOutput {
	
	public CategoryOutput(Category category) {
		this.setId(category.getId());
		this.setName(category.getName());
		this.setCode(category.getCode());
	}

	private String id;
	
	private String name;
	
	String code;
	
}
