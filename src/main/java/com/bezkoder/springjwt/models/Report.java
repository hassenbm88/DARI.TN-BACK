package com.bezkoder.springjwt.models;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Entity
@Getter
@Setter
@ToString 
@NoArgsConstructor
public class Report implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	Long id;
	String Description;
	boolean confirmation=false ;
	@ManyToOne(cascade = CascadeType.ALL)
	private User user;
	
	
	@Enumerated(EnumType.STRING)
    @Column(name = "reason")
    private Reason reason;
	

}
