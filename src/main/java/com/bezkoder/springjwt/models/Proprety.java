package com.bezkoder.springjwt.models;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;




@Entity
@Getter
@Setter
@ToString 
@NoArgsConstructor
@AllArgsConstructor 
public class Proprety implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	 Long idProprety;
	 String Nom ;
	 float Surface ;
	 String Adresse;
	 String Region;
	 String Image;
	 long Prix;
	 @Enumerated(EnumType.STRING)
	 private PropertyType type;
	 @Enumerated(EnumType.STRING)
	 private Offre  Offretype;
	@JsonIgnore
	@OneToMany(mappedBy="properties", cascade = CascadeType.ALL)
	private Set<Visite>visites ;
	@JsonIgnore
	@ManyToOne(cascade = CascadeType.ALL)
	private User user;
	
	
	/*@ManyToMany(cascade = CascadeType.PERSIST, fetch
			= FetchType.EAGER)
			private Set<PropertyType> types;*/
}