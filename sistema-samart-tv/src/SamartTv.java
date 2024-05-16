public class SamartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void mudarCanal(int novoCanal){

        canal = novoCanal;
    }

    public void  aumentarCanal(){
        canal++;
        System.out.println("Mudando canal para:"+canal);
    }

    public void diminuirCanal(){
        canal--;
        System.out.println("mudando canal para:"+canal);
    }

    public void aumentarVolume(){

        //volume=vomulume +1;
        volume ++;
        System.out.println("Aumentando o volume para: "+volume);
    }

    public  void diminuirVolume(){
        //volume = volume -1;
        volume --;
        System.out.println("diminuindo o volume para: "+volume);
    }
    public void ligar(){
        ligada = true;
    } 

    public void desligar(){
        ligada = false;
    }
}
