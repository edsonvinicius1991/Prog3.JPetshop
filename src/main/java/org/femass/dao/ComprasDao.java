
package org.femass.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import org.femass.model.Compra;
import org.femass.model.ItensCompra;



public class ComprasDao {
    public Connection getConexao() throws SQLException{
        String dataBase = "dbPetShop";
        String ip = "localhost";
        String usuario = "postgres";
        String senha = "1234";
        String url = "jdbc:postgresql://"+ip+":5432/"+dataBase;
        Connection com = DriverManager.getConnection(url,usuario,senha);
        return com;
    }
    
    public void gravar(Compra compra) throws SQLException{
        String sql = "Insert into compra(data,valor_total,id_fornecedor)values(?,?,?)";
        PreparedStatement ps = getConexao().prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
        ps.setString(1,compra.getDataVenda());
        ps.setDouble(2,compra.getTotalVenda());
        ps.setInt(3, compra.getFornecedor().getIdFornecedor());
        
        ps.executeUpdate();
        
        ResultSet chaves = ps.getGeneratedKeys();
        chaves.next();
        compra.setIdCompra(chaves.getInt(1));
        
        for(ItensCompra iC : compra.getItensCompra()) {
            Compra compra2 = (Compra) compra;
            String sql2 = "Insert into itenscompra(id_produto, id_compra, qtde_compradas) values(?, ?, ?) on conflict do nothing";
            PreparedStatement ps2 = getConexao().prepareStatement(sql2);
            ps2.setInt(1,iC.getProduto().getIdProduto());
            ps2.setInt(2,compra2.getIdCompra());
            ps2.setInt(3, iC.getQuantidade());
            
            ps2.executeUpdate();
            
            String sql3 = "Update produto set estoque = ? where id_produto = ?";
            PreparedStatement ps3 = getConexao().prepareStatement(sql3);
            ps3.setInt(1, (iC.getProduto().getEstoque() + iC.getQuantidade()));
            ps3.setInt(2,iC.getProduto().getIdProduto());
            
            ps3.executeUpdate();
        }
    }
    
    
        public void excluir(Compra compra) throws SQLException{
        String sql = "delete from cliente where id_compra = ?";
        PreparedStatement ps = getConexao().prepareStatement(sql);
        ps.setInt(1, compra.getIdCompra());
        ps.executeUpdate();
        
    }
        
        public void alterar(Compra compra) throws SQLException{
        
        
    }
}
