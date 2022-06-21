package calculos;
/**
 *
 * @author Isaac
 */
public class Principal {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double[]  numeros = {1,1,1,1,1,1,1};
        Calculos calc = new Calculos();
        System.out.println("Soma sem argumentos: "  + calc.soma());
        System.out.println("Soma com 2 argumentos: "+ calc.soma(2,2));
        System.out.println("Soma com 3 argumentos: "+ calc.soma(4,4,4));
        System.out.println("Soma com arrays: "+ calc.soma(numeros)); 
    }
}


