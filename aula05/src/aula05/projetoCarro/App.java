package aula05.projetoCarro;

public class App {

	public static void main(String[] args) {
		Carro carro1 = new Carro();
		carro1.marca = "Fiat";
		carro1.ano = 2017; 
		carro1.motor = "1.6";
		carro1.arCondicionado = true;
		carro1.imprimirDados();
		carro1.acelerar();
		carro1.frear();
		
		Carro carro2 = new Carro();
		carro2.marca = "Ford";
		carro2.ano = 2020; 
		carro2.motor = "2.0";
		carro2.arCondicionado = false;
		carro2.imprimirDados();
		carro2.acelerar();
		carro2.frear();
		
	}
}
