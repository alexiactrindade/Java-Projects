package FuncionarioGerente;

public class App {

	public static void main(String[] args) {
		Gerente gerente = new Gerente("Alexia", 100000.00 , "Tech lead", "TI", 1000.00, 10, "Sênior");
		
		System.out.println("===Gerente===");
		gerente.mostrarDadosGerente();
	}

}
