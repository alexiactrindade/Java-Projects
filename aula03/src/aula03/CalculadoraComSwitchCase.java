package aula03;

import java.util.Scanner;

public class CalculadoraComSwitchCase {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite o primeiro número");
		double num1 = scanner.nextDouble();
		System.out.println("Digite o segundo número");
		double num2 = scanner.nextDouble();
		System.out.println(
		"""
		Selecione a operação:
		(1) - Soma
		(2) - Subtração
		(3) - Multiplicação
		(4) - Divisão
				"""		
		);
		int operacao = scanner.nextInt();
		switch (operacao) {
			case 1:
				System.out.println("Soma: " + (num1 + num2));
				break;
			case 2:
				System.out.println("Subtração: " + (num1 - num2));
				break;
			case 3:
				System.out.println("Multiplicação: " + (num1 * num2));
				break;
			case 4:
				if (num2 == 0) {
					System.out.println("Erro. Não é possível dividir um número por zero");
				} else {
					System.out.println("Divisão: " + (num1 / num2));
				}
				break;
	
			default:
				System.out.println("Operação selecionada inválida!");
				break;
		}
		scanner.close();
		
	}
}
