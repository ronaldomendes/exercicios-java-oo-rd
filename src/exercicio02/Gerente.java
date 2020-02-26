package exercicio02;

public class Gerente extends Funcionario {

    // TODO: implemente o código desta classe
    private double bonusAnualVariavel;
    private double bonusAnual;

    public Gerente(String nome, double salario, double bonusAnualVariavel) {
        super(nome, salario);
        this.bonusAnualVariavel = bonusAnualVariavel;
    }

    public double getBonusAnualVariavel() {
        return bonusAnualVariavel;
    }

    public void setBonusAnualVariavel(double bonusAnualVariavel) {
        this.bonusAnualVariavel = bonusAnualVariavel;
    }

    public double getBonusAnual() {
        return bonusAnual;
    }

//    public void setBonusAnual(double bonusAnual) {
//        this.bonusAnual = bonusAnual;
//    }

    public void setBonusAnual() {
        this.bonusAnual = 500.0;
    }

    @Override
    public double salarioAnual() {
        return super.salarioAnual() + this.getBonusAnual() + bonusAnualVariavel;
    }
}
