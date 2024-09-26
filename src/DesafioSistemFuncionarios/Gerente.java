package DesafioSistemFuncionarios;

public class Gerente extends Funcionario {
    private double bonusSalarial;

    public Gerente(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    public double getBonusSalarial() {
        return bonusSalarial;
    }

    public void setBonusSalarial(double bonusSalarial) {
        this.bonusSalarial = bonusSalarial;
    }

    @Override
    public double calcularSalario() {
        double salarioTotal;
        salarioTotal = this.getSalarioBase()+bonusSalarial;
        return salarioTotal;
    }
}
