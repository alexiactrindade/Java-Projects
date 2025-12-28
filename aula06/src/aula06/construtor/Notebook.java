package aula06.construtor;

public class Notebook {
	String modelo; 
	int ram; 
	int armazenamento;
	String processador; 
	String fabricante; 
	boolean gpu; 
	
	Notebook(String modelo, int ram, int armazenamento, 
			String processador, String fabricante , boolean gpu) { 
		this.modelo = modelo;
		this.ram = ram; 
		this.armazenamento = armazenamento; 
		this.processador = processador;
		this.fabricante = fabricante;
		this.gpu = gpu; 
		
	}
	
	void imprimirEspecificacoes() {
		System.out.println("------Especificações do notebook------"); 
		System.out.println("Modelo: " + modelo);
		System.out.println("Memória RAM: " + ram);
		System.out.println("Armazenamento: " + armazenamento);
		System.out.println("Processador: " + processador);
		System.out.println("Fabricante: " + fabricante);
		System.out.println("Tem GPU? " + gpu);
}
}