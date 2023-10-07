package tratamentoExceçoes;

import java.util.Scanner;

public class FormatadorCep {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o CEP (8 dígitos): ");
        String cep = scanner.nextLine();
        scanner.close();

        try {
            String cepFormatado = formatarCep(cep);
            System.out.println("CEP formatado: " + cepFormatado);
        } catch (CepInvalidoException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

    static String formatarCep(String cep) throws CepInvalidoException {
        if(cep.length() != 8)
        throw new CepInvalidoException("O CEP deve possuir exatamente 8 dígitos.");
        return cep.substring(0, 2) + "." + cep.substring(2, 5) + "-" + cep.substring(5);
        }
    
}
