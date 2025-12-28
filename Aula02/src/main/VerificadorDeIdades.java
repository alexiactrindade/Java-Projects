package main;

import java.util.Scanner;

public class VerificadorDeIdades {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite a primeira idade: ");
		int idade1 = scanner.nextInt();
		System.out.println("Digite a segunda idade: ");
		int idade2 = scanner.nextInt();
		boolean ambasMaiorQue18 = idade1 >= 18 && idade2 >= 18; 
		System.out.println("Ambas pessoas são maiores de idade?: " + ambasMaiorQue18);
		boolean qualquerIdadeMaiorQue60 = idade1 > 60 || idade2 > 60;
		System.out.println("Qualquer uma tem mais que 60 anos?: " + qualquerIdadeMaiorQue60);
		boolean idade1DiferenteDe16 = idade1 != 16;
		System.out.println("Primeira idade é diferente de 16?: " + idade1DiferenteDe16);
		scanner.close();
	}
}
