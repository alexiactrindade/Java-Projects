package agregacao;

public class App {

	public static void main(String[] args) {
		Professor professor = new Professor("Alexia", "15", true, 26, 4); 
		Escola escola = new Escola("SENAI", "Aluminio"); 
		escola.setProfessor(professor);
		escola.imprimirDados();
	}

}
