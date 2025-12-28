package aula10.exemploException;

public class Calculadora {

	public int dividir (int x, int y) { 
		if (y <=0) { 
			throw new ErroNaDivisaoPorZeroException
			("Não é possível dividir por um número igual ou menor que zero!");
		} 
		int resultado = x/y; 
		return resultado; 
	}
	
	public int dividirChecked(int x, int y) throws ErroNaDivisaoPorZeroCheckedException { 
		if (y <= 0) { 
			throw new ErroNaDivisaoPorZeroCheckedException("Não é possível dividir por zero");
			
		}
		int resultado = x/y; 
		return resultado; 
	}
}
