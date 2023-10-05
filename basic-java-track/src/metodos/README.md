# Mini Projeto Smart TV em Java

Este é um mini projeto em Java que simula funcionalidades básicas de uma Smart TV.

## Classe `SmartTv`

A classe `SmartTv` possui os seguintes métodos e atributos:

### Atributos:

- `boolean ligada`: Indica se a TV está ligada (true) ou desligada (false).
- `int canal`: Armazena o canal atual da TV.
- `int volume`: Armazena o volume atual da TV.

### Métodos:

- `ligar()`: Liga a TV.
- `desligar()`: Desliga a TV.
- `aumentarVolume()`: Aumenta o volume da TV e exibe a alteração no console.
- `diminuirVolume()`: Diminui o volume da TV e exibe a alteração no console.
- `mudarCanal(int novoCanal)`: Muda o canal da TV para o valor especificado e exibe o novo canal no console.
- `aumentarCanal()`: Aumenta o canal da TV e exibe o novo canal no console.
- `diminuirCanal()`: Diminui o canal da TV e exibe o novo canal no console.

## Classe `Usuario`

A classe `Usuario` simula a interação de um usuário com a Smart TV. Ela utiliza a classe `SmartTv` para demonstrar as funcionalidades da TV.

### Métodos da Classe `Usuario`:

- `main(String[] args)`: O método principal que cria uma instância de `SmartTv` e demonstra as funcionalidades da TV no console.

- **Exemplo de Saída**

```java

________Exibindo o Status da SmartTv________
Status da TV: false
Canal atual da TV: 1
Volume atual da TV: 25

________Ligando e desligando a SmartTv________
Ligando a TV :true
Desligando a TV: false
Ligando a TV :true

________Aumentando e diminuindo o volume da SmartTv________
Aumentando o volume para : 26
Aumentando o volume para : 27
Dimunuindo o volume para : 26

________Alterando o canal da SmartTv________
Canal atual: 1
Aumentando de canal: 2
Dimunuindo de canal: 1
Mudando para o canal: 4

```
