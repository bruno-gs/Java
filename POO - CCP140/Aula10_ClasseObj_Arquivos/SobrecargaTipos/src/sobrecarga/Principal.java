package sobrecarga;
/**
 *
 * @author Isaac
 */
public class Principal {
    public static void main(String[] args) {
        // TODO code application logic here
        Sobrecarga objeto = new Sobrecarga();
        System.out.println("Metodo utilizado: " + objeto.tipos("exemplo", "aula"));
        System.out.println("Metodo utilizado: " + objeto.tipos(2.51, 7.82));
        System.out.println("Metodo utilizado: " + objeto.tipos("exemplo", 7.82));
        System.out.println("Metodo utilizado: " + objeto.tipos(2.51, "aula"));
        System.out.println("Metodo utilizado: " + objeto.tipos(10, 4));
    }
}



