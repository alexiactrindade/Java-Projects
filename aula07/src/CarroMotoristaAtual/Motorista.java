package CarroMotoristaAtual;

public class Motorista {
	private String nome; 
	private String cnh; 
	private int experiencia;
	
	public Motorista(String nome, String cnh, int experiencia) {
		this.nome = nome;
		this.cnh = cnh;
		this.experiencia = experiencia;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCnh() {
		return cnh;
	}

	public void setCnh(String cnh) {
		this.cnh = cnh;
	}

	public int getExperiencia() {
		return experiencia;
	}

	public void setExperiencia(int experiencia) {
		this.experiencia = experiencia;
	} 
	
	public void mostrarDados () { 
		System.out.println("Nome: " + nome);
		System.out.println("CNH: " + cnh);
		System.out.println("Tempo de experiência: " + experiencia);
	}
	
}
