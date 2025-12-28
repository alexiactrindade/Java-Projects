package array;

import java.util.Scanner;

public class MediaTemperaturas {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double[] temperaturas = {23.3, 22.2, 21.0, 12.3, 30.2, 29.4, 24.3};
		double somaTemperaturas = temperaturas[0]
								+ temperaturas[1]
								+ temperaturas[2]
								+ temperaturas[3]
								+ temperaturas[4]
							    + temperaturas[5]
							    + temperaturas[6];
		double media = somaTemperaturas / temperaturas.length;
		System.out.println("Média das temperaturas :" + media);
		scanner.close();
	}
	
	
	
	
	
	
	
	
	
	
	
//	Scanner scanner = new Scanner(System.in);
//	ArrayList<Double> temperaturas = new ArrayList<>(Arrays.asList(17.6, 20.7, 21.4, 22.6, 21.0, 12.0, 21.5));
//	OptionalDouble media = temperaturas.stream().mapToDouble(Double::doubleValue).average();
//	System.out.println("Média de temperaturas: " + media.getAsDouble());
//	scanner.close();
}
