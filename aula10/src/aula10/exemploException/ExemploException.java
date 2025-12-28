package aula10.exemploException;
public class ExemploException {

	public static void main(String[] args) {
		int x = 50;
		int y = 0; 
		
		try {
			int resultado = x/y; 
			System.out.println("Resultado: " + resultado);
		} 
		
		catch (ArithmeticException e) { 
			System.out.println("Erro ao executar operação: impossível dividir por zero");
		} 
		
		catch (Exception e) { 
			System.out.println("Erro desconhecido." + e.getMessage());
		}
		
	}	
} 