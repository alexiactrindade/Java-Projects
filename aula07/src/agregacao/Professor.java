package agregacao;

public class Professor {

	private String nome; 
	private String matricula; 
	private boolean mestrado;
	private int idade;
	private int anosExperiencia;
	public Professor(String nome, String matricula, boolean mestrado, int idade, int anosExperiencia) {
		this.nome = nome;
		this.matricula = matricula;
		this.mestrado = mestrado;
		this.idade = idade;
		this.anosExperiencia = anosExperiencia;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public boolean isMestrado() {
		return mestrado;
	}
	public void setMestrado(boolean mestrado) {
		this.mestrado = mestrado;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public int getAnosExperiencia() {
		return anosExperiencia;
	}
	public void setAnosExperiencia(int anosExperiencia) {
		this.anosExperiencia = anosExperiencia;
	} 
	
	public void imprimirDados() {
			
		//	this.nome = nome;
		//	this.matricula = matricula;
		//	this.mestrado = mestrado;
		//	this.idade = idade;
		//	this.anosExperiencia = anosExperiencia;
			
		System.out.println("Nome: " + nome);
		System.out.println("Matrícula: " + matricula);
		System.out.println("Mestrado: " + (mestrado? "sim": "nao"));
		System.out.println("Idade: " + idade);
		System.out.println("Anos de experiência: " + anosExperiencia + " anos");
	
}
} 

