public class MinhaClass {
    public static void main(String [] args) {
    System.out.println("Ola turma, sejam bem-vindos");  
      String primeiroNome= "gleyson"; 
      String segundoNome= "sampaio";
      
      String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
      System.err.println(nomeCompleto);
    }
    public static String nomeCompleto (String primeiroNome, String segundoNome){
        return primeiroNome.concat(" ").concat(segundoNome);
    }
}
