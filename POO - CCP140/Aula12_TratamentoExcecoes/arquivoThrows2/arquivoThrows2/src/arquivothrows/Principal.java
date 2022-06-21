/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arquivothrows;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author ISAACJESUSDASILVA
 */
public class Principal {

    /**
     * @return 
     * @throws java.io.IOException
     */
    public static ArrayList leArquivo()  throws IOException  {
            FileReader arquivo = new FileReader("impares.txt");
            BufferedReader br = new BufferedReader(arquivo);

            ArrayList<String> impares = new ArrayList<>();
            String str;
            while((str = br.readLine()) != null)
                impares.add(str);
            return impares;
    }
    
    public static void main(String[] args) throws IOException {
            ArrayList<String> lista = leArquivo();
            System.out.println(lista);
    }
}

