package com.bezkoder.springjwt.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity



public class offretype implements Serializable {
	private static final long serialVersionUID = 1L;	

		@Id

		@GeneratedValue(strategy =
		GenerationType.AUTO)
		private int id;
		
		
		@Enumerated(EnumType.STRING)
		private Offre type;
		
}

