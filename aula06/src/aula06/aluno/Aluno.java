package aula06.aluno;

public class Aluno {
	Long id;
	String nome; 
	int matricula; 
	String classe; 
	int idade; 
	String email; 
	String cpf; 
	String estado;
	String cidade; 
	
	Aluno(String nome, int matricula, 
			String classe, int idade, String email, 
			String cpf, String estado, String cidade){ 
		this.nome = nome; 
		this.matricula = matricula; 
		this.classe = classe; 
		this.idade = idade; 
		this.email = email; 
		this.cpf = cpf;
		this.estado = estado; 
		this.cidade = cidade; 
	}
	
	void exibirDados() {
		System.out.println("------Sobre o aluno------");
		System.out.println("Nome: " + nome); 
		System.out.println("Nº matricula: " + matricula);
		System.out.println("Classe: " + classe);
		System.out.println("Idade: " + idade);
		System.out.println("E-Mail: " + email);
		System.out.println("CPF: " + cpf);
		System.out.println("Estado:  " + estado);
		System.out.println("Cidade: " + cidade);
	}
}
