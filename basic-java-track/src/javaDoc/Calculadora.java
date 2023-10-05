package javaDoc;

/**
 * <h1>Calculadora</h1>
 * A Calculadora realiza operações matemáticas entre números inteiros.
 * <p>
 * <b>Note:</b> Leia atentamente a documentação desta classe para desfrutar dos recursos oferecidos pelo autor.
 *
 * @author  Ignácio Fabiana
 * @version 1.0
 * @since   05/10/2023
 */
public class Calculadora {
    /**
     * Este método é utilizado para somar dois números inteiros.
     *
     * @param numeroUm   Este é o primeiro parâmetro do método, representando o primeiro número a ser somado.
     * @param numeroDois Este é o segundo parâmetro do método, representando o segundo número a ser somado.
     * @return int O resultado deste método é a soma dos dois números.
     */
    public int somar(int numeroUm, int numeroDois) {
        return numeroUm + numeroDois;
    }

    /**
     * Este método é utilizado para subtrair dois números inteiros.
     *
     * @param numeroUm   Este é o primeiro parâmetro do método, representando o número do qual subtrair.
     * @param numeroDois Este é o segundo parâmetro do método, representando o número a ser subtraído.
     * @return int O resultado deste método é a subtração de numeroUm por numeroDois.
     */
    public int subtrair(int numeroUm, int numeroDois) {
        return numeroUm - numeroDois;
    }

    /**
     * Este método é utilizado para multiplicar dois números inteiros.
     *
     * @param numeroUm   Este é o primeiro parâmetro do método, representando o primeiro número a ser multiplicado.
     * @param numeroDois Este é o segundo parâmetro do método, representando o segundo número a ser multiplicado.
     * @return int O resultado deste método é a multiplicação dos dois números.
     */
    public int multiplicar(int numeroUm, int numeroDois) {
        return numeroUm * numeroDois;
    }

    /**
     * Este método é utilizado para dividir dois números inteiros.
     *
     * @param numeroUm   Este é o primeiro parâmetro do método, representando o número a ser dividido.
     * @param numeroDois Este é o segundo parâmetro do método, representando o número pelo qual dividir.
     * @return double O resultado deste método é a divisão de numeroUm por numeroDois.
     * @throws ArithmeticException Se a divisão por zero for tentada.
     */
    public double dividir(int numeroUm, int numeroDois) {
        if (numeroDois == 0) {
            throw new ArithmeticException("Não é possível dividir por zero.");
        }
        return (double) numeroUm / numeroDois;
    }
}
