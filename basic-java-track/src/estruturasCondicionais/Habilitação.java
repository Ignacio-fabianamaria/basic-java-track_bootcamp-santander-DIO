package estruturasCondicionais;

public class Habilitação {
    public static void main(String[] main){
        int idade = 18;
        String resultado = (
            idade >=18 ? "Idade apropriada para ter habilitação" : "Menor de idade"
            );
        System.out.println(resultado);
    }
}
