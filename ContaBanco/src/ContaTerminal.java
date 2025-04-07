import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // Inferface do usuário
    
    System.out.println("Por favor, digite o número da Conta: ");
    int numero = sc.nextInt();
    sc.nextLine();

    System.out.println("Por favor, digite o número da Agência: ");
    String agencia = sc.nextLine();

    System.out.println("Ditige o seu Nome: ");
    String nomeCliente = sc.nextLine();


    System.out.println("Por favor, digite o saldo inicial:");
    double saldo = sc.nextDouble();

    // Exibindo a mensagem final
    System.out.println("\nOlá " + nomeCliente + 
                       ", obrigado por criar uma conta em nosso banco. " +
                       "Sua agência é " + agencia + 
                       ", conta " + numero + 
                       " e seu saldo " + saldo + " já está disponível para saque.");

    // Fechando o Scanner
    sc.close();

    }
}
