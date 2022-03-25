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
public class Robot {
    // Atributos
    private double positionX;
    private double positionY;
    private double direction;
    private String name;
    
    // Métodos -- Publicos usa no main
    public void moveForward(){
        positionX += 1;
        System.out.println("Moveu para frente");
    }
    public void moveBackward(){
        System.out.println("Voltou para a defesa");
    }
    
    public double getPositionX(){
        return positionX;
    }
        
    public void setName(String name){
        // tipo o self
        this.name = name;
    }
    public String getName(){
        return name;
    }
}
