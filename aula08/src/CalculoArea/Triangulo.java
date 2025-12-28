package CalculoArea;

public class Triangulo extends Forma {
	public double base, altura;

	public Triangulo(String nome, String cor, double espessuraBorda, double base, double altura) {
		super(nome, cor, espessuraBorda);
		this.base = base;
		this.altura = altura;
	}

	@Override
	public double calcularArea() {
        return (base * altura) / 2;
	} 
	
	
}
