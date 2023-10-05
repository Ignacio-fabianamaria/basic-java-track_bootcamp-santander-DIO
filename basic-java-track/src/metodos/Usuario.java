package metodos;

public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();

        System.out.println("________Exibindo o Status da SmartTv________");
        System.out.println("Status da TV: " + smartTv.ligada);
        System.out.println("Canal atual da TV: " + smartTv.canal);
        System.out.println("Volume atual da TV: " + smartTv.volume);

        System.out.println("________Ligando e desligando a SmartTv________");
        smartTv.ligar();
        System.out.println("Ligando a TV :" + smartTv.ligada);
        smartTv.desligar();
        System.out.println("Desligando a TV: " + smartTv.ligada);
        smartTv.ligar();
        System.out.println("Ligando a TV :" + smartTv.ligada);

        System.out.println("________Aumentando e diminuindo o volume da SmartTv________");
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.diminuirVolume();
        
        System.out.println("________Alterando o canal da SmartTv________");
        System.out.println("Canal atual: " + smartTv.canal);
        smartTv.aumentarCanal();
        smartTv.diminuirCanal();
        smartTv.mudarCanal(4);
    }
}
