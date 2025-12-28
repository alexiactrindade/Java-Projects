package composicao;

public class Carro {
	private String modelo; 
	private String placa; 
	private Motor motor; 
	
	public Carro(String modelo, String placa, int potenciaCavalos, String combustivel, String descricao) { 
	this.modelo=modelo; 
	this.placa=placa; 
	this.motor = new Motor (combustivel, descricao, potenciaCavalos); 

	}
	
	public Carro(String modelo, String placa) {
		this.modelo = modelo; 
		this.placa = placa;
	}
	
	public void exibirDetalhes () { 
		System.out.println("Modelo: " + modelo);
		System.out.println("Placa: " + placa);
		System.out.println("Motor: ");
		motor.exibirDetalhes();
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

	public Motor getMotor() {
		return motor;
	}

	public void setMotor(Motor motor) {
		this.motor = new Motor(potenciaCavalo, combustivel, descricao);
	}
	
} 