
package exercicio;
import java.util.ArrayList;
import java.util.Scanner; // importa a bib de entrada e a classe

public class main {

    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>();
       
        // define input para usar os métodos
        Scanner input = new Scanner(System.in);
        
        // laço para a digitação de valores
        for(int num=0; num<10;num++){
            System.out.printf("Digite o %d° numero: ",num+1);
            array.add(input.nextInt());
        }
        
        // laço de conferência de dados
        //for (int i : array){
        //    System.out.println(i);
        //}
        
        // definição e laço para ver qual o maior digitado
        int maior = array.get(0);
        for (int valor : array){
            if(valor > maior){
                maior = valor;
            }
        }
        
        System.out.println("O maior número digitado é o "+maior);
    }
}
