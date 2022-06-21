/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exemplointerfaces;

/**
 *
 * @author ISAACJESUSDASILVA
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Animal peixe = new Peixe();
        Animal sapo = new Sapo();
        Animal passaro = new Passaro();
     
        peixe.move();
        sapo.move();
        passaro.move();
    }
    
}
