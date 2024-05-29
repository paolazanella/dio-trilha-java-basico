
public class FormatadorCepExemplo {

    public static void main(String[] args) {
        try {
            String cepFormatado = formatarCep("23765064");
        } catch (CepInvalidoException e) {
            // TODO Auto-generated catch block
            System.out.println("O cep nao corresponde com a regra de nogocio");
        }

    }

    static String formatarCep(String cep) throws CepInvalidoException {
        if (cep.length() != 8) {
            throw new CepInvalidoException();

        } //simulando u ceo formatado
        return "23.765-064";
    }

}
