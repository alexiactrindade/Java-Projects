package aula06.validacaoSalario;

public class Funcionario {
	private double salario; 
	
	public Funcionario(double salario) { 
		this.salario = salario; 
	}
	
	public double getSalario () { 
		return this.salario; 
	}
	
	public void setSalario(double novoSalario) { 
		System.out.println("Tentativa de alterar o salário para R$" + novoSalario); 
		if (novoSalario > 0) { 
			System.out.println("Salário alterado!"); 
		} else { 
			System.out.println("Salário inválido!");
		}
	}
}