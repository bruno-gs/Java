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
public class Conta {
    private int numero;
    private String nome;
    private double saldo;
    private double limite;
    
    public void setNumero(int numero){
        // tipo o self
        this.numero = numero;
    }
    public double getNumero(){
        return numero;
    }
    
    public void setNome(String nome){
        // tipo o self
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }
    
    
    public void setSaldo(double saldo){
        // tipo o self
        this.saldo = saldo;
    }
    public double getSaldo(){
        return saldo;
    }
    
    public void setLimite(double limite){
        // tipo o self
        this.limite = limite;
    }
    public double getLimite(){
        return limite;
    }
    
        
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
