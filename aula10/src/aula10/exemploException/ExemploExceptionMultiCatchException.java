package aula10.exemploException;

public class ExemploExceptionMultiCatchException {
	
	public static void main(String[] args) {
		int[] numeros = null; 
		try {
			numeros[3] = 15; 
		} catch (ArrayIndexOutOfBoundsException | NullPointerException e ) {
			System.out.println("Erro na operação com array");
		} catch (Exception e) { 
			System.out.println("Erro inesperado: " + e.getMessage());
		}
	}
}
