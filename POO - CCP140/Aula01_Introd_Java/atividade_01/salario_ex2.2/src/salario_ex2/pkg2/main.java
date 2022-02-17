/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salario_ex2.pkg2;
import java.util.Scanner; // importando a bib de input


/*
Faça um programa que pergunte 
    quanto você ganha por hora 
    e o número de horas trabalhadas no mês 
    
    calcule e mostre o total do seu salário no referido mês, 
    sabendo-se que são descontados 
        11% para o Imposto de Renda, 
        8% para o INSS 
        e 5% para o sindicato, 

    faça um programa que nos dê:
        o O salário bruto.
        o Quanto pagou ao INSS.
        o Quanto pagou ao sindicato.
        o O salário líquido.
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
        
        System.out.printf("Digite seu salário por hora: ");
        float sal_hora = input.nextFloat();
        System.out.printf("Digite quantas horas trabalhadas no mês: ");
        int horas = input.nextInt();
        
        float sal_mensal = sal_hora * horas;
        
        System.out.printf("Seu salário bruto: %.2f \n", sal_mensal);
        System.out.printf("Quanto foi pago ao INSS: %.2f \n", (sal_mensal * 0.08));
        System.out.printf("Quanto foi pago ao sindicado: %.2f \n", (sal_mensal * 0.05));
        System.out.printf("Seu salário líquido: %.2f \n", (sal_mensal - (sal_mensal * 0.05) - (sal_mensal * 0.08) - (sal_mensal * 0.11)));
    
    }
    
}
