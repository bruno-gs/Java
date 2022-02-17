/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package media_ex1;
import java.util.Scanner; // importando a bib de input


/**
 *
 * @author uniebrunosil
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // valores das provas
        Scanner input = new Scanner(System.in);
        
        System.out.printf("Digite a nota da P1: ");
        float P1 = input.nextFloat();
        System.out.printf("Digite a nota da P2: ");
        float P2 = input.nextFloat();
        System.out.printf("Digite a nota da P3: ");
        float P3 = input.nextFloat();
       
        float media = (P1 + (P2 * 2) + (P3*3))/6;
       
        String situacao = media >= 5 ? "Aprovado" : "Reprovado";
        
        System.out.printf("Situação: %s, com %.2f de média!\n", situacao, media);
    }
    
}
