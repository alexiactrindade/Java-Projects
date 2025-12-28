package aula06.calculadora;

public class App {

	public static void main(String[] args) {
		double totalSoma = Calculadora.somar(2,2); 
		double total = Calculadora.subtrair(totalSoma, 10); 
		System.out.println("Total: " + total);
		double totalPow = Math.pow(10, 2);
		System.out.println("Pow: " + totalPow);
	}
}