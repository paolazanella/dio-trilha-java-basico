public class ResultadoEscolca{
    
    public static void main(String[] args) {
        int nota =10;
        if(nota >=7){
            System.out.println("Aprovado");
        }else if (nota >=  5 &&  nota < 7){ // smepre tem que retorcar ou true ou false 
            System.out.println("Prova Recuperacao");
        }else {
            System.out.println("Reprovado");
        }
    }
}