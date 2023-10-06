# INTRODUÇÃO A ESTRUTURAS CONDICIONAIS EM JAVA

## CONDICIONAIS SINPMES

```java
public class CaixaEletronico {
    public static void main(String[] args){
        double saldo = 25.0;
        double valorSolicitado = 17.5;

        // Condicional Simples
        if(valorSolicitado < saldo){
            saldo = saldo - valorSolicitado;
            System.out.println("Resultado do fluxo simples: " + saldo);
        }
    }
}
```

## CONDICIONAIS COMPOSTA

```java
public class ResultadoEscolaar {
    public static void main(String[] args){
        int nota = 6;

        //Condicional Composto
        if(nota >=7){
            System.out.println("Aprovado");
        }else{
            System.out.println("Reprovado");
        }
    }
    
}
```

## CONDICIONAIS ENCADEADAS

```java
public class Boletim {
    public static void main(String[] args) {
        int nota = 6;

        // Condicional Encadeado
        if (nota >= 7)
            System.out.println("Aprovado");
        else if (nota >=5 && nota < 7)
            System.out.println("Recuperação"); 
        else
            System.out.println("Reprovado");

    }

}
```

## CONDIÇÃO TERNÁRIA

```java

public class Habilitação {
    public static void main(String[] main){
        int idade = 18;
        String resultado = (
            idade >=18 ? "Idade apropriada para ter habilitação" : "Menor de idade"
            );
        System.out.println(resultado);
    }
}
```

## CONDIÇÃO TERNÁRIA ENCADEADA

```java
public class VerificadorDeNumero {
    public static void main(String[] args){
        int numero = -1;
        String resultado = (numero >0) ? "Positivo" : (numero < 0) ? "Negativo" : "É zero !";
        System.out.println(resultado);
    }
}
```

## SWITCH CASE

```java
public class SistemaMedidas {
    public static void main(String[] args){
        String sigla = "M";

        switch(sigla){
            case "P":{
            System.out.println("PEQUENO");
            break;
        }
        case "M":{
            System.out.println("Médio");
            break;
        }
        case "G":{
            System.out.println("GRANDE");
            break;
        }
        default:
        System.out.println("INDEFINIDO");
    }
    }
}
```