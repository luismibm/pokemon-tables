package com.luismibm.pokemon_tables.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity @Table(name = "generations")
public class Generation {

    @Id
    private long generationNum;
    String generationName;
    String generationMap;

    public Generation() { }

    public Generation(long num, String name, String map) {
        this.generationNum = num;
        this.generationName = name;
        this.generationMap = map;
    }

    public long getGenerationNum() {
        return generationNum;
    }

    public void setGenerationNum(Long generationNum) {
        this.generationNum = generationNum;
    }

    public String getGenerationName() {
        return generationName;
    }

    public void setGenerationName(String generationName) {
        this.generationName = generationName;
    }

    public String getGenerationMap() {
        return generationMap;
    }

    public void setGenerationMap(String generationMap) {
        this.generationMap = generationMap;
    }

}