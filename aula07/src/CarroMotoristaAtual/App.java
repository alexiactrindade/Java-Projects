package CarroMotoristaAtual;

public class App {

	public static void main(String[] args) {
		Motorista motorista = new Motorista("Alexia", "B", 1); 
		Carro carro = new Carro("Voyage", "AAA1234");
		carro.atribuirMotorista(motorista);
		carro.mostrarDados();
}
} 