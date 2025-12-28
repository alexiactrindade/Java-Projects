package main;

import java.util.Scanner;

public class CalculadoraMediaEscolar {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("---- Calculadora de Média Escolar -----");
		System.out.println("Digite a primeira nota: ");
		double nota1 = scanner.nextDouble();
		System.out.println("Digite a segunda nota: ");
		double nota2 = scanner.nextDouble();
		System.out.println("Digite a segunda nota: ");
		double nota3 = scanner.nextDouble();
		System.out.println("---- Resultados -----");
		double media = (nota1 + nota2 + nota3) / 3;
		System.out.println("A média do aluno é: " + media);
		scanner.close();

	}
}
