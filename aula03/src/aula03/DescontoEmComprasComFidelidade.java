package aula03;

import java.util.Scanner;

public class DescontoEmComprasComFidelidade {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Insira o valor da compra: ");
		double valor = scanner.nextDouble();
		System.out.println("Possui cartão fidelidade?");
		boolean cartao = scanner.nextBoolean();
		double valorFinal;
		double descontoAplicado;
		if (!cartao && valor > 100) {
			valorFinal = valor * 0.9;
		} else if (!cartao && valor <= 100) {
			valorFinal = valor * 0.95;
		} else if (cartao && valor > 100) {
			valorFinal = valor * 0.85;
		} else {
			valorFinal = valor * 0.9;
		}
		descontoAplicado = valor - valorFinal;
		System.out.println("---- Nota de compra ----");
		System.out.println("Valor do produto: " + valor);
		System.out.println("Valor total a  pagar: " + valorFinal);
		System.out.println("Desconto aplicado: " + descontoAplicado);
		scanner.close();
	}
}
