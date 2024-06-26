package candidatura;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcesoSeletivo {

    public static void main(String[] args) {
        /* analisarCandidato(1900.0);
        analisarCandidato(2200.0);
        analisarCandidato(2000.0); */

        // selecaoCandidato();
        //imprimirSelecionados();
        String[] candidatos = {"Felipe", "Marcia", "Julia", "Pailo", "Ahusto"};
        for (String candidato : candidatos) {
            entrandoEmConato(candidato);

        }
    }

    static void entrandoEmConato(String candidato) {
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;
        do {
            atendeu = atender();
            continuarTentando = !atendeu;
            if (continuarTentando) {
                tentativasRealizadas++;
            } else {
                System.out.println("Contato realizado com sucesso!");
            }
        } while (continuarTentando && tentativasRealizadas < 3);
        if (atendeu) {
            System.out.println("Conseguimos contato com " + candidato + " na " + tentativasRealizadas + " tentativa");
        } else {
            System.out.println("Nao conseguimos contato com " + candidato + " , numero maximo de tentativas " + tentativasRealizadas + " reazadas");

        }

    }

    //metodo auxiliar
    static boolean atender() {
        return new Random().nextInt(3) == 1;
    }

    static void imprimirSelecionados() {
        String[] candidatos = {"Felipe", "Marcia", "Julia", "Pailo", "Ahusto"};
        System.out.println("Imprimindo a lista de candidatos informando o indice do elemento");
        for (int indice = 0; indice < candidatos.length; indice++) {
            System.out.println("O candidato de n " + (indice + 1) + " é  o " + candidatos[indice]);
        }

        System.out.println("\nForma abreviada de interacao for each:\n");

        for (String canditado : candidatos) {
            System.out.println("O candidato selecionado foi " + canditado);
        }

    }

    static void selecaoCandidato() {

        String[] candidatos = {"Felipe", "Marcia", "Julia", "Pailo", "Ahusto", "Monica", "Fabricio", "Mirela", "DAniela", "Jorge"};

        int candidatoSelecinados = 0;
        int candidatoAtul = 0;
        double salarioBase = 2000.0;
        while (candidatoSelecinados < 5 && candidatoAtul < candidatos.length) {
            String candidato = candidatos[candidatoAtul];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato" + candidato + " Solicitou este valor de salario " + salarioPretendido);
            if (salarioBase >= salarioPretendido) {
                System.out.println("O candidato" + candidato + " foi selecinado para a vaga");
                candidatoSelecinados++;
            }
            candidatoAtul++;

        }

    }

    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static void analisarCandidato(double salarioPretendido) {
        double salarioBase = 2000.0;
        if (salarioBase > salarioPretendido) {
            System.out.println("Ligar para o candidato");
        } else if (salarioBase == salarioPretendido) {
            System.out.println("Ligar para o canditado com contra proposta");
        } else {
            System.out.println("Agradando os resultados dos demis canditados");
        }

    }
}
