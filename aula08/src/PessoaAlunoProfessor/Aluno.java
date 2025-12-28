package PessoaAlunoProfessor;

public class Aluno extends Pessoa {
	public String matricula;

	public Aluno(String nome, int idade, long cpf, String matricula) {
		super(nome, idade, cpf);
		this.matricula = matricula;
	}

	public void mostrarDadosAluno() { 
		System.out.println("Nome: " + this.nome);
		System.out.println("Idade: " + this.idade);
		System.out.println("CPF: " + this.cpf);
		System.out.println("Matrícula: " + matricula);
	
	}
}
