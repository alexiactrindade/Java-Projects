package aula06.encapsulamento;

public class Usuario {
	private String nome; 
	public String email; 
	public String senha; 
	public boolean permissaoAcesso;
	private double saldo; 
	
	public Usuario(String nome, String email, String senha, 
		boolean permissaoAcesso) {
		this.setNome(nome);
		this.email = email;
		this.senha = senha;
		this.permissaoAcesso = permissaoAcesso;
		this.saldo = 0; 
	} 
	
	void exibirDados() { 
		System.out.println("User: " + nome);
		System.out.println("E-Mail: " + email);
		System.out.println("Senha: " + senha);
		System.out.println("Permissão de Acesso : " + permissaoAcesso);
		System.out.println("Saldo: " + saldo);
	}
	
	public void depositar(double valor) { 
		this.saldo = saldo + valor;
	}
	
	
	public double getSaldo() { 
		return this.saldo;
}
	public void setSaldo(double saldo) { 
		this.saldo = saldo; 	
	}
	
	public void setNome (String nome) { 
		this.nome = nome.toUpperCase(); 
	}
	
	public String getNome() { 
		return this.nome;
	}
	
} 