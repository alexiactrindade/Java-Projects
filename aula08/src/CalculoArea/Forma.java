package CalculoArea;

public class Forma {
	protected String nome; 
	protected String cor;
	protected double espessuraBorda; 
	
	
	
	public Forma(String nome, String cor, double espessuraBorda) {
		super();
		this.nome = nome;
		this.cor = cor;
		this.espessuraBorda = espessuraBorda;
	}

	public double calcularArea() { 
		return 0.0;
	}
	
	public void mostrarInfo() { 
	        System.out.println("Forma: " + nome);
	        System.out.println("Cor: " + cor);
	        System.out.println("Espessura da borda: " + espessuraBorda);
	        System.out.println("Área: " + calcularArea());
	}
}