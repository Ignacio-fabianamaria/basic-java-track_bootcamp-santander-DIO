package estruturasCondicionais;

public class VerificadorDeNumero {
    public static void main(String[] args){
        int numero = -1;
        String resultado = (numero >0) ? "Positivo" : (numero < 0) ? "Negativo" : "É zero !";
        System.out.println(resultado);
    }
}
