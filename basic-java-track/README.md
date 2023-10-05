# Aprendendo a Sintaxe Java

## Tipos Primitivos em Java

Os tipos primitivos são os blocos de construção básicos para armazenar dados em Java. Eles representam valores simples e não possuem métodos ou propriedades. Aqui estão os principais tipos primitivos em Java:

<details>

<summary>Tabela de Tipos Primitivos</summary>

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

<summary>Sintaxe Básica de Declaração de Variáveis</summary>

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

<summary>Tipos Float, Double e Long</summary>

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

<summary>Variáveis</summary>

- **Variáveis** podem armazenar dados mutáveis durante a execução do programa.
- Elas são declaradas usando palavras-chave como `int`, `double`, `String`, entre outras, seguidas pelo nome da variável.
- O valor de uma variável pode ser alterado usando atribuições.
- Exemplo:

  ```java
  int idade = 25; // Declaração de uma variável "idade" com valor inicial 25
  idade = 26;     // Alteração do valor da variável "idade" para 26
  ```

</details>

<details>

<summary>Constante</summary>

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

<summary>A tabela a seguir resume os operadores mencionados:</summary>

| Tipo           | Operador                  | Exemplo                 |
|----------------|---------------------------|-------------------------|
| Aritméticos    | +, -, *, /, %                 | `a + b`, `x * y`         |
| Unários        | ++, --, -, !                | `i++`, `-x`              |
| Relacionais    | ==, !=, >, <, >=, <=       | `a == b`, `x > y`        |
| Lógicos        | "&&", "||", "!"             | `x && y`, `!flag`         |
| Ternários      | ? :                       | `condition ? true : false`|
| Atribuição     | =                         | `x = 5`, `name = "John"` |

</details>

## Métodos

Métodos são blocos de código reutilizáveis em Java que desempenham um papel fundamental na organização e execução de funcionalidades em programas. Ao definir um método, é essencial considerar alguns aspectos essenciais:

- **Propósito Principal do Método:** Um método deve ter um propósito claro e bem definido. Ele é projetado para realizar uma tarefa específica dentro do programa.

- **Tipo de Retorno:** Cada método em Java possui um tipo de retorno, que indica o tipo de dado que o método devolverá como resultado após a sua execução. Pode ser um tipo primitivo, um objeto ou até mesmo `void`, indicando que o método não retorna nenhum valor.

- **Parâmetros:** Métodos podem aceitar parâmetros, que são valores ou referências necessárias para executar a operação desejada. Os parâmetros são especificados entre parênteses e podem ser opcionais ou múltiplos, dependendo da necessidade do método.

- **Visibilidade:** A visibilidade de um método é controlada por modificadores de acesso, como `public`, `private`, `protected` ou o padrão (sem modificador). A escolha da visibilidade determina quem pode acessar e chamar o método.

<details>
<summary>Critérios de nomeação dos métodos</summary>

Ao nomear métodos em Java, é importante seguir algumas convenções e critérios para tornar seu código mais legível e compreensível. Aqui estão algumas diretrizes gerais:

- **Convenção CamelCase:** O nome do método deve seguir a convenção CamelCase, onde a primeira palavra começa com letra minúscula e as palavras subsequentes começam com letra maiúscula. Por exemplo, `calcularSalario()`.

- **Nome Descritivo:** Escolha nomes descritivos que indiquem claramente a função do método. Evite nomes genéricos como `funcao()` ou `metodo1()`. Prefira nomes que descrevam o que o método faz, como `calcularMedia()` ou `enviarEmail()`.

- **Verbos:** Use verbos que descrevam a ação que o método executa. Isso ajuda a indicar o propósito do método. Por exemplo, use nomes como `calcular`, `salvar`, `enviar`, etc.

- **Evite Abreviações Obscuras:** Evite abreviações que não sejam facilmente compreensíveis. Use nomes completos e significativos.

- **Coerência:** Mantenha uma convenção de nomeação consistente em todo o seu código para facilitar a leitura e a manutenção.

- **Evite Nomes Excessivamente Longos:** Embora seja importante ser descritivo, evite nomes excessivamente longos que tornem o código difícil de ler. Encontre um equilíbrio entre clareza e concisão.

- **Use Nomes que Indiquem Retorno:** Se possível, escolha nomes que indiquem o que o método retorna. Por exemplo, um método que calcula o preço pode ser chamado de `calcularPreco()`.

- **Exemplos Adequados:**

  1. `calcularSalario()`: Um nome descritivo que indica claramente o propósito do método.
  2. `enviarEmail()`: Usando um verbo que descreve a ação realizada pelo método.
  3. `calcularMedia()`: Um nome que indica claramente a operação realizada.

- **Exemplos Não Adequados:**

  1. `fnc()`: Um nome genérico e abreviado que não descreve a função do método.
  2. `metodo1()`: Um nome genérico e sem significado.
  3. `xyz()`: Um nome curto e obscuro que não indica o propósito do método.
  4. `calculateValueBasedOnAgeAndIncomeAndLocationAnd...()`: Um nome excessivamente longo e difícil de ler.

</details>

### Exercitando os conceitos sobre métodos em JAVA

Criando um exemplo de uma classe para representar uma SmartTV

<details><summary>Requisitos:</summary>

 1. Deve possuir as seguintes características: ligada `(boolean)`, canal `(int)` e volume `(int)`.
 2. A TV poderá ligar e desligare assim mudar o seu `status`.
 3. A TV poderá aumentar ou diminuir o volume sempre em `+1 ou -1`.
 4. A TV poderá mudar de canal de 1 em 1 ou definindo diretamente pelo número.

</details>

## Escopo

Em programação, o escopo refere-se ao ambiente onde uma variável pode ser acessada e usada. Em Java, o escopo de variáveis é determinado pelo bloco onde ela foi declarada. Existem três principais tipos de escopo em Java:

- **Escopo de Classe**: Neste escopo, os atributos (variáveis) são declarados no corpo principal da classe e, portanto, são acessíveis por todos os métodos dentro da classe.
- **Escopo de Método**: Quando uma variável é declarada dentro de um método, o escopo dessa variável está limitado apenas ao corpo desse método. Isso significa que ela só pode ser usada dentro desse método específico e não está acessível em outros métodos da mesma classe.
- **Escopo de Fluxo**: Este escopo refere-se ao escopo de variáveis declaradas em estruturas de controle de fluxo, como loops e condicionais. Variáveis declaradas dentro de um bloco de código dentro de uma estrutura de controle de fluxo têm escopo limitado a esse bloco e não podem ser acessadas fora dele.

## Palavras Reservadas
