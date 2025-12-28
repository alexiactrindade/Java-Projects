package contaBancaria;
public class App {
	
	public static void main(String[] args) {
		ContaBancaria conta = new ContaBancaria(); 
		conta.saldo = 1000; 
		try {
			conta.sacar(200);
			conta.sacar(900);
		} catch (SaldoInsuficienteException e) {
			e.printStackTrace();
			System.err.println(e.getMessage());
		}
	}
}
