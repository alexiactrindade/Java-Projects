package array;

import java.util.Scanner;

public class CadastroDeProdutos {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] produtos = new String[5];
		System.out.println("Digite o produto 1: ");
		produtos[0] = scanner.nextLine();
		System.out.println("Digite o produto 2: ");
		produtos[1] = scanner.nextLine();
		System.out.println("Digite o produto 3: ");
		produtos[2] = scanner.nextLine();
		System.out.println("Digite o produto 4: ");
		produtos[3] = scanner.nextLine();
		System.out.println("Digite o produto 5: ");
		produtos[4] = scanner.nextLine();
		System.out.println("---Produtos cadastrados---");
		System.out.println("1. " + produtos[0]);
		System.out.println("2. " + produtos[1]);
		System.out.println("3. " + produtos[2]);
		System.out.println("4. " + produtos[3]);
		System.out.println("5. " + produtos[4]);
		scanner.close();
		
	}
}

