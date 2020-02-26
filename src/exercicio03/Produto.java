package exercicio03;

// TODO: implemente o código-fonte de Produto.java
public class Produto {
    private int codigoID;
    private String nome;
    private double precoVenda;
    private double descontoSite;

    public Produto(int codigoID, String nome, double precoVenda, double descontoSite) {
        this.codigoID = codigoID;
        this.nome = nome;
        this.precoVenda = precoVenda;
        this.descontoSite = descontoSite;
    }

    public int getCodigoID() {
        return codigoID;
    }

    public void setCodigoID(int codigoID) {
        this.codigoID = codigoID;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPrecoVenda() {
        return precoVenda;
    }

    public void setPrecoVenda(double precoVenda) {
        this.precoVenda = precoVenda;
    }

    public double getDescontoSite() {
        return descontoSite;
    }

    public void setDescontoSite(double descontoSite) {
        this.descontoSite = descontoSite;
    }
}

