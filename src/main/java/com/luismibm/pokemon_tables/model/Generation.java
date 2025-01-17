package com.luismibm.pokemon_tables.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity @Table(name = "generations")
public class Generation {

    @Id
    private Long generationNum;

    @Column(nullable = false)
    String generationName;

    public Generation() { }

    public Generation(Long generationNum, String generationName) {
        this.generationNum = generationNum;
        this.generationName = generationName;
    }

    public Long getGenerationNum() {
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

}