/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.femass.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import org.femass.model.Animal;
import org.femass.model.Cliente;

/**
 *
 * @author leome
 */
public class AnimalDao {
    
    private Cliente cliente;
    
    public Connection getConexao() throws SQLException{
        String dataBase = "dbPetShop";
        String ip = "localhost";
        String usuario = "postgres";
        String senha = "1234";
        String url = "jdbc:postgresql://"+ip+":5432/"+dataBase;
        Connection com = DriverManager.getConnection(url,usuario,senha);
        return com;
        
        
    }
    
    public void gravar(Animal animal) throws SQLException{
        String sql = "Insert into animal(id_cliente,nome_animal,animal,raca)values(?,?,?,?)";
        PreparedStatement ps = getConexao().prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
        ps.setInt(1,animal.getDono().getIdCliente());
        ps.setString(2,animal.getNome_animal());
        ps.setString(3,animal.getAnimal());
        ps.setString(4,animal.getRaca());
        ps.executeUpdate();
        ResultSet chaves = ps.getGeneratedKeys();
        chaves.next();
        animal.setIdAnimal(chaves.getInt(1));
    }
    
    public void excluir(Animal animal) throws SQLException{
        String sql = "delete from animal where id_animal = ?";
        PreparedStatement ps = getConexao().prepareStatement(sql);
        ps.setInt(1, animal.getIdAnimal());
        ps.executeUpdate();
        
    }
    
     public void alterar(Animal animal) throws SQLException{
        String sql = "update animal set nome_animal = ?,animal = ?,raca = ? where id_animal = ? ";
        PreparedStatement ps = getConexao().prepareStatement(sql);
        
        ps.setString(1,animal.getNome_animal());
        ps.setString(2,animal.getAnimal());
        ps.setString(3,animal.getRaca());
        
        ps.setInt(4, animal.getIdAnimal());
        
        ps.executeUpdate();
        
    }
    
    
    public List<Animal> getAnimais(Cliente cliente) throws SQLException{
        String sql  ="Select * from animal where id_cliente = ? ";
        PreparedStatement ps = getConexao().prepareStatement(sql);
        ps.setInt(1, cliente.getIdCliente());
        
        ResultSet rs = ps.executeQuery();
        List<Animal> animais = new ArrayList();
        
        while(rs.next()){
            Animal animal = new Animal();
            animal.setIdAnimal(rs.getInt("id_animal"));
            
            animal.setDono(new Cliente());
            animal.getDono().setIdCliente(rs.getInt("id_cliente"));// CHAMAR DAO DO CLIENTE E PREENCHER O CLIENTE
            
            animal.setNome_animal(rs.getString("nome_animal"));
            animal.setAnimal(rs.getString("animal"));
            animal.setRaca(rs.getString("raca"));
            animais.add(animal);
        } 
        return animais;
    }
  
   
}

