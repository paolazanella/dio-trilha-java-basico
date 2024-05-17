public class Conta{

    private  int numero;
    private String agencia;
    private String nomeCliente;
    private double saldo;
    
     // Método para definir o número da conta
     public void setNumero(int numero) {
        this.numero = numero;
    }

    // Método para obter o número da conta
    public int getNumero() {
        return numero;
    }

    // Método para definir a agência
    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    // Método para obter a agência
    public String getAgencia() {
        return agencia;
    }

    // Método para definir o nome do cliente
    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    // Método para obter o nome do cliente
    public String getNomeCliente() {
        return nomeCliente;
    }

    // Método para definir o saldo
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    // Método para obter o saldo
    public double getSaldo() {
        return saldo;
    }

    // Método para exibir uma mensagem de confirmação
    public void exibirMensagem() {
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");
    }
}