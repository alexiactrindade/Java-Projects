package FuncionarioGerente;

public class Gerente extends Funcionario {
	
	public double bonus; 
	public int numeroEquipe; 
	public String nivelGestao;
	

	public Gerente(String nome, double salarioBase, String cargo, String departamento, double bonus, int numeroEquipe,
			String nivelGestao) {
		super(nome, salarioBase, cargo, departamento);
		this.bonus = bonus;
		this.numeroEquipe = numeroEquipe;
		this.nivelGestao = nivelGestao;
	}


	public void mostrarDadosGerente() { 
		System.out.println("Nome: " + this.nome);
		System.out.println("Salário: " + this.salarioBase);
		System.out.println("Cargo: " + this.cargo);
		System.out.println("Departamento " + this.departamento);
		System.out.println("Bônus: " + bonus); 
		System.out.println("Número da equipe: " + numeroEquipe);
		System.out.println("Nível de Gestão: " + nivelGestao);

	}
	
	public void calcularParticipacaoDeLucro () { 
		double plr = this.salarioBase * 3; 
		this.salarioBase=-1000;
		System.out.println("Participação calculada: " + plr);
	}
}
