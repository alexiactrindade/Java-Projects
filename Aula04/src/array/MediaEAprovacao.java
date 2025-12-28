package array;

import java.util.Scanner;

public class MediaEAprovacao {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double[] notas = new double[5];
		System.out.println("Digite uma nota: ");
		notas[0] = scanner.nextDouble();
		System.out.println("Digite uma nota: ");
		notas[1] = scanner.nextDouble();
		System.out.println("Digite uma nota: ");
		notas[2] = scanner.nextDouble();
		System.out.println("Digite uma nota: ");
		notas[3] = scanner.nextDouble();
		System.out.println("Digite uma nota: ");
		notas[4] = scanner.nextDouble();
		double somaNotas = notas[0] + notas[1] + notas[2] + notas[3] + notas[4];
		double media = somaNotas / notas.length;
		String aprovacao = media >= 7 ? "Aprovado" : "Reprovado";  
		System.out.println("Média: " + media);
		System.out.println("Situação: " + aprovacao);
		scanner.close();
	}
}
