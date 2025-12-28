package heranca;

public class App {

	public static void main(String[] args) {
		Carro carro = new Carro("V8", 4, 'A', "ABS", 2, true, true); 
		Moto moto = new Moto("boxer", 2, 'M', "Disco", false, false); 
		
		System.out.println("-----Detalhes Carro-----");
		carro.exibirDetalhesCarro();
		System.out.println("-----Detalhes Moto-----");
		moto.exibirDetalhesMoto(); 
	}

}
