package clientes;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
/**
 *
 * @author ilidio
 */
public class main {

    public static void main(String[] args) {
        DateTimeFormatter dtf4 = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
        //System.out.println("dd-MM-yyyy HH:mm-> "+dtf4.format(LocalDateTime.now()));
        System.out.println("Data: "+dtf4.format(LocalDateTime.now()));
    }
    
}
