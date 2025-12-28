package heranca;

public class Veiculo {
	protected String motor; 
	protected int quantidadeRodas; 
	protected char transmissao; 
	protected String freio;
	
	public Veiculo(String motor, int quantidadeRodas, char transmissao, String freio) {
		this.motor = motor;
		this.quantidadeRodas = quantidadeRodas;
		this.transmissao = transmissao;
		this.freio = freio;
	} 
	
	public void exibirDetalhesVeiculo() { 
		System.out.println("Motor: " + this.motor);
		System.out.println("Quantidade de rodas: " + this.quantidadeRodas);
		System.out.println("Transimissão: " + this.transmissao);
		System.out.println("Freio: " + this.freio);

	}

	public String getMotor() {
		return motor;
	}

	public void setMotor(String motor) {
		this.motor = motor;
	}

	public int getQuantidadeRodas() {
		return quantidadeRodas;
	}

	public void setQuantidadeRodas(int quantidadeRodas) {
		this.quantidadeRodas = quantidadeRodas;
	}

	public char getTransmissao() {
		return transmissao;
	}

	public void setTransmissao(char transmissao) {
		this.transmissao = transmissao;
	}

	public String getFreio() {
		return freio;
	}

	public void setFreio(String freio) {
		this.freio = freio;
	}
	
	
}
