package CalculoSalarios;

public class App {

	public static void main(String[] args) {
		  	Gerente gerente = new Gerente("Maria", "Gerente", 7500.43, 1, "TI");
	        Desenvolvedor dev = new Desenvolvedor("Alexia", "Tech lead", 1, "Java");
	        Estagiario estagiario = new Estagiario();

	        gerente.mostrarInfo();
	        dev.mostrarInfo();
	        estagiario.mostrarInfo();
	}

}
