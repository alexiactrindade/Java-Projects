package CalculoSalarios;

public class Desenvolvedor extends Funcionario {
	public String linguagemPrincipal;

	public Desenvolvedor(String nome, String cargo, double salario, int anosDeServico, String linguagemPrincipal) {
		super(nome, cargo, salario, anosDeServico);
		this.linguagemPrincipal = linguagemPrincipal;
	}

	@Override
	public double calcularBonus() {
		return salario * 0.10 + anosDeServico * 50;
	}
	
	
}
