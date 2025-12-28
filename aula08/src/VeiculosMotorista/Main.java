package VeiculosMotorista;

public class Main {

	public static void main(String[] args) {
		Motorista motorista1 = new Motorista("Alexia", "B", 1); 
		Motorista motorista2 = new Motorista("Claudenez", "B", 20); 
		Carro carro = new Carro ("Voyage", "Volkwagen", 1994, motorista2, 2, "Alcool" ); 
		Moto moto = new Moto ("MarcaX", "ModeloY", 2017, motorista1, 2, true);
		
		System.out.println("=== Carro ===");
		carro.mostrarInformacoesCarro();
		System.out.println("=== Moto ===");
		moto.mostrarInformacoesMoto(); 
	}
}
