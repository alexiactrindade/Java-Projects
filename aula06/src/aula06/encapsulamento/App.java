package aula06.encapsulamento;

public class App {

	public static void main(String[] args) {
		Usuario usuario = new Usuario("AleXia TriNDade", "alexiadacostatrindade@gmail.com", "S3nh4123", true);
		usuario.depositar(50000); 
		usuario.depositar(10000);
		usuario.setSaldo(0);
		usuario.exibirDados();
		
		System.out.println("User: " + usuario.getSaldo()); 
	}
}
