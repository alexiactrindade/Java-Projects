package composicao;

public class Motor {
	private int potenciaCavalos; 
	private String combustivel; 
	private String descricao;
	
	public Motor(String combustivel, String descricao, int potenciaCavalos) {
		this.potenciaCavalos = potenciaCavalos;
		this.combustivel = combustivel;
		this.descricao = descricao;
	}

	public int getPotenciaCavalos() {
		return potenciaCavalos;
	}

	public void setPotenciaCavalos(int potenciaCavalos) {
		this.potenciaCavalos = potenciaCavalos;
	}

	public String getCombustivel() {
		return combustivel;
	}

	public void setCombustivel(String combustivel) {
		this.combustivel = combustivel;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public void exibirDetalhes () { 
		System.out.println("Potência em cavalos: " + potenciaCavalos);
		System.out.println("Combustível: " + combustivel);
		System.out.println("Descrição: " + descricao); 
	}
	

}
