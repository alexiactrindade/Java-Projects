package CalculoSalarios;

public class Estagiario extends Funcionario {
	public String supervisor;

	public Estagiario(String nome, String cargo, double salario, int anosDeServico, String supervisor) {
		super(nome, cargo, salario, anosDeServico);
		this.supervisor = supervisor;
	}

	@Override
	public double calcularBonus() {
		return 500;
	}
	
}
