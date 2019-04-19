package services;

/** 
 * @author Davi Alves, Kerollyn Lopes
 * @version 0.1 Beta
 * @since 08/04/2019
 */
public class ServicesFactory {
    private static final ProdutoServices ps = new ProdutoServices();
    
    public static ProdutoServices getProdutosServices(){
        return ps;
    }
}
