/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex2;

/**
 *
 * @author uniebrunosil
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // instância do objeto
        Conta conta01 =  new Conta();
        
        // conta 01
        conta01.setNome("Bruno Silva");
        conta01.setNumero(191919);
        conta01.setSaldo(10000);
        conta01.setLimite(8000);
        
        
        
        System.out.println("O cliente,"+conta01.getNome()+" com numero da conta:" +conta01.getNumero());
        System.out.println("O saldo presente na conta é: R$"+conta01.getSaldo());
        System.out.println("E seu limte é: R$"+conta01.getLimite());
        
        // creditando qualquer valor
        System.out.println(" + O seu salário: R$ 2000,00");
        conta01.creditarSaldo(2000);
        System.out.println("Seu saldo atual é R$"+conta01.getSaldo());
        
        // debitando valor abaixo do saldo
        System.out.println(" - Despesa de matrícula: R$ 2000,00");
        conta01.debitarSaldo(2000);
        System.out.println("Seu saldo atual é R$"+conta01.getSaldo());
        
        // debitar valor muito acima do saldo
        System.out.println(" - Sua Mercedes bateu: R$ 20000,00");
        conta01.debitarSaldo(20000);
        System.out.println("Seu saldo atual é R$"+conta01.getSaldo());
        
       
    }
    
}