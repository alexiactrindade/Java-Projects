package FuncionariosHotel;

public class FuncionarioHotel {

	protected String nome; 
	protected double salario; 
	protected String turno; 
	protected String matricula;
	
	public FuncionarioHotel(String nome, double salario, String turno, String matricula) {
		this.nome = nome;
		this.salario = salario;
		this.turno = turno;
		this.matricula = matricula;
	} 
	
	public void mostrarDados() { 
		System.out.println("Nome: " + this.nome);
		System.out.println("Salário: " + this.salario);
		System.out.println("Turno: " + this.turno);
		System.out.println("Matrícula: " + this.matricula);
	}
	
}
