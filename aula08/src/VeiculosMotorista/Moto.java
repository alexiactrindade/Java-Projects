package VeiculosMotorista;

public class Moto extends Veiculo {
	public int cilindradas; 
	public boolean temPartidaEletrica;
	
	public Moto(String marca, String modelo, int ano, Motorista motorista, int cilindradas,
			boolean temPartidaEletrica) {
		super(marca, modelo, ano, motorista);
		this.cilindradas = cilindradas;
		this.temPartidaEletrica = temPartidaEletrica;
	} 
	
	public void mostrarInformacoesMoto ( ) { 
		System.out.println("Marca: " + this.marca);
		System.out.println("Modelo: " + this.modelo);
		System.out.println("Ano: " + this.ano);
		System.out.println("Motorista: " + this.motorista.nome);
		System.out.println("CNH: " + this.motorista.cnh);
		System.out.println("Anos experiência: " + this.motorista.experienciaAnos);
		System.out.println("Cilindradas: " + cilindradas);
		System.out.println("Tem partida elétrica? " + temPartidaEletrica);
	}
	
	
	
}
