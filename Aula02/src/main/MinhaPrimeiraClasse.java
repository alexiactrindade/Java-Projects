package main;

import java.util.Scanner;

public class MinhaPrimeiraClasse {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite seu nome: ");
		String nome = scanner.nextLine();
		System.out.println("Digite sua idade: ");
		int idade = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Digite sua cidade: ");
		String cidade = scanner.nextLine();
		System.out.println("Digite a área: ");
		String area = scanner.nextLine();
		System.out.println(
				"Olá meu nome é " + nome
				+ ", tenho " + idade + "anos, moro em "
				+ cidade + " e pretendo atuar na área de " + area);
		scanner.close();
	}

}
