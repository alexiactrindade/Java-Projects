package heranca;

public class Moto extends Veiculo {
	
	public boolean bau; 
	public boolean sideCar;
	
	public Moto(String motor, int quantidadeRodas, char transmissao, String freio, boolean bau, boolean sideCar) {
		super(motor, quantidadeRodas, transmissao, freio);
		this.bau = bau;
		this.sideCar = sideCar;
	} 

	public void exibirDetalhesMoto () { 
		System.out.println("Motor: " + this.motor);
		System.out.println("Quantidade de rodas: " + this.quantidadeRodas);
		System.out.println("Transimissão: " + this.transmissao);
		System.out.println("Freio: " + this.freio);
		System.out.println("Tem baú? " + bau);
		System.out.println("Tem sideCar? " + sideCar);
		
	} 
		
}
