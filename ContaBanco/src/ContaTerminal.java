
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        // Criar uma instância da classe Conta
        try (Scanner scanner = new Scanner(System.in)) {
            // Criar uma instância da classe Conta
            Conta conta = new Conta();
            // Solicitar ao usuário que insira o número da agência
            System.out.println("Por favor, digite o número da Agência:");
            conta.setAgencia(scanner.nextLine());
            // Solicitar ao usuário que insira o número da conta
            System.out.println("Por favor, digite o número da Conta:");
            conta.setNumero(scanner.nextInt());
            scanner.nextLine(); // Limpar o buffer do scanner
            // Solicitar ao usuário que insira o nome do cliente
            System.out.println("Por favor, digite o nome do Cliente:");
            conta.setNomeCliente(scanner.nextLine());
            // Solicitar ao usuário que insira o saldo
            System.out.println("Por favor, digite o saldo:");
            conta.setSaldo(scanner.nextDouble());
            // Exibir a mensagem de confirmação com as informações fornecidas pelo usuário
            conta.exibirMensagem();
            // Fechar o scanner
        }
    }
}