/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package verifica_idade_throw;

import javax.swing.JOptionPane;

/**
 *
 * @author uniebrunosil
 */
public class main {
    
    public static boolean verificaIdade(int idade) throws Exception{
        if(idade<18){
            throw new Exception("Idade menor que 18, não permitido");
        }
        return false;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade"));
        
        try{
            verificaIdade(idade);
        }catch(Exception ex){
            System.out.println("Mensagem: " + ex.getMessage());
        }
    }
    
}
