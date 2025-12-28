package aula05;

import java.util.Scanner;

public class ExemploWhile {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String resposta = "";
		while(!resposta.equalsIgnoreCase("sair")) {
			System.out.println("Escreva algo. Para sair digite 'sair'");
			resposta = scanner.nextLine();
			System.out.println("Sua resposta foi :" + resposta);
			System.out.print("Imprimindo novo texto");
		}
		scanner.close();
	}
	
}
