package exercicio02;

public class TecnicoManutencao extends Funcionario {

    // TODO: implemente o código desta classe
    private double insalubridade;
    private double bonusAnual;

    public TecnicoManutencao(String nome, double salario, double insalubridade, double bonusAnual) {
        super(nome, salario);
        this.insalubridade = insalubridade;
        this.bonusAnual = bonusAnual;
    }

    public double getInsalubridade() {
        return insalubridade;
    }

    public void setInsalubridade(double insalubridade) {
        this.insalubridade = insalubridade;
    }

    public double getBonusAnual() {
        return bonusAnual;
    }

    public void setBonusAnual(double bonusAnual) {
        this.bonusAnual = bonusAnual;
    }

    @Override
    public double salarioAnual() {
        return super.salarioAnual() * (insalubridade / 100 + 1) + bonusAnual;
    }
}
