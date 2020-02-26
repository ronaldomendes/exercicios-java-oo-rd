package exercicio03;

// TODO: implemente o código-fonte de Perfumaria.java
public class Perfumaria extends Produto {
//    private double precoPromocional;
    private int qtdLMPM;
    private double precoLMPM;

    public Perfumaria(int codigoID, String nome, double precoVenda, double descontoSite, int qtdLMPM, double precoLMPM) {
        super(codigoID, nome, precoVenda, descontoSite);
        this.qtdLMPM = qtdLMPM;
        this.precoLMPM = precoLMPM;
    }
}
