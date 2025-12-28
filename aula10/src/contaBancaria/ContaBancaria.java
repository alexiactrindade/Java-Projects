package contaBancaria;

public class ContaBancaria {
	public double saldo;
	

	public void sacar (double valorSaque) throws SaldoInsuficienteException { 
		if (saldo <= valorSaque) { 
			throw new SaldoInsuficienteException
					("Tentativa de Saque falhou! Saldo atual de R$" + saldo + ", valor solicitado: R$" + valorSaque);
		} 
		saldo -= valorSaque; 
		System.out.println("Saque de R$ " + valorSaque + " realizado com sucesso");
	} 
}