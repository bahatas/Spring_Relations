package com.cydeo.mentor.entity;

import lombok.*;

import javax.persistence.*;


@Data
public class Address {

    private Long id;
    private String description;
    private String zipCode;

    /*  These fields will be used in STEP-3
    private State state;

     */
}
