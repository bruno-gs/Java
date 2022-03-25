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
public class Conta {
    public int numero;
    public String nome;
    public double saldo;
    public double limite;
    
    public boolean debitarSaldo(double quantidade) {
        if(quantidade > this.saldo){
            System.out.println("Saldo Indisponível");
            return false;
        } 
        else {
            System.out.println("Saldo será debitado.");
            this.saldo -= quantidade;
            return true;
        }
    }
    
    public void creditarSaldo(double quantidade) {
        this.saldo += quantidade;
    }
}

