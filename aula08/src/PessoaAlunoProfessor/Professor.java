package PessoaAlunoProfessor;

public class Professor extends Pessoa {
	public String disciplina;

	public Professor(String nome, int idade, long cpf, String disciplina) {
		super(nome, idade, cpf);
		this.disciplina = disciplina;
	} 
	
	public void mostrarDadosProfessor() { 
		System.out.println("Nome: " + this.nome);
		System.out.println("Idade: " + this.idade);
		System.out.println("CPF: " + this.cpf);
		System.out.println("Disciplina: " + disciplina);
	
	}
}
