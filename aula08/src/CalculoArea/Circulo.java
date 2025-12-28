package CalculoArea;

public class Circulo extends Forma {
public double raio; 
	

	public Circulo(String nome, String cor, double espessuraBorda, double raio) {
	super(nome, cor, espessuraBorda);
	this.raio = raio;
}

	@Override
	public double calcularArea() {
        return Math.PI * raio * raio;
	}
	
}
