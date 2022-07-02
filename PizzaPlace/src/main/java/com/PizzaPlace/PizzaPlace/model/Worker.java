package com.PizzaPlace.PizzaPlace.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

@Entity
@Data
public class Worker {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @NotBlank(message = "Name must be filled")
    private String name;
    @NotBlank(message = "address must be filled")
    private String address;
    @NotBlank(message = "branch must be filled")
    private String branch;
    private String photoUrl;
    public Worker(){}


}
