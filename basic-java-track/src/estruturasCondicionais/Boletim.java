package estruturasCondicionais;

public class Boletim {
    public static void main(String[] args) {
        int nota = 6;

        // Condicional Encadeado
        if (nota >= 7)
            System.out.println("Aprovado");
        else if (nota >=5 && nota < 7)
            System.out.println("Recuperação"); 
        else
            System.out.println("Reprovado");

    }

}
