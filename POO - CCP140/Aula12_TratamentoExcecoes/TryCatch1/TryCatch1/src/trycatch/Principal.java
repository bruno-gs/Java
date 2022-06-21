package trycatch;

import java.util.InputMismatchException;
import java.util.Scanner;


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
            System.out.println("Resultado da divisão: "+ resultado);
        }catch(ArithmeticException ex2) {
            System.err.printf("Exception: %s\n", ex2);
            System.err.println("Zero é um denominador invalido");
        }catch(InputMismatchException ex3) {
            System.err.printf("Exception: %s\n", ex3);
            System.err.println("Deveria entrar com número inteiro");
        }
        System.out.println("Terminando o programa");
    }
}
