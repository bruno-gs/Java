package exemplo_pessoa;

import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ArrayList <Pessoa> p = new ArrayList<>();
        
        p.add(new Pessoa("Ju", 23));
        p.add(new Pessoa("Bru", 21));
        p.add(new Pessoa("Gio", 15));
        
        for(int i=0; i<p.size(); i++){
            System.out.println("Nome: "+p.get(i).getNome());
            System.out.println("Idade: "+p.get(i).getIdade());
            System.out.println();
        }
    }
}
