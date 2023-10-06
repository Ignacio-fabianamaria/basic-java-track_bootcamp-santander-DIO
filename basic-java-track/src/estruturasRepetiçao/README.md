# ESTRUTURA DE REPETIÇÃO EM JAVA

As estruturas de repetição em Java permitem que você execute um bloco de código várias vezes com base em uma condição específica. Elas são usadas para automatizar tarefas repetitivas e facilitar a manipulação de coleções de dados.
Laços ou repetições são representados pelas seguintes estruturas:

- For
- While
- Do While

## FOR

O loop "for" é usado quando você sabe antecipadamente quantas vezes deseja repetir um bloco de código. Ele possui uma variável de controle, uma condição de parada e uma atualização dessa variável.
A sintaze do `For` é :

```java
for (inicialização; condição; atualização){
    //Bloco de código a ser repetido
}
```

`basic-java-track/src/estruturasRepetiçao/Tabuada.java`

## Foreach

O `foreach` em Java é uma construção de loop que permite iterar facilmente por uma coleção de elementos.
sintaxe básica do "foreach" em Java:

```java
for (tipo elemento : colecao) {
    // Código para processar o elemento
}
```

## While

O `while`` é uma estrutura de controle de repetição em Java que permite que um bloco de código seja executado repetidamente enquanto uma condição específica for verdadeira.
sintaxe básica do while em Java:

```java
while (condicao) {
    // Bloco de código a ser repetido
}
```

`basic-java-track/src/estruturasRepetiçao/CarrinhoCompras.java`

## Do While

A estrutura de controle `do-while` em Java é uma variação do loop while, mas com uma diferença importante: no `do-while`, o bloco de código é executado pelo menos uma vez, independentemente da condição ser verdadeira ou falsa. A verificação da condição ocorre após a primeira execução do bloco de código.
A sintaxe básica do do-while é a seguinte:

```java
do {
    // Bloco de código a ser repetido
} while (condição);

```

`basic-java-track/src/estruturasRepetiçao/Telefonando.java`