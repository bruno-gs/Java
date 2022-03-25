package exemplo_aula;
public class main {

    public static void main(String[] args) {
        int array[] = {11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        
        //System.out.println("Index Valor");
        
        //for(int count=0; count<array.length; count++){
            //System.out.printf("%4d%5d\n",count,array[count]);
        //}
        
        //int[] array = {11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        for (int i : array){
            System.out.println(i);
        }
    }
    
}
