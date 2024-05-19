
import java.util.concurrent.ThreadLocalRandom;



public class ExemploWhile {
    public static void main(String[] args) {
        double mesada =50.0;
        while (mesada > 0){
            Double valorDoce = valorAleatorio();
            if(valorDoce > mesada)
                valorDoce = mesada;
            System.out.println("Doce do valor: " +valorDoce + " Adicinado no carrinho ");
            mesada = mesada - valorDoce;
        }
        System.out.println("Messada:" + mesada);
        System.out.println("Jaozinho gastou toda a sua mesada em doces");

        /*
         * Nao se preocupe quanto a formatacao de valores 
         * Iremos explocar os recursos de formatacao em breve!!
         */
    }
    private static double valorAleatorio(){
        return ThreadLocalRandom.current().nextDouble(2,15);
    }
}




