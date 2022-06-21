/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classeobject;

public class Principal {
    public static void main(String[] args) {
        A classe1 = new A();
        System.out.println("===================================");
        B classe2 = new B();
        System.out.println("===================================");
        System.out.println("getClass() da A: " + classe1.getClass());
        System.out.println("getClass() da B: " + classe2.getClass());
        System.out.println("===================================");
        B classe3 = (B) classe2.clone();
        System.out.println("Objeto classe3 é clone da classe2? "+ classe3.equals(classe2));
        System.out.println("===================================");
        System.out.println("toString da classe1: " + classe1.toString());
        System.out.println("toString da classe2: " + classe2.toString());
        System.out.println("===================================");
        System.out.println("Objeto classe1 é igual a classe2 ? " + classe2.equals(classe1));
        System.out.println("Objeto classe1 é igual a classe1 ? " + classe1.equals(classe1));
        System.out.println("Objeto classe2 é igual a classe3 ? " + classe2.equals(classe3));
        System.out.println("===================================");
        System.out.println("Hash code da classe1: "+classe1.hashCode());
        System.out.println("Hash code da classe2: "+classe2.hashCode());
        System.out.println("Hash code da classe3: "+classe3.hashCode());
        System.out.println("===================================");
    }
}
