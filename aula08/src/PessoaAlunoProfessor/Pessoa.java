package PessoaAlunoProfessor;

public class Pessoa {
	protected String nome; 
	protected int idade;
	protected long cpf; 
	
	public Pessoa(String nome, int idade, long cpf) {
		this.nome = nome;
		this.idade = idade;
		this.cpf = cpf;
	} 
	
	public void mostrarDados() { 
		System.out.println("Nome: " + this.nome);
		System.out.println("Idade: " + this.idade);
		System.out.println("CPF: " + this.cpf);

		
	}
}