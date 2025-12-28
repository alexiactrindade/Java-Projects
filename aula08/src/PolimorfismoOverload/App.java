package PolimorfismoOverload;

public class App {

	public static void main(String[] args) {
		Calculadora calculadora = new Calculadora(); 
		calculadora.somar(10, 10);
		calculadora.somar(5.1, 10.8, 101.7);
		calculadora.somar(2.1, 9.9);
	}
}
