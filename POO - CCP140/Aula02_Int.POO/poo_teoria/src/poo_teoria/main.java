/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo_teoria;

/**
 *
 * @author uniebrunosil
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // declaração do objeto
        Robot b1;
        
        // instância do objeto
        b1 = new Robot();
        Robot b2 = new Robot();
        b1.setName("B1");
        
        //System.out.println("B1 posX: " + b1.PositionX);
        
        System.out.println("B1 posX: " + b1.getPositionX());
        System.out.println("B1 posX: " + b2.getPositionX());
        
        // chamando um método
        b1.moveForward();
        b1.moveForward();
        
        System.out.println("B1 posX: " + b1.getPositionX());
        
        // B2 é um novo robo 
        System.out.println("B2 posX: " + b2.getPositionX());
        System.out.println(b1.getName());
        
    }
    
}
