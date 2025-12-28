package aula10.exemploException;

public class ExemploException2 {
	
	public static void main(String[] args) {
		int[] numeros = null; 
		try {
			numeros[3] = 15; 
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Erro: o índice usado não existe no array");
		} catch (NullPointerException e ) {
			System.out.println("O array números está nulo");
		} catch (Exception e) { 
			System.out.println("Erro inesperado: " + e.getMessage());
		}
	}
}
