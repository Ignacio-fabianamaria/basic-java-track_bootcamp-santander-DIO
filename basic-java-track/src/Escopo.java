public class Escopo {
     // Escopo de classe: Atributo acessível por todos os métodos
     private int atributoClasse = 10;

     public void metodoUm() {
         // Escopo de método: Variável acessível apenas dentro deste método
         int variavelMetodo = 5;
         System.out.println("Dentro do métodoUm: atributoClasse = " + atributoClasse);
         System.out.println("Dentro do métodoUm: variavelMetodo = " + variavelMetodo);
     }
 
     public void metodoDois() {
         // Escopo de método: Outro método, mas não pode acessar variáveis locais de método de outro método
         // No entanto, pode acessar atributos de classe
         System.out.println("Dentro do métodoDois: atributoClasse = " + atributoClasse);
         // A linha abaixo geraria um erro de compilação, pois variavelMetodo não é acessível aqui
         // System.out.println("Dentro do métodoDois: variavelMetodo = " + variavelMetodo);
     }
 
     public static void main(String[] args) {
         Escopo exemplo = new Escopo();
         exemplo.metodoUm();
         exemplo.metodoDois();
 
         // A linha abaixo geraria um erro de compilação, pois variavelMetodo não é acessível aqui
         // System.out.println("Fora dos métodos: variavelMetodo = " + variavelMetodo);
     }
}
