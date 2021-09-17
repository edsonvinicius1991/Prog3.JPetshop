/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.femass.model;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;

/**
 *
 * @author leome
 */
public class Cliente {
    private Integer idCliente;
    private String cpfCliente;
    private String nomeCliente;
    private String telefone;
    private String email;
    private TipoContato tipoContato;
    private String cep;
    private String logradouro;
    private String bairro;
    private String cidade;
    private String tipoUf;
    private List<Animal> animais;
    
    public void adicionarAnimal(Animal animal){
        if(this.animais==null){
            this.animais=new ArrayList();
        }
        this.animais.add(animal);
    }
    
    public List<Animal> getAnimais(){
        return this.animais;
    }

    public void setAnimais(List<Animal> lista) {
        this.animais = lista;
    }
    
    public Integer getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
    }

    public String getCpfCliente() {
        return cpfCliente;
    }

    public void setCpfCliente(String cpfCliente) {
        
        this.cpfCliente = cpfCliente;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public TipoContato getTipoContato() {
        return tipoContato;
    }

    public void setTipoContato(TipoContato tipoContato) {
        this.tipoContato = tipoContato;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getTipoUf() {
        return tipoUf;
    }

    public void setTipoUf(String tipoUf) {
        this.tipoUf = tipoUf;
    }

    @Override
    public String toString() {
        return idCliente + " - " + nomeCliente;
    }
    
    
}
