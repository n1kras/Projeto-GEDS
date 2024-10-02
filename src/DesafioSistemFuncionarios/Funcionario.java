package DesafioSistemFuncionarios;

import DesafioSistemFuncionarios.exceptions.InvalidInputException;

public class Funcionario {
    private String nome;
    private double salarioBase;

    public Funcionario(String nome, double salarioBase) throws InvalidInputException {
        this.nome = nome;
        this.salarioBase = salarioBase;
        if (salarioBase < 0) {
            throw new InvalidInputException();
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) throws InvalidInputException {
        if (salarioBase < 0) {
            throw new InvalidInputException();
        }
        this.salarioBase = salarioBase;
    }

    public double calcularSalario() {
        return salarioBase;
    }

}
