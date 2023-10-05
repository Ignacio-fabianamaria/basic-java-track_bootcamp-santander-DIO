# Aprendendo a Sintaxe Java

## Tipos Primitivos em Java

Os tipos primitivos são os blocos de construção básicos para armazenar dados em Java. Eles representam valores simples e não possuem métodos ou propriedades. Aqui estão os principais tipos primitivos em Java:

<details>

<sumary>Tabela de Tipos Primitivos</sumary>

| Tipo Primitivo | Descrição                                           | Exemplo    |
|----------------|-----------------------------------------------------|------------|
| `byte`         | Representa valores inteiros de 8 bits.             | `byte idade = 25;` |
| `short`        | Representa valores inteiros de 16 bits.            | `short quantidade = 1000;` |
| `int`          | Representa valores inteiros de 32 bits.            | `int numero = 42;` |
| `long`         | Representa valores inteiros de 64 bits.            | `long populacaoMundial = 7_900_000_000L;` |
| `float`        | Representa números de ponto flutuante de precisão simples de 32 bits. | `float preco = 19.99f;` |
| `double`       | Representa números de ponto flutuante de precisão dupla de 64 bits. | `double pi = 3.14159265359;` |
| `char`         | Representa um único caractere Unicode de 16 bits.  | `char letra = 'A';` |
| `boolean`      | Representa um valor verdadeiro ou falso.           | `boolean estaChovendo = false;` |

Esses tipos primitivos são usados para representar dados simples, como números inteiros, números de ponto flutuante, caracteres e valores booleanos, em programas Java.

</details>

## Declaração de Variáveis em Java

Em Java, a declaração de variáveis é o processo de informar ao compilador qual tipo de dado a variável conterá e qual será o seu nome. É importante declarar as variáveis antes de usá-las em um programa. Aqui estão alguns exemplos de como declarar variáveis em Java:

<details>

<sumary>### Sintaxe Básica de Declaração de Variáveis</sumary>

```java
// Declarando uma variável int chamada 'idade'
int idade;

// Declarando uma variável double chamada 'preco'
double preco;

// Declarando uma variável String chamada 'nome'
String nome;
```

</details>

<details>

<sumary>### Tipos Float, Double e Long</sumary>

Neste tópico, discutiremos os tipos de dados numéricos `float`, `double` e `long`, cada um com suas próprias características distintas.

- **`float`**: É usado para representar números em ponto flutuante de precisão simples, com 32 bits. Para especificar um valor `float`, é importante incluir o sufixo "f" no final do número.

  Exemplo:

```c
  float meuFloat = 3.14159f;
  ```

- **`double`**: Similar ao `float`, mas com maior precisão, usando 64 bits. Não é necessário um sufixo especial para `double`.

  Exemplo:

  ```c
  double meuDouble = 3.14159265359;
  ```

- **`long`**: Utilizado para representar números inteiros longos, com precisão ilimitada (dependendo da plataforma, usa 32 ou 64 bits). Para especificar um valor `long`, é importante incluir o sufixo "L" no final do número.

  Exemplo:

  ```c
  long meuLong = 1234567890L;
  ```

</details>


### Variáveis vs. Constantes em Java

Em Java, variáveis e constantes são usadas para armazenar dados, mas com propósitos e comportamentos distintos.

<details>

<sumary>#### Variáveis</sumary>

- **Variáveis** podem armazenar dados mutáveis durante a execução do programa.
- Elas são declaradas usando palavras-chave como `int`, `double`, `String`, entre outras, seguidas pelo nome da variável.
- O valor de uma variável pode ser alterado usando atribuições.
- Exemplo:

  ```java
  int idade = 25; // Declaração de uma variável "idade" com valor inicial 25
  idade = 26;     // Alteração do valor da variável "idade" para 26
  ```

<details>

<details>

<sumary>#### Constante</sumary>

- Em Java, a declaração de constantes é feita usando a palavra-chave `final``.
- Em Java, a convenção comum para nomear constantes é usando letras maiúsculas. Isso torna mais fácil identificar rapidamente quais identificadores são constantes no código.
- O valor de uma constante não pode ser modificado após a atribuição inicial.

```java
final int TAMANHO_MAXIMO = 100;
final double TAXA_DE_JUROS = 0.05;
final String NOME_DA_EMPRESA = "Minha Empresa";
```

</details>

## Operadores

Nesta seção, abordaremos diversos tipos de operadores essenciais na programação:

- **Aritméticos:** Realizam cálculos matemáticos (+, -, *, /) em valores numéricos.
- **Unários:** Operam em um único valor, como incremento (++), decremento (--), e negação (-).
- **Relacionais:** Comparam valores para determinar igualdade (==), desigualdade (!=), maior que (>), menor que (<), maior ou igual (>=), e menor ou igual (<=).
- **Lógicos:** São usados para criar expressões condicionais complexas com operadores como E lógico (&&), OU lógico (||), e NÃO lógico (!).
- **Ternários:** Permite criar expressões condicionais de forma concisa em uma única linha.
- **Atribuição:** O operador de atribuição (=) é usado para atribuir valores a variáveis.

 **Observação:** O operador unário de negação (`!`) faz a negação de uma expressão booleana. Por exemplo, `!true` resulta em `false`.
**Observação:** Quando usado com strings, o operador `+` realiza a concatenação de texto. Por exemplo, `"Olá, " + "Mundo"` resultará em `"Olá, Mundo"`.

<details>

<sumary>A tabela a seguir resume os operadores mencionados:</sumary>

| Tipo           | Operador                  | Exemplo                 |
|----------------|---------------------------|-------------------------|
| Aritméticos    | +, -, *, /, %                 | `a + b`, `x * y`         |
| Unários        | ++, --, -, !                | `i++`, `-x`              |
| Relacionais    | ==, !=, >, <, >=, <=       | `a == b`, `x > y`        |
| Lógicos        | "&&", "||", "!"             | `x && y`, `!flag`         |
| Ternários      | ? :                       | `condition ? true : false`|
| Atribuição     | =                         | `x = 5`, `name = "John"` |

</details>