package aula06.construtor;

public class App {

	public static void main(String[] args) {
		Notebook notebook = new Notebook("G15-5530", 16, 1024, 
				"I7","DELL", true);
		Notebook notebook2 = new Notebook("G15-5530", 16, 1024, 
				"I7","DELL", true);
		notebook.imprimirEspecificacoes(); 
		notebook2.imprimirEspecificacoes(); 
	}
}
