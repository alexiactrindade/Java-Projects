package aula03;

import java.util.Scanner;

public class ExemploSwitchCase {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite um número entre 1 e 7");
		int num = scanner.nextInt();
		switch (num) {
			case 1:
				System.out.println("Dia da semana: Domingo");
				break;
			case 2:
				System.out.println("Dia da semana: Segunda-feira");
				break;
			case 3:
				System.out.println("Dia da semana: Terça-feira");
				break;
			case 4:
				System.out.println("Dia da semana: Quarta-feira");
				break;
			case 5:
				System.out.println("Dia da semana: quinta-feira");
				break;
			case 6:
				System.out.println("Dia da semana: sexta-feira");
				break;
			case 7:
				System.out.println("Dia da semana: sábado");
				break;
			default:
				System.out.println("O número digitado é inválido");
				break;
		}
		scanner.close();
	}

}
