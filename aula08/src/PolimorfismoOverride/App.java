package PolimorfismoOverride;

public class App {

	public static void main(String[] args) {
		Cachorro cachorro = new Cachorro("Cachorro", "Labrador", true);
		Gato gato = new Gato ("Rajado", "Persa"); 
		Cavalo cavalo = new Cavalo ("Branco", "Pampa", "Marcha picada");
				
		cachorro.emitirSom();
		gato.emitirSom();
		cavalo.emitirSom();
	}

}
