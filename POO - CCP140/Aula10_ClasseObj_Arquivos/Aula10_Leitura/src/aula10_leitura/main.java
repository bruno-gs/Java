/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula10_leitura;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author uniebrunosil
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
            FileReader arquivo = new FileReader("impares.txt");
            BufferedReader br = new BufferedReader(arquivo);
            
            ArrayList<String> impares = new ArrayList();
            String str;
            while((str=br.readLine())!=null)
                impares.add(str);
            System.out.println(impares);            
        }catch(IOException e){
            
        }
    }
    
}
