package estruturasCondicionais;

public class CaixaEletronico {
    public static void main(String[] args){
        double saldo = 25.0;
        double valorSolicitado = 17.5;

        // Condicional Simples
        if(valorSolicitado < saldo){
            saldo = saldo - valorSolicitado;
            System.out.println("Resultado do fluxo simples: " + saldo);
        }
    }
}
