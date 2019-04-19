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
    public void registPlayer(Produto p)throws SQLException{
        ProdutoDAO playerDAO = DAOFactory.getProdutoDAO();
        playerDAO.cadastrarProduto(p);
    }// close method
    
    public ArrayList<Produto> searchPlayers() throws SQLException {
        ProdutoDAO playerDAO = DAOFactory.getProdutoDAO();
        return playerDAO.procurarProduto();
    }// close method

    public void deletePlayer(byte id) throws SQLException {
        ProdutoDAO playerDAO = DAOFactory.getProdutoDAO();
        playerDAO.deletarProduto(id);;
    }// close method
    
    public void alterPlayer(Produto p) throws SQLException {
        ProdutoDAO playerDAO = DAOFactory.getProdutoDAO();
        playerDAO.alterarProduto(p);
    }// close method
    
    public ArrayList<Produto> filter(String search, String filter) throws SQLException {
        ProdutoDAO playerDAO = DAOFactory.getProdutoDAO();
        return playerDAO.filtrar(search, filter);
    }//fecha método
}// class closing
