package com.udemy.javaee.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
@Entity
public class Category implements Serializable{

	@Id
	@GeneratedValue
	private Long idCategory;
	
	private String code;
	
	private String designation;
	
	@OneToMany(mappedBy="category")
	private List<Article> articles;
	
}
