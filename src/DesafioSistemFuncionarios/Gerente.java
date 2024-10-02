package DesafioSistemFuncionarios;

import DesafioSistemFuncionarios.exceptions.InvalidInputException;

public class Gerente extends Funcionario {
    private double bonusSalarial;

    public Gerente(String nome, double salarioBase) throws InvalidInputException {
        super(nome, salarioBase);
        if (salarioBase < 0) {
            throw new InvalidInputException();
        }
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
