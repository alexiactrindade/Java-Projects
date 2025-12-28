package VeiculosMotorista;

public class Carro extends Veiculo {
	public int qtdPortas; 
	public String tipoCombustivel;
	
	public Carro(String marca, String modelo, int ano, Motorista motorista, int qtdPortas, String tipoCombustivel) {
		super(marca, modelo, ano, motorista);
		this.qtdPortas = qtdPortas;
		this.tipoCombustivel = tipoCombustivel;
	} 
	
	public void mostrarInformacoesCarro ( ) { 
		System.out.println("Marca: " + this.marca);
		System.out.println("Modelo: " + this.modelo);
		System.out.println("Ano: " + this.ano);
		System.out.println("Motorista: " + this.motorista.nome);
		System.out.println("CNH: " + this.motorista.cnh);
		System.out.println("Anos experiência: " + this.motorista.experienciaAnos);
		System.out.println("Quantidade de portas: " + qtdPortas);
		System.out.println("Tipo combustível: " + tipoCombustivel);
	}

	
}
