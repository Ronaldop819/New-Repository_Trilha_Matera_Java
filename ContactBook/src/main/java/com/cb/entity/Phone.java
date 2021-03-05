package com.cb.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(of = {"id"})
@Entity
public class Phone {
	
	@Id
	@GeneratedValue(strategy = GeneationType.IDENTITY)
	private Long id;
	private String type;
	
	@Column(nullable = false, length = 3)
	private String ddd;
	
	@Column(nullable = false)
	private String number;
	
}
