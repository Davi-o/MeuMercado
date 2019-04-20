package dao;

import connection.DBConnection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import model.Produto;

/** 
 * @author Davi Alves, Kerollyn Lopes
 * @version 0.1 Beta
 * @since 08/04/2019
 */
public class ProdutoDAO {
    public void cadastrarProduto(Produto p) throws SQLException{
        Connection con = DBConnection.createConnection();
        Statement stat = con.createStatement();
        try {
            String sql = "";
              sql = "insert into produto(id_produto, nome_produto, tipo_produto, valor_unitario, qtd_estoque)"
                    + "values(null,'"+p.getNomeProduto()+"','"+p.getTipoProduto()+"','"+p.getValor()+"','"+p.getQtdEstoque()+"')";
              stat.execute(sql);
        } catch (Exception e) {
            throw new SQLException("Erro ao cadastrar! " + e.getMessage());
        }finally{
            stat.close();
            con.close();
        }// catch
    }
    public ArrayList<Produto> procurarProduto() throws SQLException {
        Connection con = DBConnection.createConnection();
        Statement stat = con.createStatement();
        try {
            String sql = "";
            sql = "select * from produto ";
            ArrayList<Produto> prod = new ArrayList<>();
            ResultSet rs = stat.executeQuery(sql);

            while (rs.next()) {
                Produto p = new Produto();
                p.setProdutoId(rs.getInt("id_produto"));
                p.setNomeProduto(rs.getString("nome_produto"));
                p.setQtdEstoque(rs.getInt("qtd_estoque"));
                p.setValor(Double.parseDouble(rs.getString("valor_unitario")));
                p.setTipoProduto(rs.getString("tipo_produto"));
                prod.add(p);
            }
            return prod;
        } catch (SQLException e) {
            throw new SQLException("Erro ao buscar produto!" + e.getMessage());
        } finally {
            stat.close();
            con.close();
        }// close catch
    }// close method
    
    public void deletarProduto(int id) throws SQLException {
        Connection con = DBConnection.createConnection();
        Statement stat = con.createStatement();
        try {
            String sql = "delete from estoque.produto where id_produto=" + id;
            stat.execute(sql);
        } catch (SQLException e) {
            e.printStackTrace();
            throw new SQLException(
                    "Erro ao excluir Produto!" + e.getMessage());
        } finally {
            stat.close();
            con.close();
        }//fecha finally
    }//fecha método
        
    public void alterarProduto(Produto p) throws SQLException {
        Connection con = DBConnection.createConnection();
        Statement stat = con.createStatement();
        try {
            String sql = "";
            sql = "update produto "
                + "set nome_produto='"+p.getNomeProduto()+"',tipo_produto='"+p.getTipoProduto()+"',qtd_estoque='"+p.getQtdEstoque()+"',valor_unitario='"+p.getValor()+"' where id_produto='"+p.getProdutoId()+"'";
            stat.execute(sql);
        } catch (SQLException e) {
            throw new SQLException(
                    "Erro ao alterar! " + e.getMessage());
        } finally {
            stat.close();
            con.close();
        }//fecha finally
    }// close method
    
     public ArrayList<Produto> filtrar(String search, String filter) throws SQLException {

        Connection con = DBConnection.createConnection();
        Statement stat = con.createStatement();
        try {
            String sql;
            sql = "select * from produto ";

            if (filter.equalsIgnoreCase("ID")) {
                sql += "where id_produto=" + search;
            } else if (filter.equalsIgnoreCase("Nome")) {
                sql += "where nome_produto like '%" + search + "_%'";
            } else if (filter.equalsIgnoreCase("Tipo")) {
                sql += "where tipo_produto like '%" + search + "_%'";
            } else if (filter.equalsIgnoreCase("Valor")) {
                sql += "where valor_unitario like '%" + search + "_%'";
            } else if (filter.equalsIgnoreCase("Qtd")) {
                sql += "where qtd_estoque like '%" + search + "_%'";
            }

            ResultSet rs = stat.executeQuery(sql);
            ArrayList<Produto> produto = new ArrayList<>();
            while (rs.next()) {
                Produto p = new Produto();
                p.setProdutoId(rs.getInt("id_produto"));
                p.setNomeProduto(rs.getString("nome_produto"));
                p.setQtdEstoque(rs.getInt("qtd_estoque"));
                p.setValor(rs.getDouble("valor_unitario"));
                p.setTipoProduto(rs.getString("tipo_produto"));
                produto.add(p);
            }//fecha while
            return produto;
        } catch (SQLException e) {
            throw new SQLException("Erro ao procurar Produto! " + e.getMessage());
        } finally {
            con.close();
            stat.close();
        }//fecha finally
    }//fecha método
}
