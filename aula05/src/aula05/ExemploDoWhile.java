package aula05;

import java.util.Scanner;

public class ExemploDoWhile {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int idade;
		boolean idadeInvalida = false;
		do {
			System.out.println("Digite sua idade: ");
			idade = scanner.nextInt();
			idadeInvalida = !(idade >= 18 && idade <= 65);
			if(idadeInvalida) 
				System.out.println("Idade inválida. "
						+ "A idade deve estar entre 18 e 65 anos");
		} while (idadeInvalida);
		System.out.println("Idade registrada com sucesso: " + idade);
		scanner.close();
	}
}
