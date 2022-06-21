package trycatch;

import java.util.Scanner;

public class Principal {
    public static int divisao (int numerador, int denominador) throws ArithmeticException{
        return numerador / denominador;
    }
  
    public static void main(String[] args)  {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        try {
            int numerador = 5;
            System.out.println("Digite um número inteiro:");
            int denominador = teclado.nextInt();
            int resultado = divisao(numerador, denominador);
            System.out.println("Resultado da divisão: "+ resultado);
        }catch(ArithmeticException ex) {
            System.err.printf("Exception: %s\n", ex);
            System.err.println("Zero é um denominador invalido");
        } finally {
            System.out.println("Essa linha de código sempre será executada");
        }
        System.out.println("Terminando o programa");
    }
}

/*
public class Principal {
    public static int divisao(int numerador, int denominador){
        return numerador / denominador;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            int resultado = divisao(5, 1);
            System.err.println("Resultado da divisão: "+ resultado);
        }catch(ArithmeticException ex) {
            System.err.printf("Exception: %s\n", ex);
            System.err.println("Zero é um denominador invalido");
        } finally {
            System.err.println("Essa linha de código sempre será executada");
        }
    }
}
*/

/*
public class Principal {
    public static int divisao(int numerador, int denominador){
        return numerador / denominador;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        try {
            int numerador = 5;
            System.out.println("Digite um número inteiro:");
            int denominador = teclado.nextInt();
            int resultado = divisao(numerador, denominador);
            System.err.println("Resultado da divisão: "+ resultado);
        }catch(InputMismatchException ex1) {
            System.err.printf("Exception: %s\n", ex1);
            System.err.println("Você deveria entrar com um número inteiro");
        }catch(ArithmeticException ex2) {
            System.err.printf("Exception: %s\n", ex2);
            System.err.println("Zero é um denominador invalido");
        }
    }
}
*/
