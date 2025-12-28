package aula05.projetoCarro;

public class Carro {

	String marca;
	int ano;
	String motor;
	boolean arCondicionado;
	
	void acelerar() {
		System.out.println("Vrummmmm!!!!");
	}
	
	void frear() {
		System.out.println("rrrrrrrrr!!!!");
	}
	
	void imprimirDados() {
		System.out.println(marca);
		System.out.println(ano);
		System.out.println(motor);
		System.out.println(arCondicionado);
	}
}
