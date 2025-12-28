package PessoaAlunoProfessor;

public class App {

	public static void main(String[] args) {
		Aluno aluno = new Aluno("Alexia", 26, 87654321, "A123"); 
		Professor professor = new Professor ("Gerônimo", 45, 12345678, "Matemática");

		System.out.println("===Aluno===");
		aluno.mostrarDadosAluno(); 
		System.out.println("===Professor===");
		professor.mostrarDadosProfessor();
	}
}