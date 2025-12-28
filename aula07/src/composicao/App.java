package composicao;

public class App {
	
	public static void main(String[] args) {
			Carro carro1 = new Carro("Ford", "EXO-7777", 200, "gasolina", "um bom motor"); 
			carro1.exibirDetalhes();
			Carro carro2 = new Carro ("BMW", "AAA-1234"); 
			carro2.setMotor(300,"gasolina", "outro bom motor"); 
			
	}

}
