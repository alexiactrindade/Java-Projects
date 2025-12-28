package VeiculosMotorista;

public class Veiculo {
	protected String marca;
	protected String modelo;
	protected int ano; 
	protected Motorista motorista;
	
	public Veiculo(String marca, String modelo, int ano, Motorista motorista) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.ano = ano;
		this.motorista = motorista;
	} 

	public void mostrarInformacoes ( ) { 
		System.out.println("Marca: " + this.marca);
		System.out.println("Modelo: " + this.modelo);
		System.out.println("Ano: " + this.ano);
		System.out.println("Motorita" + this.motorista);
	}

}
