package casaConstrutor;

public class Main {

	public static void main(String[] args) {
		        Casa minhaCasa = new Casa("Branca e Azul", 123);
		        
		        minhaCasa.criarSala();
		        minhaCasa.criarCozinha();
		        minhaCasa.criarBanheiro();
		        minhaCasa.mostrarDetalhes();
		    }

	}
