package PolimorfismoOverride;

public class Animal {
	private String cor; 
	private String raca;
	
	public Animal(String cor, String raca) {
		this.cor = cor;
		this.raca = raca;
	} 
	
	public void emitirSom() { 
		System.out.println("Emitindo som genérico");
	}
}
