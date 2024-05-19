public class PlanoOperadora {
    public static void main(String[] args) {
        String plano = "M";

       switch (plano){
            case "T":{
                System.out.println("5Gb Youtube");//sem o break ele vai mostra os outros casos junto           
            }
            case "M":{
                System.out.println("Whats e Intagram gratis");
            }
            case "B":{
                System.out.println("100 minutos de ligacao");
            }
        }
    }
}
