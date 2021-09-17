
package org.femass.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import org.femass.model.Cliente;
import org.femass.model.TipoContato;
import org.femass.model.TipoUf;


public class ClienteDao {
    public Connection getConexao() throws SQLException{
        String dataBase = "dbPetShop";
        String ip = "localhost";
        String usuario = "postgres";
        String senha = "1234";
        String url = "jdbc:postgresql://"+ip+":5432/"+dataBase;
        Connection com = DriverManager.getConnection(url,usuario,senha);
        return com;
    }
    
    public void gravar(Cliente cliente) throws SQLException{
        String sql = "Insert into cliente(cpf,nome,telefone,tipo_contato,cep,logradouro,bairro,cidade,tipo_uf,email)values(?,?,?,?,?,?,?,?,?,?)";
        PreparedStatement ps = getConexao().prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
        ps.setString(1,cliente.getCpfCliente());
        ps.setString(2,cliente.getNomeCliente());
        ps.setString(3,cliente.getTelefone());
        ps.setString(4, String.valueOf(cliente.getTipoContato()));
        ps.setString(5,cliente.getCep());
        ps.setString(6,cliente.getLogradouro());
        ps.setString(7,cliente.getBairro());
        ps.setString(8,cliente.getCidade());
        ps.setString(9,cliente.getTipoUf());
        ps.setString(10,cliente.getEmail());
        ps.executeUpdate();
        ResultSet chaves = ps.getGeneratedKeys();
        chaves.next();
        cliente.setIdCliente(chaves.getInt(1));
    }
    
    public void excluir(Cliente cliente) throws SQLException{
        String sql = "delete from cliente where id_cliente = ?";
        PreparedStatement ps = getConexao().prepareStatement(sql);
        ps.setInt(1, cliente.getIdCliente());
        ps.executeUpdate();
        
    }
    
     public void alterar(Cliente cliente) throws SQLException{
        String sql = "update cliente set cpf = ?,nome = ?,telefone = ?,tipo_contato = ?,cep = ?,logradouro = ?,bairro = ?,cidade = ?,tipo_uf = ?,email = ? where id_cliente = ?";
        PreparedStatement ps = getConexao().prepareStatement(sql);
        ps.setString(1,cliente.getCpfCliente());
        ps.setString(2,cliente.getNomeCliente());
        ps.setString(3,cliente.getTelefone());
        ps.setString(4, String.valueOf(cliente.getTipoContato()));
        ps.setString(5,cliente.getCep());
        ps.setString(6,cliente.getLogradouro());
        ps.setString(7,cliente.getBairro());
        ps.setString(8,cliente.getCidade());
        ps.setObject(9,String.valueOf(cliente.getTipoUf()));
        ps.setString(10,cliente.getEmail());
        ps.setInt(11,cliente.getIdCliente());
        
        ps.executeUpdate();
        
    }
    
    
    public List<Cliente> getClientes() throws SQLException{
        String sql  ="Select * from cliente";
        PreparedStatement ps = getConexao().prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        List<Cliente> clientes = new ArrayList();
        
        while(rs.next()){
            Cliente cliente = new Cliente();
            cliente.setIdCliente(rs.getInt("id_cliente"));
            cliente.setCpfCliente(rs.getString("cpf"));
            cliente.setNomeCliente(rs.getString("nome"));
            cliente.setTelefone(rs.getString("telefone"));
            cliente.setTipoContato(TipoContato.get(rs.getString("tipo_contato")));
            cliente.setCep(rs.getString("cep"));
            cliente.setLogradouro(rs.getString("logradouro"));
            cliente.setBairro(rs.getString("bairro"));
            cliente.setCidade(rs.getString("cidade"));
            cliente.setTipoUf(rs.getString("tipo_uf"));
            cliente.setEmail(rs.getString("email"));
            clientes.add(cliente);
        } 
        return clientes;
    }
}

