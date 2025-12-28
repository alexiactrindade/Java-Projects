package PolimorfismoOverload;

public class Calculadora {
	public void somar(int a, int b) { 
		int total = a + b; 
		System.out.println("Soma de inteiros: " + total);
	}

	public void somar(double a, double b) { 
		double total = a + b; 
		System.out.println("Soma de 2 decimais:" + total);
	}
	
	public void somar(double a, double b, double c) { 
		double total = a + b + c; 
		System.out.println("Soma de 3 decimais:" + total);
	} 
}