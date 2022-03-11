/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex1;

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
        
        Conta conta02;
        conta02 = new Conta();
        Conta conta03;
        conta03 = new Conta();
        
        // conta 01
        conta01.nome = "Bruno Silva";
        conta01.numero = 19191919;
        conta01.saldo = 10000;
        conta01.limite = 8000;
        
        // conta 02
        conta02.nome = "Vini ";
        conta02.numero = 5191919;
        conta02.saldo = 55000;
        conta02.limite = 50000;
        
        // conta 03
        conta03.nome = "Dani";
        conta03.numero = 951915161;
        conta03.saldo = 10000;
        conta03.limite = 8888888;
        
        System.out.println("O cliente,"+conta01.nome+" com numero da conta:" +conta01.numero);
        System.out.println("O saldo presente na conta é: R$"+conta01.saldo);
        System.out.println("E seu limte é: R$"+conta01.limite);
        
        // creditando qualquer valor
        System.out.println(conta01.nome+" seu saldo presente na conta é: R$"+conta01.saldo);
        System.out.println(" + O seu salário: R$ 2000,00");
        conta01.creditarSaldo(2000);
        System.out.println("Seu saldo atual é R$"+conta01.saldo);
        
        // debitando valor abaixo do saldo
        System.out.println(" - Despesa de matrícula: R$ 2000,00");
        conta01.debitarSaldo(2000);
        System.out.println("Seu saldo atual é R$"+conta01.saldo);
        
        // debitar valor muito acima do saldo
        System.out.println(" - Sua Mercedes bateu: R$ 20000,00");
        conta01.debitarSaldo(20000);
        System.out.println("Seu saldo atual é R$"+conta01.saldo);
        
        // debitando e creditando de objetos diferentes
        
        conta02.debitarSaldo(5000);
        conta03.debitarSaldo(8000);
        conta01.debitarSaldo(12000);
        
        
        
        
        System.out.println("O cliente,"+conta01.nome+" com numero da conta:" +conta01.numero);
        System.out.println("O saldo presente na conta é: R$"+conta01.saldo);
        System.out.println("E seu limte é: R$"+conta01.limite);
        System.out.println("O cliente,"+conta02.nome+" com numero da conta:" +conta02.numero);
        System.out.println("O saldo presente na conta é: R$"+conta02.saldo);
        System.out.println("E seu limte é: R$"+conta02.limite);
        System.out.println("O cliente,"+conta03.nome+" com numero da conta:" +conta03.numero);
        System.out.println("O saldo presente na conta é: R$"+conta03.saldo);
        System.out.println("E seu limte é: R$"+conta03.limite);
    }
    
}
