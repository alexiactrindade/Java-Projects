package VeiculosMotorista;

public class Motorista {
	public String nome; 
	public String cnh; 
	public int experienciaAnos;
	
	public Motorista(String nome, String cnh, int experienciaAnos) {
		this.nome = nome;
		this.cnh = cnh;
		this.experienciaAnos = experienciaAnos;
	} 
	
    public String getNome() {
        return nome;
    }

    public String getCnh() {
        return cnh;
    }

    public int getExperienciaAnos() {
        return experienciaAnos;
    }
}
