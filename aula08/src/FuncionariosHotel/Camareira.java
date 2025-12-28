package FuncionariosHotel;

public class Camareira extends FuncionarioHotel {

	public int andaresResponsaveis; 
	public String uniforme;
	
	public Camareira(String nome, double salario, String turno, String matricula, int andaresResponsaveis,
			String uniforme) {
		super(nome, salario, turno, matricula);
		this.andaresResponsaveis = andaresResponsaveis;
		this.uniforme = uniforme;
	} 
	
	public void mostrarDadosCamareira() { 
		System.out.println("Nome: " + this.nome);
		System.out.println("Salário: " + this.salario);
		System.out.println("Turno: " + this.turno);
		System.out.println("Matrícula: " + this.matricula);
		System.out.println("Andares responsáveis " + andaresResponsaveis);
		System.out.println("Uniforme: " + uniforme);

	}
	
}
