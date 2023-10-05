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

## Palavras Reservadas em Java

As palavras reservadas em Java são termos especiais que têm significados específicos na linguagem de programação Java. Elas não podem ser usadas como identificadores (nomes de variáveis, classes, métodos, etc.) em seu código Java, pois são reservadas para fins específicos.

<details>
<summary>Tabela com as palavras reservadas em JAVA</summary>

| Palavra Reservada | Descrição                                     |
|-------------------|-----------------------------------------------|
| `abstract`        | Usado para declarar classes abstratas e métodos abstratos. |
| `assert`          | Usado para testes de asserção (não recomendado para uso geral). |
| `boolean`         | Representa um tipo de dado booleano com valores `true` ou `false`. |
| `break`           | Usado para sair de loops `for`, `while`, ou `do-while`. |
| `byte`            | Representa um tipo de dado de 8 bits com valores entre -128 e 127. |
| `case`            | Usado em declarações `switch` para identificar ramos de código. |
| `catch`           | Captura exceções em blocos `try-catch`. |
| `char`            | Representa um tipo de dado de caractere Unicode de 16 bits. |
| `class`           | Define uma classe em Java. |
| `const`           | Não utilizado em Java (reservado para uso futuro). |
| `continue`        | Usado para continuar com a próxima iteração de loops `for`, `while`, ou `do-while`. |
| `default`         | Usado em declarações `switch` como um caso padrão quando nenhum outro caso corresponde. |
| `do`              | Inicia um loop `do-while`. |
| `double`          | Representa um tipo de dado de ponto flutuante de 64 bits. |
| `else`            | Usado em condicionais `if-else`. |
| `enum`            | Define um tipo enumerado. |
| `extends`         | Indica uma herança de classe. |
| `final`           | Usado para declarar que uma classe, método ou variável não pode ser estendida, substituída ou modificada. |
| `finally`         | Usado em blocos `try-finally` para garantir a execução de código. |
| `float`           | Representa um tipo de dado de ponto flutuante de 32 bits. |
| `for`             | Inicia um loop `for`. |
| `if`              | Inicia uma condicional `if`. |
| `implements`      | Indica que uma classe deve implementar uma interface. |
| `import`          | Importa classes ou pacotes para uso no código. |
| `instanceof`      | Verifica se um objeto é uma instância de uma classe. |
| `int`             | Representa um tipo de dado de inteiro de 32 bits. |
| `interface`       | Define uma interface. |
| `long`            | Representa um tipo de dado de inteiro longo de 64 bits. |
| `native`          | Indica que um método é implementado em código nativo (geralmente C/C++). |
| `new`             | Cria uma nova instância de uma classe ou um array. |
| `null`            | Representa uma referência nula. |
| `package`         | Define um pacote de classes. |
| `private`         | Indica que um membro de classe é acessível apenas dentro da própria classe. |
| `protected`       | Indica que um membro de classe é acessível dentro da própria classe e suas subclasses. |
| `public`          | Indica que um membro de classe é acessível de qualquer lugar. |
| `return`          | Retorna um valor de um método. |
| `short`           | Representa um tipo de dado de inteiro curto de 16 bits. |
| `static`          | Indica que um membro de classe pertence à classe, não a instâncias individuais. |
| `strictfp`        | Indica que um método segue as regras de ponto flutuante estritas. |
| `super`           | Chama um método da classe pai ou acessa um construtor da classe pai. |
| `switch`          | Inicia uma declaração `switch` para seleção múltipla. |
| `synchronized`    | Sincroniza threads para acesso seguro a recursos compartilhados. |
| `this`            | Referência à instância atual de uma classe. |
| `throw`           | Lança uma exceção. |
| `throws`          | Declara exceções que podem ser lançadas por um método. |
| `transient`       | Indica que um campo de classe não deve ser serializado. |
| `try`             | Inicia um bloco `try` para tratamento de exceções. |
| `void`            | Indica que um método não retorna um valor. |
| `volatile`        | Indica que um campo de classe pode ser modificado por várias threads. |
| `while`           | Inicia um loop `while`. |

</details>

## Javadoc: Documentação em Java

O Javadoc é uma ferramenta essencial no desenvolvimento Java que permite a geração automática de documentação a partir de comentários no código-fonte. Essa documentação é incrivelmente valiosa para descrever classes, métodos, campos e outros elementos do código, além de fornecer informações detalhadas sobre como utilizar corretamente o seu código.

<details>
<summary>Vantagens do Javadoc</summary>

Uma das principais vantagens do Javadoc é a capacidade de criar facilmente documentação legível em formato HTML a partir dos comentários do código-fonte. Essa documentação resultante pode ser acessada por meio de um navegador da web, tornando-a acessível a toda a equipe de desenvolvimento e a outros interessados.
</details>

<details>
<summary>Criando Documentação com Javadoc</summary>

Em Java, a documentação JavaDoc é uma parte essencial para criar documentação legível e compreensível do seu código. Ela é composta por tanto **tags** quanto **comentários** no formato JavaDoc.

### Tags JavaDoc

As **tags JavaDoc** são elementos especiais inseridos nos comentários JavaDoc para fornecer informações estruturadas sobre as classes, métodos, campos e outros elementos do código. Aqui estão algumas tags JavaDoc comuns:

- `@param`: Usada para descrever um parâmetro de um método. Informa o nome do parâmetro e sua finalidade.
- `@return`: Usada para descrever o valor de retorno de um método, indicando o significado do valor retornado.
- `@throws`: Usada para documentar as exceções que um método pode lançar, indicando os tipos de exceção e suas razões.
- `@see`: Usada para criar links para outras classes, métodos ou recursos relacionados, permitindo uma referência rápida.
- `@version`: Usada para especificar a versão da classe ou do método.
- `@author`: Usada para especificar o autor ou autores do código.

### Comentários JavaDoc

Os **comentários JavaDoc** são blocos de comentários especiais que começam com `/**` e terminam com `*/`. Eles fornecem uma descrição detalhada de uma classe, método ou atributo, incluindo informações sobre seu propósito, funcionamento e uso adequado.

Aqui está um exemplo de um comentário JavaDoc para um método:

```java
/**
 * Este método realiza a soma de dois números inteiros.
 *
 * @param a O primeiro número a ser somado.
 * @param b O segundo número a ser somado.
 * @return O resultado da soma de a e b.
 * @throws IllegalArgumentException Se a ou b forem negativos.
 */
public int somar(int a, int b) {
    if (a < 0 || b < 0) {
        throw new IllegalArgumentException("Os números não podem ser negativos.");
    }
    return a + b;
}

```

### Gerando o JavaDoc

Para gerar a documentação JavaDoc para seu projeto, siga estas etapas:

1. **Navegue até o Diretório Raiz do Projeto**: Abra um terminal ou prompt de comando e navegue até o diretório raiz do seu projeto, onde os arquivos-fonte (`.java`) estão localizados.

2. **Execute o Comando JavaDoc**: Utilize o seguinte comando para gerar a documentação:

   ```bash
   javadoc -encoding UTF-8 -docencoding ISO-8859-1 -d ../docs src/*.java
   ```

Após a conclusão do comando javadoc, a documentação JavaDoc será gerada no diretório de saída especificado (por exemplo, "docs"). Abra este diretório para visualizar os arquivos HTML com a documentação.

</details>