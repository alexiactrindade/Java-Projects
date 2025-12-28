package loop;

import java.util.Random;

public class ControleEstoque {

	public static void main(String[] args) {
		int estoqueAtual = 50;
		int estoqueMinimo = 15;
		Random random = new Random();
		System.out.println("--- Início do Controle de Estoque ---");
		for (int i = 0; i < 10; i++) {
			int itensPorCompra = random.nextInt(10) + 1;
			if (estoqueAtual - itensPorCompra >= 0) {
				estoqueAtual -= itensPorCompra;
				System.out.println("Venda " + (i + 1) + ". Novo Estoque: " + estoqueAtual);
			}else {
				System.out.println("Quantidades de itens indisponível");
			}
			if (estoqueAtual <= 0) {
				System.out.println("❌ ESTOQUE ESGOTADO!");
			} else if (estoqueAtual < estoqueMinimo) {
				System.out.println("🚨 Alerta! Estoque baixo: " + estoqueAtual);
			}
		}
	}
}
