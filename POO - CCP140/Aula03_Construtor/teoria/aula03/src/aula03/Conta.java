
package aula03;

public class Conta {
    private int numero;
    private String nome;
    private double saldo;
    
    // criando construtor
    public Conta(int numero){
        this.numero = numero;
    }
    
    public Conta(int numero, String nome){
        this.numero = numero;
        this.nome = nome;
    }
    
    public Conta(int numero, String nome, double saldo){
        this.numero = numero;
        this.nome = nome;
        this.saldo = saldo;
    }
    
    // definindo os get
    public int getNumero(){
        return this.numero;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public double getSaldo(){
        return this.saldo;
    }
    
    // set para nome
    public void setNome(String nome){
        this.nome = nome;
    }
    
    // quando pede pra imprimir o objeto
        // irá mostrar a String  
    @Override
    public String toString(){
        return "Nome: " + this.nome + "| Número: " + this.numero + "| Saldo: " + this.saldo;
    }
}
