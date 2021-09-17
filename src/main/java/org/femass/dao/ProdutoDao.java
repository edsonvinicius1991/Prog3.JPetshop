
package org.femass.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.femass.model.Produto;
import org.femass.model.TipoReferencia;


public class ProdutoDao {
    public Connection getConexao() {
        Connection com = null;
        try{
            String dataBase = "dbPetShop";
            String ip = "localhost";
            String usuario = "postgres";
            String senha = "1234";
            String url = "jdbc:postgresql://"+ip+":5432/"+dataBase;
            com = DriverManager.getConnection(url,usuario,senha);
                    
        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return com;
    }
    
    public void desconectar(Connection com){
        try{
            if(com!=null){
                com.close();
            }
        }
        catch(SQLException e){
            e.printStackTrace();
        }
    }
    
    public void salvar(Produto produto){
        Connection com = getConexao();
        try{
            String sql = "Insert into produto(tipo_referencia,produto,valor_produto,estoque)values(?,?,?,?)";
            PreparedStatement ps = com.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            ps.setObject(1,String.valueOf(produto.getTipoReferencia()));
            ps.setString(2,produto.getProduto());
            ps.setDouble(3,produto.getValorProduto());
            ps.setInt(4,produto.getEstoque());
            ps.executeUpdate();
            ResultSet chaves = ps.getGeneratedKeys();
            chaves.next();
            produto.setIdProduto(chaves.getInt(1));
        }catch(SQLException e){
            e.printStackTrace();
        }finally{
            desconectar(com);
        }
        
    }
    
    public void excluir(Produto produto) throws SQLException{
        String sql = "delete from produto where id_produto = ?";
        PreparedStatement ps = getConexao().prepareStatement(sql);
        ps.setInt(1, produto.getIdProduto());
        ps.executeUpdate();
        
    }
    
         public void alterar(Produto produto) throws SQLException{
        String sql = "update produto set tipo_referencia = ?,produto = ?,valor_produto = ?,estoque = ? where id_produto = ?";
        PreparedStatement ps = getConexao().prepareStatement(sql);
        ps.setObject(1,String.valueOf(produto.getTipoReferencia()));
        ps.setString(2,produto.getProduto());
        ps.setDouble(3,produto.getValorProduto());
        ps.setInt(4,produto.getEstoque());
        
        ps.setInt(5, produto.getIdProduto());
        
        ps.executeUpdate();
        
    }
    
    
    public List<Produto> consultarTodos() throws SQLException{
        List<Produto> produtos = new ArrayList();
        Connection com = getConexao(); 
       
           // String sql = "select * from produto";
            String sql = "select * from produto order by tipo_referencia";
            PreparedStatement ps = com.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                Produto produto = new Produto();
                produto.setIdProduto(rs.getInt("id_produto"));
                produto.setTipoReferencia(TipoReferencia.get(rs.getString("tipo_referencia")));
                produto.setProduto(rs.getString("produto"));
                produto.setValorProduto(rs.getDouble("valor_produto"));
                produto.setEstoque(rs.getInt("estoque"));
                produtos.add(produto);
            
        }
        return produtos;
    }

    
        public List<Produto> getProdutos() throws SQLException{
        String sql  ="Select * from produto";
        PreparedStatement ps = getConexao().prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        List<Produto> produtos = new ArrayList();
        
        while(rs.next()){
            Produto produto = new Produto();
            produto.setIdProduto(rs.getInt("id_produto"));
            produto.setTipoReferencia(TipoReferencia.get(rs.getString("tipo_referencia")));
            produto.setProduto(rs.getString("produto"));
            produto.setValorProduto(rs.getDouble("valor_produto"));
            produto.setEstoque(rs.getInt("estoque"));
            produtos.add(produto);
        } 
        return produtos;
    }
 
 }
    
    

    


