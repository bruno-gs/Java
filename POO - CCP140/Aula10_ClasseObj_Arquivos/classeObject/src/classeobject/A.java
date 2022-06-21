/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classeobject;

/**
 *
 * @author ISAACJESUSDASILVA
 */

public class A {
    public A(){
        System.out.println("Construtor da classe A, super classe");
    }
    
    @Override
    public Object clone() {
        return this;
    }
}
