package aula05;

import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhacao {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int erros = 0;
		Random random = new Random();
		int numeroSecreto = random.nextInt(1001); 
		System.out.println("""
				🎮 Jogo de Adivinhação 🎮
				Tente adivinhar o número entre 0 e 1000!""");
		System.out.println("Digite um número: ");
		int tentativa = scanner.nextInt();
		while (numeroSecreto != tentativa) {
			erros++;
			if(tentativa > numeroSecreto) 
				System.err.println("Errado 🐴: Digite um número menor");
			else if(tentativa < numeroSecreto) 
				System.err.println("Errado 🐴: Digite um número maior");
			tentativa = scanner.nextInt();
		}
		System.out.println("🎉 Parabéns! Você acertou o número!");
		System.out.println("Erros: " + erros);
		System.out.println("Pontuação: " + (1000 - erros * 10));
		scanner.close();
	}
}
