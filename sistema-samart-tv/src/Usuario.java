public class Usuario {
    
    public static void main(String[] args) throws Exception {

        SamartTv smartTv = new SamartTv();

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();

        smartTv.mudarCanal(13);
        System.out.print("canal atual:"+ smartTv.canal);

        System.out.println("TV ligada?" + smartTv.ligada);
        System.out.println("volume autal:" +smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo status->TV ligada?" + smartTv.ligada);

        smartTv.desligar();
        System.out.println("Novo status->TV ligada?" + smartTv.ligada);
    }
}
