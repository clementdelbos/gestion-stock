package com.udemy.javaee.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
@Entity
public class LigneCommandeFournisseur implements Serializable{

	@Id
	@GeneratedValue
	private Long idLigneCommandeFournisseur;
	
	@ManyToOne
	@JoinColumn(name="idArticle")
	private Article article;
	
	@ManyToOne
	@JoinColumn(name="idCommandeFournisseur")
	private CommandeFournisseur commandeFournisseur;
}
