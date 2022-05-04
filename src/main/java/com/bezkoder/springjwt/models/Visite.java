	package com.bezkoder.springjwt.models;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;




@Entity
@Getter
@Setter
@ToString 
@NoArgsConstructor
 public class Visite  implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	Long idViste;
	boolean Confirmation=true;
	//@Temporal(TemporalType.DATE)
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
	String dateVisite;
	@JsonIgnore
	@ManyToOne(cascade = CascadeType.ALL)
	private Proprety properties;	
}