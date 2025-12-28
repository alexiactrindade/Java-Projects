package PolimorfismoOverride;

public class Cachorro extends Animal {
	public boolean farejador;

	public Cachorro(String cor, String raca, boolean farejador) {
		super(cor, raca);
		this.farejador = farejador;
	} 
	
	@Override
	public void emitirSom() { 
		System.out.println("Au au au!!!");
	}
}
