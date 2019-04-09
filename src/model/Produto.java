package model;

/**
 * @author Davi Alves, Kerolyn Lopes
 * @since 08/04/2019
 * @version 1.0 Don Azhaghal 
 */
public class Produto {
    private int codigoProduto;
    private String nomeProduto;
    private String tipoProduto;
    private double valorProduto;
    private int estoque;
   
    public Produto() { }
    
    /**
     * @param codigoProduto define o valor da variavel
     * @param nomeProduto define o valor da variavel
     * @param tipoProduto define o valor da variavel
     * @param valorProduto define o valor da variavel
     * @param estoque define o valor da variavel
     */
    public Produto(int codigoProduto, String nomeProduto, String tipoProduto, double valorProduto, int estoque) {
        this.codigoProduto = codigoProduto;
        this.nomeProduto = nomeProduto;
        this.tipoProduto = tipoProduto;
        this.valorProduto = valorProduto;
        this.estoque = estoque;
    }
    
    // getter
    public int getCodigoProduto() { return codigoProduto; }

    public void setCodigoProduto(int codigoProduto) { this.codigoProduto = codigoProduto; }

    public String getNomeProduto() { return nomeProduto; }

    public void setNomeProduto(String nomeProduto) { this.nomeProduto = nomeProduto; }

    public String getTipoProduto() { return tipoProduto; }

    public void setTipoProduto(String tipoProduto) { this.tipoProduto = tipoProduto; }

    public double getValorProduto() { return valorProduto; }

    public void setValorProduto(double valorProduto) { this.valorProduto = valorProduto; }

    public int getEstoque() { return estoque; }

    public void setEstoque(int estoque) { this.estoque = estoque; }
    // setter

    @Override
    public String toString() {
        return "Produto{" + "codigoProduto=" + codigoProduto + ", nomeProduto=" + nomeProduto + ", tipoProduto=" + tipoProduto + ", valorProduto=" + valorProduto + ", estoque=" + estoque + '}';
    }
            
}
