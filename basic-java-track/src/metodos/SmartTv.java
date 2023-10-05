package metodos;

public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void ligar(){
        ligada = true;
    }
    public void desligar(){
        ligada = false;
    }

    public void aumentarVolume(){
        volume++;
        System.out.println("Aumentando o volume para : " + volume);
    }
     public void diminuirVolume(){
        volume--;
        System.out.println("Dimunuindo o volume para : " + volume);
    }

    public void mudarCanal(int novoCanal){
        canal = novoCanal;
        System.out.println("Mudando para o canal: " + canal);
    }
    public void aumentarCanal(){
        canal++;
        System.out.println("Aumentando de canal: " + canal);
    }
    public void diminuirCanal(){
        canal--;
        System.out.println("Dimunuindo de canal: " + canal);
    }
}
