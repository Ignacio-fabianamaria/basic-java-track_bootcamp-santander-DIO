package estruturasRepetiçao;
import java.util.Scanner;
public class CarrinhoCompras {
    public static void main(String[] args) {
        double mesada = 50.0;
        double totalDosDoces = 0.0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo ao carrinho de compras!");

        while (totalDosDoces < mesada) {
            System.out.print("Digite o preço do doce (ou 0 para sair): ");
            double precoDoce = scanner.nextDouble();

            if (precoDoce <= 0) {
                break; 
            }

            if (totalDosDoces + precoDoce <= mesada) {
                totalDosDoces += precoDoce;
                System.out.println("Doce adicionado ao carrinho. Total gasto: " + totalDosDoces + " reais.");
            } else {
                System.out.println("Você atingiu o limite da mesada. Não é possível adicionar mais doces.");
            }
        }
        scanner.close();

        System.out.println("Total gasto em doces: " + totalDosDoces + " reais.");
        System.out.println("Obrigado por usar o carrinho de compras!");
    }
    
}
