package aula06.caixaEletronico;

public class App {

	public static void main(String[] args) {
		ContaBancaria conta1 = new ContaBancaria("Alice", "1234-x"); 
		conta1.extrairExtrato(); 
		conta1.depositar(500.0); 
		
		if (conta1.sacar(200.0) == true) {
			System.out.println("Saldo realizado com sucesso!");
		} else { 
			System.out.println("Saldo insuficiente");
		}
		
		if (conta1.sacar(400.0) == true) {
			System.out.println("Saldo realizado com sucesso!");
		} else { 
			System.out.println("Saldo insuficiente");
		}
		
		conta1.depositar(-100.00);
		System.err.println (conta1.extrairExtrato()); 
		
	}

}
