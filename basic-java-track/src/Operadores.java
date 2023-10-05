public class Operadores {
    public static void main(String[] args){
        String fullName = "LINGUAGEM" + "JAVA";
        System.out.println("Concatenação de strings: "+fullName);

        // Exemplos de operadores aritméticos
        int a = 10;
        int b = 5;
        int soma = a + b;
        int subtracao = a - b;
        int multiplicacao = a * b;
        int divisao = a / b;
        int resto = a % b;

        // Exemplos de operadores unários
        int x = 5;
        int y = -x;
        x++; // Incremento
        y--; // Decremento

        // Exemplos de operadores relacionais
        boolean isEqual = a == b;
        boolean isNotEqual = a != b;
        boolean isGreater = a > b;
        boolean isLess = a < b;
        boolean isGreaterOrEqual = a >= b;
        boolean isLessOrEqual = a <= b;

        // Exemplos de operadores lógicos
        boolean condition1 = true;
        boolean condition2 = false;
        boolean andResult = condition1 && condition2; // AND lógico
        boolean orResult = condition1 || condition2;   // OR lógico
        boolean notResult = !condition1;               // NOT lógico

        // Exemplos de operadores ternários
        int age = 18;
        String status = (age >= 18) ? "Maior de idade" : "Menor de idade";

        // Exemplos de operadores de atribuição
        int value = 10;
        value += 5; // Equivalente a value = value + 5;
        String name = "João";
        name += " Silva"; // Concatenação de strings

        // Exibindo os resultados
        System.out.println("Soma: " + soma);
        System.out.println("Subtração: " + subtracao);
        System.out.println("Multiplicação: " + multiplicacao);
        System.out.println("Divisão: " + divisao);
        System.out.println("Resto: " + resto);
        System.out.println("Incremento x: " + x);
        System.out.println("Decremento y: " + y);
        System.out.println("Igual: " + isEqual);
        System.out.println("Diferente: " + isNotEqual);
        System.out.println("Maior: " + isGreater);
        System.out.println("Menor: " + isLess);
        System.out.println("Maior ou igual: " + isGreaterOrEqual);
        System.out.println("Menor ou igual: " + isLessOrEqual);
        System.out.println("AND lógico: " + andResult);
        System.out.println("OR lógico: " + orResult);
        System.out.println("NOT lógico: " + notResult);
        System.out.println("Status: " + status);
        System.out.println("Valor: " + value);
        System.out.println("Nome: " + name);
    }
}