package aula06.validacaoSalario;

public class App {

	public static void main(String[] args) {
		Funcionario funcionario = new Funcionario(0);
		System.out.println("Salário inicial: " + funcionario.getSalario());
		funcionario.setSalario(5000); 
		funcionario.setSalario(-100);
		System.out.println("Salário  atual: " + funcionario.getSalario());

	}
}