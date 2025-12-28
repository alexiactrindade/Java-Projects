package main;

import java.util.Scanner;

public class EstruturaCondicional {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite a temperatura: ");
		int nota = scanner.nextInt();
		if (nota < 50) System.out.println("Reprovado!");
		else if (nota < 70) System.out.println("Recuperação!");
		else if (nota < 90) System.out.println("Aprovado!");
		else System.out.println("Excelente, aprovado com louvor");
		
		scanner.close();

	}

}
