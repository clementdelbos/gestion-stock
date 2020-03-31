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

@NoArgsConstructor
@Getter
@Setter
@Entity
public class Fournisseur implements Serializable{

	@Id
	@GeneratedValue
	private Long idFournisseur;
	
	private String nom;
	
	private String prenom;
	
	private String adresse;
	
	private String photo;
	
	private String mail;
	
	@OneToMany(mappedBy = "fournisseur")
	private List<CommandeFournisseur> commandeFournisseurs;
	
}
