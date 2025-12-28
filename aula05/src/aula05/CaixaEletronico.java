package aula05;

import java.util.Scanner;

public class CaixaEletronico {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double saldo = 1000;
		int opcao = 0;
		while(opcao != 4) {
			System.out.println("""
				1 ➡️ Sacar dinheiro
				2 ➡️ Depositar dinheiro
				3 ➡️ Consultar saldo
				4 ➡️ Sair
			""");
			opcao = scanner.nextInt();
			switch (opcao) {
			case 1:
				System.out.println("Digite o valor que deseja sacar: ");
				double saque = scanner.nextDouble();
				if(saque <= saldo) {
					saldo -= saque;
					System.out.println("Saldo atual: " + saldo);
				} else {
					System.out.println("Saldo insuficiente!");
				}
				break;
			case 2:
				System.out.println("Digite o valor que deseja depositar: ");
				double deposito = scanner.nextDouble();
				saldo += deposito;
				System.out.println("Saldo atual: " + saldo);
				break;
			case 3:
				System.out.println("Saldo atual: " + saldo);
				break;
			case 4:
				System.out.println("Obrigado por usar nossos caixas!");
				break;

			default:
				System.out.println("Opção inválida! Selecione outra opção");
				break;
			}

		}
		scanner.close();
	}
}
