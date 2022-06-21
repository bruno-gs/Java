/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula10_arquivosescrita;

import java.io.FileWriter;
import java.io.PrintWriter;

/**
 *
 * @author uniebrunosil
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{
            FileWriter arquivo = new FileWriter("impares.txt",true);
            PrintWriter escritaArquivo = new PrintWriter(arquivo);
            
            for(int i=1; i<10000; i++){
                if(i%2!=0){
                    escritaArquivo.println(i);
                }
            }
            arquivo.close();
            
        }catch(Exception e){
            
        }
    }
    
}
