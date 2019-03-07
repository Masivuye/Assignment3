package com.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Hotel {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)

    private long id;
    private String name;
    private int classification;
    private boolean isopen;

    protected Hotel(){}

    public Hotel(String name,int classification,boolean isOpen){
        this.name = name;
        this.classification = classification;
        this.isopen = isOpen;

    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getClassification() {
        return classification;
    }

    public boolean isIsopen() {
        return isopen;
    }
}
