package com.bezkoder.springjwt.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;


@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
public class Reglement implements Serializable {


    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)

    Long idReglemet;
    String frais ;
    String LastName;



}
