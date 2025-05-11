import java.util.Locale;
import java.util.Scanner;

public class BancoDigital {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu nome");
        String nome = scanner.nextLine(); 

        System.out.println ("Digite o número da sua agência. Sem caracteres especiais");
        int agencia = scanner.nextInt (); 

        System.out.println ("Digite o número da sua conta. Sem caracteres especiais"); 
        int conta = scanner.nextInt (); 

        System.out.println ("Quanto que você deseja retirar de saldo?");
        double saldo = scanner.nextDouble (); 

        System.out.println ("Olá, " + nome + "! Obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta nº" + conta + " e o saldo de" + saldo + "já está disponível para saque." );
        scanner.close();
    }
}
