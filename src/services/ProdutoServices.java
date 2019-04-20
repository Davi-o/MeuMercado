package services;

import dao.DAOFactory;
import dao.ProdutoDAO;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Produto;

/**
 * @author Davi Alves
 * @version 0.1 Beta
 * @since 31/03/2019
 */
public class ProdutoServices {
    public void cadProduto(Produto p)throws SQLException{
        ProdutoDAO produtoDAO = DAOFactory.getProdutoDAO();
        produtoDAO.cadastrarProduto(p);
    }// close method
    
    public ArrayList<Produto> procurarProdutos() throws SQLException {
        ProdutoDAO ProdutoDAO = DAOFactory.getProdutoDAO();
        return ProdutoDAO.procurarProduto();
    }// close method

    public void deletarProduto(int id) throws SQLException {
        ProdutoDAO produtoDAO = DAOFactory.getProdutoDAO();
        produtoDAO.deletarProduto(id);;
    }// close method
    
    public void alterarProduto(Produto p) throws SQLException {
        ProdutoDAO produtoDAO = DAOFactory.getProdutoDAO();
        produtoDAO.alterarProduto(p);
    }// close method
    
    public ArrayList<Produto> filtrarProdutos(String search, String filter) throws SQLException {
        ProdutoDAO produtoDAO = DAOFactory.getProdutoDAO();
        return produtoDAO.filtrar(search, filter);
    }//fecha método
}// class closing
