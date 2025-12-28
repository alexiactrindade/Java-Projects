package conversorIdade;
import java.util.InputMismatchException;
import java.util.Scanner; 

public class ConversorIdade { 
	public static void main(String[] args) {
		
		System.out.println("Qual é a sua idade?");
		Scanner sc = new Scanner(System.in); 
		
		
		try {
			int idade = sc.nextInt(); 
			System.out.println("Sua idade é : " + idade);
		} 
		
		catch (InputMismatchException e) { 
			System.out.println("Erro ao executar operação: idade deve ser um número inteiro");
		} 
		
		sc.close();
	}
}