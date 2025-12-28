package FuncionariosHotel;

public class Recepcionista extends FuncionarioHotel {
	
	public String idiomasFalados; 
	public boolean usaSistemasReserva;

	public Recepcionista(String nome, double salario, String turno, String matricula, String idiomasFalados,
			boolean usaSistemasReserva) {
		super(nome, salario, turno, matricula);
		this.idiomasFalados = idiomasFalados;
		this.usaSistemasReserva = usaSistemasReserva;
	} 
	
	public void mostrarDadosRecepcionista() { 
		System.out.println("Nome: " + this.nome);
		System.out.println("Salário: " + this.salario);
		System.out.println("Turno: " + this.turno);
		System.out.println("Matrícula: " + this.matricula);
		System.out.println("Idiomas: " + idiomasFalados);
		System.out.println("Usa sistema reserva? " + usaSistemasReserva);

	}
	
	
	

}
