package CalculoArea;

public class Retangulo extends Forma {
	public double largura, altura;

	public Retangulo(String nome, String cor, double espessuraBorda, double largura, double altura) {
		super(nome, cor, espessuraBorda);
		this.largura = largura;
		this.altura = altura;
	}

	@Override
	public double calcularArea() {
        return largura * altura;
	}
	
}
