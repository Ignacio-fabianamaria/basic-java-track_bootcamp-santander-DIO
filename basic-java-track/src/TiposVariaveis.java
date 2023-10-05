public class TiposVariaveis {
    public static void main(String[] args) {
        int idade = 30;
        double altura = 1.75;
        float salario = 2500.50f; // Lembre-se de adicionar 'f' ao final para indicar um float
        long populacao = 8293498237L; // Lembre-se de adicionar 'L' ao final para indicar um long
        String nome = "Alice";
        boolean isEstudante = true;

        // Exemplos de constantes (usando a palavra-chave 'final')
        final int ANO_ATUAL = 2023;
        final double PI = 3.14159265359;
        final String NOME_EMPRESA = "Minha Empresa";

        // Exibindo os valores das variáveis e constantes
        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura);
        System.out.println("Salário: " + salario);
        System.out.println("População: " + populacao);
        System.out.println("Nome: " + nome);
        System.out.println("É estudante? " + isEstudante);
        System.out.println("Ano atual: " + ANO_ATUAL);
        System.out.println("Valor de PI: " + PI);
        System.out.println("Nome da empresa: " + NOME_EMPRESA);

        // Exemplo de reatribuição em variável (não pode ser feito em constante)
        idade = 35;
        System.out.println("Nova idade: " + idade);

        // Exemplo de cálculo usando constantes
        double raio = 5.0;
        double areaCirculo = PI * raio * raio;
        System.out.println("Área do círculo: " + areaCirculo);
    }
}
