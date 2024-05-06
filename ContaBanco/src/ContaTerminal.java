import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class ContaTerminal {
    public static void main(String[] args) {

        // variaveis
        int numero = 1021;
        double saldo = 237.48;

        // Importação do Scanner para coleta de informações
        Scanner scanner = new Scanner(System.in);

        // Coleta do nome do cliente
        System.out.println("SEJA VEM VINDO AO NOSSO BANCO DIGITAL");
        System.out.println("Por favor, nos informe seu nome: ");
        String nome = scanner.nextLine();

        // Coleta do numero da conta do cliente
        System.out.println("OBRIGADO!");
        System.out.println("Para finalizar a criação da sua conta, digite a agencia de sua preferencia: ");
        String agencia = scanner.nextLine();

        // Confirmação do cadastro do cliente
        System.out.println("Olá ," + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");

    }
}