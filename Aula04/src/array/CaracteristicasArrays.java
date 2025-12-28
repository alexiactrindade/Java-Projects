package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class CaracteristicasArrays {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Double> temperaturas = new ArrayList<>(Arrays.asList(17.6, 20.7, 21.4, 22.6, 21.0, 12.0, 21.5));
		temperaturas.stream().mapToDouble(Double::doubleValue).average();
		scanner.close();

	}

//	Scanner scanner = new Scanner(System.in);
//	String[] produtos = new String[5]; 
//	for (int i = 0; i < produtos.length; i++) {
//		System.out.println("Digite o produto " + (i+ 1));
//		produtos[i] = scanner.nextLine();
//	}
//	System.out.println("---Produtos Cadastrados");
//	for (int i = 0; i < produtos.length; i++) {
//		System.out.println((i + 1) + ". " + produtos[i]);
//	}
//	scanner.close();

}
