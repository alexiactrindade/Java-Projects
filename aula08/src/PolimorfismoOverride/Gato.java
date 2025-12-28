package PolimorfismoOverride;

public class Gato extends Animal {

	public Gato(String cor, String raca) {
		super(cor, raca);
	}

	@Override
	public void emitirSom() {
		System.out.println("Miau!");
	}
	
	
}
