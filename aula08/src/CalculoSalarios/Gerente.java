package CalculoSalarios;

public class Gerente extends Funcionario {
	public String departamento;

	public Gerente(String nome, String cargo, double salario, int anosDeServico, String departamento) {
		super(nome, cargo, salario, anosDeServico);
		this.departamento = departamento;
	}

	@Override
	public double calcularBonus() {
		return salario * 0.20 + anosDeServico * 10;
	} 
	
	
}
