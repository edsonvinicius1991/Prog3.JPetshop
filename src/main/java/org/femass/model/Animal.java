/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.femass.model;

/**
 *
 * @author leome
 */
public class Animal {
    private Integer idAnimal;
    private String nome_animal;
    private Cliente dono;
    private String animal;
    private String raca;

    public Integer getIdAnimal() {
        return idAnimal;
    }

    public void setIdAnimal(Integer idAnimal) {
        this.idAnimal = idAnimal;
    }

    public void setNome_animal(String nome_animal) {
        this.nome_animal = nome_animal;
    }

    public void setDono(Cliente dono) {
        this.dono = dono;
    }

    public void setAnimal(String animal) {
        this.animal = animal;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getNome_animal() {
        return nome_animal;
    }

    public Cliente getDono() {
        return dono;
    }

    public String getAnimal() {
        return animal;
    }

    public String getRaca() {
        return raca;
    }

    @Override
    public String toString() {
        return nome_animal;
    }
    
    
}
