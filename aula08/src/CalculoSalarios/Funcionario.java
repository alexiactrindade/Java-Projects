package CalculoSalarios;

public class Funcionario {
	protected String nome; 
	protected String cargo; 
	protected double salario;
	protected int anosDeServico;
	
	public Funcionario(String nome, String cargo, double salario, int anosDeServico) {
		super();
		this.nome = nome;
		this.cargo = cargo;
		this.salario = salario;
		this.anosDeServico = anosDeServico;
	}
	
	public double calcularBonus() {
		return 0.0;
}
} 