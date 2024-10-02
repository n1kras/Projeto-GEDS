package DesafioSistemFuncionarios;
import DesafioSistemFuncionarios.exceptions.InvalidInputException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InvalidInputException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do funcionário: ");
        String nome = scanner.nextLine();

        System.out.println("Digite o salário base do funcionário: ");
        double salario = Double.parseDouble(scanner.nextLine());
        if (salario < 0) {
            System.out.println("Você digitou um número inválido! Tente valores positivos na próxima");
            throw new InvalidInputException();
        }
        Funcionario funcionario = new Funcionario(nome, salario);

        System.out.println("Digite o nome do gerente: ");
        nome = scanner.nextLine();

        System.out.println("Digite o salário base do gerente: ");
        salario = Double.parseDouble(scanner.nextLine());
        if (salario < 0) {
            System.out.println("Você digitou um número inválido! Tente valores positivos na próxima");
            throw new InvalidInputException();
        }
        System.out.println("Insira o bônus salarial: ");
        double bonus = Double.parseDouble(scanner.nextLine());
        if (bonus < 0) {
            System.out.println("Você digitou um número inválido! Tente valores positivos na próxima");
            throw new InvalidInputException();
        }


        Gerente gerente = new Gerente(nome, salario);
        gerente.setBonusSalarial(bonus);

        System.out.println("Funcionario: " + funcionario.getNome() + " - Salario: R$" + funcionario.calcularSalario());
        System.out.println("Gerente: " + gerente.getNome() + " - Salario: R$" + gerente.calcularSalario());

        scanner.close();
    }
}