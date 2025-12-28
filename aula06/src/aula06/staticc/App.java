package aula06.staticc;

public class App {

	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa ("Alexia", 26); 
		Pessoa pessoa2 = new Pessoa ("Maria", 28);
		System.out.println("Total pessoas: " + Pessoa.contadorPessoas);
	}

}
