package CarroMotoristaAtual;

public class Carro {
	private String modelo; 
	private String placa; 
	private Motorista motorista;
	
	public Carro(String modelo, String placa) {
		this.modelo = modelo;
		this.placa = placa;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public Motorista getMotorista() {
		return motorista;
	}
	
	public void mostrarDados ( ) { 
		System.out.println("Modelo: " + modelo);
		System.out.println("Placa: " + placa);
		System.out.println("Dados do motorista: ");
		motorista.mostrarDados(); 
	}
	
	public void atribuirMotorista(Motorista motorista) { 
		this.motorista = motorista;
	}
} 