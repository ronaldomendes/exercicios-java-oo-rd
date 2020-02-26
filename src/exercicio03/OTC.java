package exercicio03;

// TODO: implemente o código-fonte de OTC.java
public class OTC extends Produto {
    private double precoPromocional;

    public OTC(int codigoID, String nome, double precoVenda, double descontoSite, double precoPromocional) {
        super(codigoID, nome, precoVenda, descontoSite);
        this.precoPromocional = precoPromocional;
    }

    public double getPrecoPromocional() {
        return precoPromocional;
    }

    public void setPrecoPromocional(double precoPromocional) {
        this.precoPromocional = precoPromocional;
    }
}
