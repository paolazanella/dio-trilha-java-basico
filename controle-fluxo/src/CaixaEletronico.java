public class CaixaEletronico {
    public static void main(String[] args) {

        double saldo= 25.0;
        double valorSoliciatado=22.0;

        if(valorSoliciatado < saldo){
            saldo = saldo - valorSoliciatado;
            System.out.println("Novo saldo " + saldo);
        }else{
            System.out.println("Saldo insuficiente");
        }
    
    }
}
