/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package media_num;
import java.util.Scanner; // importando a bib de input

/*
Escreva um programa que leia números digitados pelo usuário. 
O programa deve ler os números até que 0 (zero) seja digitado.
Quando 0 for digitado, o programa deve 
    exibir a quantidade de dígitos que foram digitados, 
    a somatória destes dígitos 
    e a média aritmética.

*/

/**
 *
 * @author uniebrunosil
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float somatoria = 0;
        int quantidade = 0;
        float numero;
        do{
            System.out.printf("Digite um número para a média: ");
            numero = input.nextFloat();
            somatoria += numero;
            quantidade += 1;
            
        }while(numero != 0);
        
        System.out.printf("A quantidade de numeros digitados foi: %d \n", quantidade - 1);
        System.out.printf("A somatoria dos numeros foi: %.2f \n", somatoria);
        System.out.printf("A media aritmetica foi: %.2f \n", somatoria / (quantidade - 1));
    }
    
}
