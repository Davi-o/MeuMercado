package dao;

/** Makes the instances of the DAO classes
 * @author Davi Alves, Kerollyn Lopes
 * @version 0.1 Beta
 * @since 08/04/2019
 */
public class DAOFactory {
    // instances
    private static final ProdutoDAO pDAO = new ProdutoDAO();
    //instances
    
    /**
     * @return The playerDAO instance
     */
    public static ProdutoDAO getProdutoDAO() { return pDAO; }
    
}
