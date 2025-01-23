package com.luismibm.pokemon_tables.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity @Table(name = "starters")
public class Starter {

    @Id
    private long starterNum;
    String starterName;
    String starterType;

    public Starter() { }

    public Starter(long num, String name, String type) {
        this.starterNum = num;
        this.starterName = name;
        this.starterType = type;
    }

    public long getStarterNum() {
        return starterNum;
    }

    public void setStarterNum(long starterNum) {
        this.starterNum = starterNum;
    }

    public String getStarterName() {
        return starterName;
    }

    public void setStarterName(String starterName) {
        this.starterName = starterName;
    }

    public String getStarterType() {
        return starterType;
    }

    public void setStarterType(String starterType) {
        this.starterType = starterType;
    }

}