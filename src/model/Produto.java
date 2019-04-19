package model;

/**
 * @author Davi Alves, Kerollyn Lopes
 * @version 0.1 Beta
 * @since 08/04/2019
 */
public class Produto {

    private int produtoId;
    private String nomeProduto;
    private int qtdEstoque;
    private String tipoProduto;
    private double valor;

    public Produto() { }

    /**
     * @param produtoId defines the var value
     * @param nomeProduto defines the var value
     * @param qtdEstoque defines the var value
     * @param tipoProduto defines the var value
     * @param valor defines the var value
     */
    public Produto(int playerId, String playerName, int playerAge, String email, double valor) {
        this.produtoId = playerId;
        this.nomeProduto = playerName;
        this.qtdEstoque = playerAge;
        this.tipoProduto = email;
        this.valor = valor;
    }

    // Getters
    public int getProdutoId() {
        return produtoId;
    }

    public void setProdutoId(int produtoId) {
        this.produtoId = produtoId;
    }

    public String getTipoProduto() {
        return tipoProduto;
    }

    public void setTipoProduto(String tipoProduto) {
        this.tipoProduto = tipoProduto;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public int getQtdEstoque() {
        return qtdEstoque;
    }

    public void setQtdEstoque(int qtdEstoque) {
        this.qtdEstoque = qtdEstoque;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    // Setters

    @Override
    public String toString() {
        return "Produto{" + "produtoId=" + produtoId + ", nomeProduto=" + nomeProduto + ", qtdEstoque=" + qtdEstoque + ", tipoProduto=" + tipoProduto + ", valor=" + valor + '}';
    }

}
