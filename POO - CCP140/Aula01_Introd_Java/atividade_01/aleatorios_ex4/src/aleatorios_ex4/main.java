/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aleatorios_ex4;
import java.util.Scanner; // importando a bib de input
//import java.lang.Math; // importando a bib de matematica
import java.util.Random; // importando a bib do Random 

/**
 *
 * @author uniebrunosil
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random ran = new Random();
        int maior = -1;
        int vezes = 0;
        
        for (int x=0; x<=100; x += 1){
            int num = ran.nextInt(101);
            if(num > maior){
                maior = num;
                vezes = 1;
            }
            else if(num == maior){
                vezes += 1;
            }
            else{
                continue;
            }
        }
        
        System.out.printf("O maior valor foi %d e se repetiu %d vezes \n", maior, vezes);
        
    }
    
}
