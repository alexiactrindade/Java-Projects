package aula10.exemploException;

public class App {

	public static void main(String[] args) {
		Calculadora calculadora = new Calculadora(); 
		// Usando um método que pode lançar um exceção unchecked 
		// (Exceção que herda de RunTimeException)
		int resultado = calculadora.dividir(10, 0);
		System.out.println("Resultado: " + resultado);
		
		// Usando um método que pode lançar um exceção checked 
		// (Exceção que herda de Exception) 
		// É obrigatório fazer tratamento de exceção
		
		try { 
			int resultado2 = calculadora.dividirChecked(10, resultado);
			System.out.println("Resultado: " + resultado2);
		} catch (Exception e) {
			System.out.println("Erro ao executar cálculo! " + e.getMessage());
		}
	}
}
