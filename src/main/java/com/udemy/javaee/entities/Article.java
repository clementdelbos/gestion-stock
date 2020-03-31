package com.udemy.javaee.entities;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name="article")
public class Article implements Serializable{


	@Id
	@GeneratedValue
	@Column(name="id_article")
	private Long idArticle;
	
	private String codeArticle;
	
	private String designation;
	
	private BigDecimal prixUnitaireHt;
	
	private BigDecimal tauxTva;
	
	private BigDecimal prixUnitaireTTC;
	
	private String photo;
	
	@ManyToOne
	@JoinColumn(name="idCategory")
	private Category category;
	
	
}
