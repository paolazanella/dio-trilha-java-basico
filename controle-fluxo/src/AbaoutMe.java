
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;




public class AbaoutMe {
    public static void main(String[] args) {


        try {

             //criando o obejeto scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu nome");
        String nome = scanner.next();

        System.out.println("Digite seu sobrenome");
        String sobrenome = scanner.next();

        System.out.println("Digite sua idade");
        int idade = scanner.nextInt();

        System.out.println("Digite sua altura");
        int altura = scanner.nextInt();

        // imprimindo os dados obtidos pelo usuario

        System.out.println("Ola meu me chamo "+ nome.toUpperCase() + " " + sobrenome);
        System.out.println("Tenho " + idade + " anos ");
        System.out.println("Mibha altura é " + altura + "cm");
        scanner.close();
            
        } catch (InputMismatchException e) {
            System.err.println("Idade e altura preciçao ser numericos");
        }
                


    }
}
