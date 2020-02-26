package exercicio02;

public class AuxiliarEscritorio extends Funcionario {

    // TODO: implemente o código desta classe
    private double bonusAnual;

     public AuxiliarEscritorio(String nome, double salario, double bonusAnual) {
        super(nome, salario);
        this.bonusAnual = bonusAnual;
    }

    public double getBonusAnual() {
        return bonusAnual;
    }

    public void setBonusAnual(double bonusAnual) {
        this.bonusAnual = bonusAnual;
    }

    @Override
    public double salarioAnual() {
        return super.salarioAnual() + this.bonusAnual;
    }
}
