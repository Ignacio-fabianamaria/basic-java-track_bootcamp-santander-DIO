# TRATAMENTO DE EXCEÇÕES EM JAVA

`Exceções`, em programação, são eventos ou condições anormais que ocorrem durante a execução de um programa e que podem interromper o fluxo normal de execução. Elas representam situações imprevistas ou erros que podem ocorrer em um programa, como operações matemáticas inválidas, tentativas de acessar uma parte de memória que não está disponível, erros de entrada/saída, entre outros.

O `tratamento de exceções` tem como finalidade principal lidar com problemas de maneira controlada durante a execução de um programa, em vez de permitir que o programa quebre abruptamente.
**Quando uma exceção ocorre, o programa pode:**

- **Capturar a Exceção**: Isso envolve a utilização de blocos try-catch para identificar a exceção específica que ocorreu e executar código de tratamento apropriado para lidar com ela.

- **Tomar Medidas Apropriadas**: Dependendo da exceção e da situação, o programa pode tomar medidas adequadas, como exibir mensagens de erro informativas para o usuário, registrar informações detalhadas sobre o erro em logs ou tomar ações corretivas para tentar recuperar-se do erro.

- **Continuar a Execução**: Em alguns casos, após lidar com a exceção, o programa pode continuar sua execução normal ou executar uma lógica alternativa para mitigar os efeitos da exceção.

- **Encerrar o Programa de Maneira Ordenada**: Em situações extremas em que a recuperação não é possível ou segura, o programa pode ser encerrado de maneira controlada, garantindo que todos os recursos sejam liberados adequadamente.

| Tipo de Exceção                        | Descrição                                            |
|---------------------------------------|------------------------------------------------------|
| Exceções de Tempo de Execução          |                                                    |
| `NullPointerException`                | Acesso a objeto nulo.                               |
| `ArrayIndexOutOfBoundsException`      | Índice fora dos limites do array.                   |
| `ArithmeticException`                 | Operações matemáticas inválidas, como divisão por zero. |
| `ClassCastException`                  | Conversão de tipo inválida.                          |
| Exceções Verificadas                  |                                                    |
| `IOException`                         | Erros de E/S (entrada/saída), como leitura/gravação de arquivos. |
| `SQLException`                        | Erros relacionados a banco de dados.                |
| `FileNotFoundException`             | Arquivo não encontrado.                             |

## TRY CATCH

Em Java, o bloco `try-catch` é uma construção fundamental para lidar com exceções de forma controlada. Ele permite que você coloque código que pode lançar exceções dentro de um bloco `try`, e se uma exceção ocorrer, você pode capturá-la e lidar com ela em um bloco `catch` correspondente.
Sintaxe do bloco try-catch:

```java
try {
    // Código que pode lançar uma exceção
} catch (TipoDeExcecao nomeDaExcecao) {
    // Lidar com a exceção aqui
}
```

`basic-java-track/src/tratamentoExceçoes/SobreMim.java`

## HIERARQUIA DE EXCEÇÕES EM JAVA

A hierarquia de exceções em Java é dividida em dois grupos principais: "checked exceptions" (exceções verificadas) e "unchecked exceptions" (exceções não verificadas). Esta divisão ajuda os desenvolvedores a entender como lidar com diferentes tipos de exceções.

### Checked Exceptions (Exceções Verificadas):

- As "checked exceptions" são exceções que o compilador obriga o desenvolvedor a tratar de forma explícita.
- Elas herdam da classe `Exception` (ou suas subclasses) e não da classe `RuntimeException`.
- Quando você lança ou chama um método que pode gerar uma exceção verificada, você deve capturá-la usando um bloco `try-catch` ou declará-la no método atual usando a palavra-chave `throws`.
- Exemplos comuns de exceções verificadas incluem `IOException`, `SQLException` e `FileNotFoundException`.
- Essas exceções geralmente representam erros previsíveis, como problemas de E/S (entrada/saída) ou conexões de banco de dados, e exigem que o desenvolvedor tome medidas para tratá-las.

### Unchecked Exceptions (Exceções Não Verificadas):

- As "unchecked exceptions" são exceções que o compilador não exige que o desenvolvedor trate de forma explícita.
- Elas herdam da classe `RuntimeException` ou suas subclasses diretas.
- Não é necessário declarar ou capturar exceções não verificadas, embora seja uma boa prática fazê-lo quando apropriado.
- Exemplos de exceções não verificadas incluem `NullPointerException`, `ArrayIndexOutOfBoundsException` e `ArithmeticException`.
- Essas exceções geralmente indicam erros de programação mais sérios, como tentar acessar um objeto nulo ou realizar operações matemáticas inválidas.

Em resumo, a hierarquia de classes de exceções em Java é organizada em "checked exceptions" (exceções verificadas) e "unchecked exceptions" (exceções não verificadas). Essa estrutura ajuda a distinguir entre exceções que exigem tratamento explícito e exceções que indicam problemas de programação mais graves. Ambos os tipos de exceções são importantes para a escrita de código robusto e seguro.

## EXCEÇÕES CUSTOMIZADS

`Exceções customizadas`, também conhecidas como exceções personalizadas, são exceções que você cria em sua aplicação para representar erros específicos ao seu domínio ou para tornar a sinalização de erros mais significativa e descritiva. Elas estendem as classes de exceções existentes em Java, geralmente a classe `Exception` ou suas subclasses.
Passos para criar exceções personalizadas:

1. Crie uma nova classe que estenda `Exception` (ou suas subclasses, se necessário).
2. Lançar uma Exceção Personalizada.
3. Capturar e Tratar a Exceção.

Exceções personalizadas são úteis para melhorar a semântica do código, comunicar intenções, lidar com erros específicos do domínio e manter uma hierarquia de erros organizada.

`basic-java-track/src/tratamentoExceçoes/CepInvalidoException.java`
`basic-java-track/src/tratamentoExceçoes/FormatadorCep.java`
