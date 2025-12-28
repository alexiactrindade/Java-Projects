package aula03;

import java.util.Scanner;

public class OperadorTernario {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Possui cartão? (true ou false)");
		String possuiCartao = scanner.nextBoolean() ? "Possui" : "Não possui"; // Operador Ternário
		System.out.println("Possui cartão: " + possuiCartao);
		scanner.close();
	}

}
