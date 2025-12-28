package aula03;

import java.util.Scanner;

public class CalculadoraIMC {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Insira o peso em kilos (kg): ");
		float peso = scanner.nextFloat();
		System.out.println("Insira a altura metros (m): ");
		float altura = scanner.nextFloat();
		float imc = peso / (altura * altura);
		System.out.print("Seu imc é de " + imc + " :");
		if (imc < 18.5) {
			System.out.println("Abaixo do peso");
		} else if (imc >= 18.5 && imc < 24.9) {
			System.out.println("Peso normal");
		} else if (imc >= 24.9 && imc < 29.9) {
			System.out.println("Sobrepeso");
		} else if (imc >= 29.9 && imc < 34.9) {
			System.out.println("Obesidade grau I");
		} else if (imc >= 34.9 && imc < 39.9) {
			System.out.println("Obesidade grau II");
		} else {
			System.out.println("Obesidade grau III");
		}
		scanner.close();
	}
}
