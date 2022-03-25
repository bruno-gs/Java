
package aula03;

public class main {

    public static void main(String[] args) {
        // construtor inicia quando se instancia 
        Conta conta01 = new Conta(1001);
        Conta conta02 = new Conta(1002, "Bruno");
        Conta conta03 = new Conta(1003, "Ju", 2000);
        
        System.out.println("=============== CONTA 01 ===============");
        System.out.println(conta01);    
        System.out.println("=============== CONTA 02 ===============");
        System.out.println(conta02);  
        System.out.println("=============== CONTA 03 ===============");
        System.out.println(conta03);   
        
    }
    
}
