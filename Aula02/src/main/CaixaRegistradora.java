package main;

import java.util.Scanner;

public class CaixaRegistradora {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("---- Caixa Registradora -----");
		System.out.println("Digite o preço do primeiro produto: ");
		double produto1 = scanner.nextDouble();
		System.out.println("Digite o preço do primeiro produto: ");
		double produto2 = scanner.nextDouble();
		System.out.println("---- Resultados -----");
		double res = produto1 + produto2;
		System.out.println("Soma: " + res);
		res = produto1 - produto2;
		System.out.println("Subtração: " + res);
		res = produto1 * produto2;
		System.out.println("Multiplicação: " + res);
		res = produto1 / produto2;
		System.out.println("Divisão: " + res);
		res = produto1 % produto2;
		System.out.println("Resto: " + res);
		scanner.close();
		
	}
}
