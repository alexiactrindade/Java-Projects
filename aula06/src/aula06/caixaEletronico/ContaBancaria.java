package aula06.caixaEletronico;

public class ContaBancaria {
	private String nomeTitular;
	private String numeroConta;
	private double saldo;
	
	public ContaBancaria(String nomeTitular, String numeroConta) {
		this.nomeTitular = nomeTitular;
		this.numeroConta = numeroConta;
		this.saldo = 0.0;
	}

	public String getNomeTitular() {
		return nomeTitular;
	}

	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}

	public String getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(String numeroConta) {
		this.numeroConta = numeroConta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void depositar(double valor) { 
		this.saldo += valor; 
	}
	
	public boolean sacar(double valor) { 
		if (valor <= this.saldo) { 
			this.saldo -= valor; 
			return true; 
		} else { 
			return false;
		}
	}
	public String extrairExtrato() { 
		return String.format("""
				nome do titular: %s
				numero da conta: %s 
				saldo: R$ %.2f 
				""", nomeTitular, numeroConta, saldo); 
	}
}