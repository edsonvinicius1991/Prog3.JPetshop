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
import org.femass.model.Fornecedor;
import org.femass.model.TipoCliente;
import org.femass.model.TipoUf;

/**
 *
 * @author leome
 */
public class FornecedorDao {
    public Connection getConexao() throws SQLException{
        String dataBase = "dbPetShop";
        String ip = "localhost";
        String usuario = "postgres";
        String senha = "1234";
        String url = "jdbc:postgresql://"+ip+":5432/"+dataBase;
        Connection com = DriverManager.getConnection(url,usuario,senha);
        return com;
    }
    
    public void gravar(Fornecedor fornecedor) throws SQLException{
        String sql = "Insert into fornecedor(tipo_cliente,data_cadastro,cpf_cnpj,fantasia,razao_social,nome_contato,tel_fixo,tel_celular,email,cep,logradouro,numero_logradouro,bairro,cidade,tipo_uf,complemento)values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        PreparedStatement ps = getConexao().prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
        ps.setObject(1,String.valueOf(fornecedor.getTipoCliente()));
        ps.setString(2,fornecedor.getDataCadastro());
        ps.setString(3,fornecedor.getCpfCnpj());
        ps.setString(4,fornecedor.getFantasia());
        ps.setString(5,fornecedor.getRazaoSocial());
        ps.setString(6,fornecedor.getNomeContato());
        ps.setString(7,fornecedor.getTelFixo());
        ps.setObject(8,fornecedor.getTelCelular());
        ps.setString(9,fornecedor.getEmailFornecedor());
        ps.setString(10,fornecedor.getCepFornecedor());
        ps.setString(11,fornecedor.getLogradouro());
        ps.setString(12,fornecedor.getNumeroLogradouro());
        ps.setString(13,fornecedor.getBairro());
        ps.setString(14,fornecedor.getCidade());
        ps.setString(15,String.valueOf(fornecedor.getTipoUf()));
        ps.setString(16,fornecedor.getComplemento());
        
        ps.executeUpdate();
        ResultSet chaves = ps.getGeneratedKeys();
        chaves.next();
        fornecedor.setIdFornecedor(chaves.getInt(1));
    }
    
    public void excluir(Fornecedor fornecedor) throws SQLException{
        String sql = "delete from fornecedor where id_fornecedor = ?";
        PreparedStatement ps = getConexao().prepareStatement(sql);
        ps.setInt(1, fornecedor.getIdFornecedor());
        ps.executeUpdate();
        
    }
    
     public void alterar(Fornecedor fornecedor) throws SQLException{
        String sql = "update fornecedor set tipo_cliente = ?,cpf_cnpj = ?,fantasia = ?,razao_social = ?,nome_contato = ?,tel_fixo = ?,tel_celular = ?,email = ?,cep = ?, logradouro = ?, numero_logradouro = ?, bairro = ?, cidade = ? , tipo_uf = ?, complemento = ? where id_fornecedor = ?";
        PreparedStatement ps = getConexao().prepareStatement(sql);
        ps.setString(1,String.valueOf(fornecedor.getTipoCliente()));
        ps.setString(2,fornecedor.getCpfCnpj());
        ps.setString(3,fornecedor.getFantasia());
        ps.setString(4,fornecedor.getRazaoSocial());
        ps.setString(5,fornecedor.getNomeContato());
        ps.setString(6,fornecedor.getTelFixo());
        ps.setString(7,fornecedor.getTelCelular());
        ps.setObject(8,fornecedor.getEmailFornecedor());
        ps.setString(9,fornecedor.getCepFornecedor());
        ps.setString(10,fornecedor.getLogradouro());
        ps.setString(11,fornecedor.getNumeroLogradouro());
        ps.setString(12,fornecedor.getBairro());
        ps.setString(13,fornecedor.getCidade());
        ps.setString(14,String.valueOf(fornecedor.getTipoUf()));
        ps.setString(15,fornecedor.getComplemento());
        
        ps.setInt(16,fornecedor.getIdFornecedor());
        
        ps.executeUpdate();
        
    }
    
    
    public List<Fornecedor> getFornecedor() throws SQLException{
        String sql  ="Select * from fornecedor";
        PreparedStatement ps = getConexao().prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        List<Fornecedor> fornecedores = new ArrayList();
        
        while(rs.next()){
            Fornecedor fornecedor = new Fornecedor();
            fornecedor.setIdFornecedor(rs.getInt("id_fornecedor"));
            fornecedor.setTipoCliente(TipoCliente.get(rs.getString("tipo_cliente")));
            fornecedor.setDataCadastro(rs.getString("data_cadastro"));
            fornecedor.setCpfCnpj(rs.getString("cpf_cnpj"));
            fornecedor.setFantasia(rs.getString("fantasia"));
            fornecedor.setRazaoSocial(rs.getString("razao_social"));
            fornecedor.setNomeContato(rs.getString("nome_contato"));
            fornecedor.setTelFixo(rs.getString("tel_fixo"));
            fornecedor.setTelCelular(rs.getString("tel_celular"));
            fornecedor.setEmailFornecedor(rs.getString("email"));
            fornecedor.setCepFornecedor(rs.getString("cep"));
            fornecedor.setLogradouro(rs.getString("logradouro"));
            fornecedor.setNumeroLogradouro(rs.getString("numero_logradouro"));
            fornecedor.setBairro(rs.getString("bairro"));
            fornecedor.setCidade(rs.getString("cidade"));
            fornecedor.setTipoUf(rs.getString("tipo_uf"));
            fornecedor.setComplemento(rs.getString("complemento"));
            fornecedores.add(fornecedor);
        } 
        return fornecedores;
    }
}

