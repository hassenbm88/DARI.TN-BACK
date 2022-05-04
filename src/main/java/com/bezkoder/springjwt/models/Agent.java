package com.bezkoder.springjwt.models;


import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;


@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor

public class Agent implements Serializable {
    public Long getIdAgent() {
        return idAgent;
    }

    public String getName() {
        return Name;
    }

    public String getLastName() {
        return LastName;
    }


    public void setIdAgent(Long idAgent) {
        this.idAgent = idAgent;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }


    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)

    Long idAgent;
    String Name;
    String LastName;


}
