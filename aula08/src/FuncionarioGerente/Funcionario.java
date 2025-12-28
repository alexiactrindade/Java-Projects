package FuncionarioGerente;

public class Funcionario {
	protected String nome; 
	protected double salarioBase; 
	protected String cargo; 
	protected String departamento;
	
	public Funcionario(String nome, double salarioBase, String cargo, String departamento) {
		this.nome = nome;
		this.salarioBase = salarioBase;
		this.cargo = cargo;
		this.departamento = departamento;
	} 
	
	public void mostrarDados() { 
		System.out.println("Nome: " + this.nome);
		System.out.println("Salário: " + this.salarioBase);
		System.out.println("Cargo: " + this.cargo);
		System.out.println("Departamento " + this.departamento);

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(double salarioBase) {
		if (salarioBase<0) {
			throw new IllegalArgumentException ("O salário base não pode ser negativo");	
		}
		this.salarioBase = salarioBase;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	
	
	
	
}
