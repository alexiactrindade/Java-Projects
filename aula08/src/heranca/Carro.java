package heranca;

public class Carro extends Veiculo {

	public int quantidadePortas;
	public boolean tetoSolar; 
	public boolean arCondicionado;

	public Carro(String motor, int quantidadeRodas, char transmissao, String freio, int quantidadePortas,
			boolean tetoSolar, boolean arCondicionado) {
		
		super(motor, quantidadeRodas, transmissao, freio);
		this.quantidadePortas = quantidadePortas;
		this.tetoSolar = tetoSolar;
		this.arCondicionado = arCondicionado;
	} 
	
	
	public void exibirDetalhesCarro () { 
		System.out.println("Motor: " + this.motor);
		System.out.println("Quantidade de rodas: " + this.quantidadeRodas);
		System.out.println("Transimissão: " + this.transmissao);
		System.out.println("Freio: " + this.freio);
		System.out.println("Quantidade de portas: " + quantidadePortas);
		System.out.println("Teto solar: " + tetoSolar);
		System.out.println("Ar-condicionado " + arCondicionado);
	}
	
}
