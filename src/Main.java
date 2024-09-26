public class Main {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Nicolas", 800.0);
        Gerente gerente = new Gerente("Pablo", 1400.0);
        gerente.setBonusSalarial(800.0);

        System.out.println("Funcionario: " + funcionario.getNome() + " - Salario: R$" + funcionario.calcularSalario());
        System.out.println("Gerente: " + gerente.getNome() + " - Salario: R$" + gerente.calcularSalario());
    }
}